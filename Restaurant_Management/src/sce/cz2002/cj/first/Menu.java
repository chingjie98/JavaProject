package sce.cz2002.cj.first;

import java.awt.*;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

    public void AddItem(MenuItem item) {
        if(ifExist(item.getName())) {
            System.out.println("ERROR: Item already exist");
        }
        menu.add(item);
    }

    public void RemoveItem(MenuItem item) {
        if(!ifExist(item.name)) {
            System.out.println("ERROR: Item does not exist");
        }
        menu.remove(getItemIndex(item.getName()));
    }

    public void UpdateItem() {

    }

    public void displayMenu() {

    }

    private int getItemIndex(String name) {
        int i=0;
        while(i<menu.size()) {
            if(menu.get(i).getName() == name) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private boolean ifExist(String name) {
        return getItemIndex(name) != -1;
    }
}
