package batterfeed.model;

import com.google.gson.annotations.SerializedName;

public class Item {
    @SerializedName("type")
    private final ItemType TYPE;
    private String name;

    public Item(ItemType type, String name) {
        TYPE = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
