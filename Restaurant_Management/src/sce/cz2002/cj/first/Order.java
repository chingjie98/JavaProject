package sce.cz2002.cj.first;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int orderID, netPrice = 0, tableID, discount, serviceCharge, GST;
    private Staff placedBy;
    private long timestamp;
    private ArrayList<MPair> orderedItems = new ArrayList<MPair>();
    private short pax;

    public Order(int orderID, int tableID, int discount, int serviceCharge, int GST, Staff placedBy, long timestamp, short pax) {
        this.orderID = orderID;
        this.tableID = tableID;
        this.discount = discount;
        this.serviceCharge = serviceCharge;
        this.GST = GST;
        this.placedBy = placedBy;
        this.timestamp = timestamp;
        this.pax = pax;
    }

    public void viewOrder() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Pax: " + pax);
        Date time=new Date((long)timestamp);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Time: " + sdf.format(time));
        System.out.println("Table ID: " + tableID);
        System.out.println("Server: " + placedBy.getName());
        System.out.println("Discount: " + discount + '%');
        System.out.println("Service Charge: " + serviceCharge + '%');
        System.out.println("GST: " + GST + '%');
        System.out.println("Ordered Items");
        System.out.println("------------");
        int i=0;
        while(i<orderedItems.size()) {
            System.out.println("Item: " + orderedItems.get(i).getItem().getName() + " x" + orderedItems.get(i).getQuantity());
            i++;
        }
        System.out.println("------------\n");
    }

    public void addItem(MenuItem item, int quantity) {
        int i=0;
        while(i<orderedItems.size()) {
            if(orderedItems.get(i).getItem().getName() == item.getName()) {
                orderedItems.get(i).setQuantity(orderedItems.get(i).getQuantity() + quantity);
                netPrice = netPrice + item.price * quantity;
                return;
            }
            i++;
        }
        orderedItems.add(new MPair(item, quantity));
        netPrice = netPrice + item.price * quantity;
    }

    public void removeItem(MenuItem item, int quantity) {
        int i=0;
        while(i<orderedItems.size()) {
            if(orderedItems.get(i).getItem().getName() == item.getName()) {
                if(orderedItems.get(i).getQuantity()<quantity) {
                    System.out.println("ERROR: Trying to remove more " + item.getName() + " than ordered.");
                    return;
                }
                else if(orderedItems.get(i).getQuantity()==quantity) {
                    orderedItems.remove(i);
                }
                else {
                    orderedItems.get(i).setQuantity(orderedItems.get(i).getQuantity() - quantity);
                }
                netPrice = netPrice - item.getPrice() * quantity;
                return;
            }
            i++;
        }
        System.out.println("ERROR: No such item exists in order.");
    }

    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public int getGST() {
        return GST;
    }

    public void setGST(int gST) {
        GST = gST;
    }

    public Staff getPlacedBy() {
        return placedBy;
    }

    public void setPlacedBy(Staff placedBy) {
        this.placedBy = placedBy;
    }

    public short getPax() {
        return pax;
    }

    public void setPax(short pax) {
        this.pax = pax;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getNetPrice() {
        return netPrice;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public ArrayList<MPair> getOrderedItems() {
        return orderedItems;
    }
}