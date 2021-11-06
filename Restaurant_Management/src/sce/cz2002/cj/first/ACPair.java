package sce.cz2002.cj.first;

public class ACPair {
    private AlaCarteItem item;
    private int quantity;
    public ACPair(AlaCarteItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
    public AlaCarteItem getItem() {
        return item;
    }
    public void setItem(AlaCarteItem item) {
        this.item = item;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
