package sce.cz2002.cj.first;

import java.util.ArrayList;

public class SetItem extends MenuItem {
    private ArrayList<ACPair> items = new ArrayList<ACPair>();

    public SetItem(String name, String description, int price) {
        super(MenuType.SET, name, description, price);
    }

    @Override
    public void DisplayItem() {

    }

    public void AddItem(AlaCarteItem item, int quantity) {
        if(FindItem(item.getName()) != -1) {
            System.out.println("ERROR: Item already exist.");
            return;
        }
        items.add(new ACPair(item, quantity));
    }

    public void UpdateItem(String itemName, int newQuantity) {
        int index = FindItem(itemName);
        if(index == -1) {
            System.out.println("ERROR: Item does not exist.");
            return;
        }
        items.get(index).setQuantity(newQuantity);
    }

    public int FindItem(String name) {
        int i=0;
        while(i<items.size()) {
            if(items.get(i).getItem().getName() == name) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public ArrayList<ACPair> getItems() {
        return items;
    }

}
