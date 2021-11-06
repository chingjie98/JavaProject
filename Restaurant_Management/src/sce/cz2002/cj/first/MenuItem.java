package sce.cz2002.cj.first;

enum MenuType { SET, ALACARTE };

public abstract class MenuItem {
    protected MenuType type;
    protected String name, description;
    protected int price;

    public MenuItem(MenuType type, String name, String description, int price) {
        this.type = type;
        this.name = name;
        this.description= description;
        this.price = price;
    }

    public abstract void DisplayItem();

    public MenuType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
