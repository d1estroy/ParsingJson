package batterfeed;

import batterfeed.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Batterfeed", 100, 50, 80);
        player1.inventory.add(new Item(ItemType.POTION, "Potion Of Healing"));
        player1.inventory.add(new Item(ItemType.PICKAXE, "Stone Pickaxe"));

        Player player2 = new Player("D1estroy", 100, 50, 80);
        player2.inventory.add(new Item(ItemType.FOOD, "Golden Apple"));
        player2.inventory.add(new Item(ItemType.AXE, "Iton Axe"));



        toJson(player1);
        toJson(player2);
        Player player3 = playerFromJson("Batterfeed");
        System.out.println(player3.getMaxHealth());

    }

    public static void toJson(Object object) {
        try(FileWriter fw = new FileWriter("src/batterfeed/serialized/" + object.toString() + ".json");){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            fw.write(gson.toJson(object));
        } catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static Player playerFromJson(String fileName){
        try(FileReader fr = new FileReader("src/batterfeed/serialized/" + fileName + ".json");){
            Gson gson = new Gson();
            Player res = gson.fromJson(fr, Player.class);
            return res;
        } catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
        return null;
    }
}