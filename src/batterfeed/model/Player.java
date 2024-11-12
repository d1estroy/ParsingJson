package batterfeed.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Player {
    @SerializedName("name")
    public final String NAME;
    private int maxHealth;
    private int maxMana;

    public int getMaxPower() {
        return maxPower;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    private int maxPower;

    public List<Item> inventory;

    public Player(String name, int maxHealth, int maxMana, int maxPower) {
        NAME = name;
        this.maxHealth = maxHealth;
        this.maxMana = maxMana;
        this.maxPower = maxPower;

        inventory = new ArrayList<Item>();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
