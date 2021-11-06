package sce.cz2002.cj.first;

import java.awt.*;

public class MPair {
    private MenuItem item;
    private int quantity;
    public MPair(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
    public MenuItem getItem() {
        return item;
    }
    public void setItem(MenuItem item) {
        this.item = item;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
