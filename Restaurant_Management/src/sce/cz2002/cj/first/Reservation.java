package sce.cz2002.cj.first;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
    private long bookingTime;
    private short pax;
    private String name, contact;
    private int tableID;

    public Reservation(long bookingTime, short pax, String name, String contact, int tableID) {
        this.bookingTime = bookingTime;
        this.pax = pax;
        this.name = name;
        this.contact = contact;
        this.tableID = tableID;
    }

    public void displayReservation() {
        System.out.println("Reservation for: " + name);
        Date time=new Date((long)bookingTime);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Time: " + sdf.format(time));
        System.out.println("Pax: " + pax);
        System.out.println("Contact: " + contact);
        System.out.println("Allocated tableID: " + tableID + '\n');
    }

    public long getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(long bookingTime) {
        this.bookingTime = bookingTime;
    }

    public short getPax() {
        return pax;
    }

    public void setPax(short pax) {
        this.pax = pax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }
}
