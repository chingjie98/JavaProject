package sce.cz2002.cj.first;

import java.awt.*;

enum FoodType {MainCourse, Drinks, Desert};

public class AlaCarteItem extends MenuItem {
    private FoodType foodType;

    public AlaCarteItem(String name, String description, int price, FoodType foodType) {
        super(MenuType.ALACARTE, name, description, price);
        this.foodType = foodType;
    }

    @Override
    public void DisplayItem() {
        System.out.println("Ala Carte Item");
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Item category: " + foodType.toString());
        System.out.println("Price: " + price);
    }

    public FoodType getFoodType() {
        return foodType;
    }

}
