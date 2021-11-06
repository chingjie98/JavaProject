package sce.cz2002.cj.first;

import java.util.ArrayList;

public class ReservationManager {
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
    private int timeToExpiredReservationInMins = 60;
    private final int millisInMin = 60000;

    public Reservation checkReservation(String name) {
        int i=0;
        while(i<reservations.size()) {
            if(reservations.get(i).getName() == name) {
                return reservations.get(i);
            }
            i++;
        }
        return null;
    }

    public void createReservation(long bookingTime, short pax, String name, String contact, int tableID) {
        if(checkReservation(name)==null) {
            reservations.add(new Reservation(bookingTime, pax, name,contact, tableID));
        }
        else {
            System.out.println("ERROR: Another reservation already exists under that name.");
        }
    }

    public Reservation arriveReservation(String name) {
        Reservation ret = checkReservation(name);
        if(ret==null) {
            System.out.println("ERROR: No reservations exists for this name.");
        }
        return ret;
    }

    public void removeReservation(String name) {
        int i=0;
        while(i<reservations.size()) {
            if(reservations.get(i).getName() == name) {
                reservations.remove(i);
            }
            i++;
        }
    }

    public void expireReservation(long currentTime) {
        int i=0;
        while(i<reservations.size()) {
            if(currentTime-reservations.get(i).getBookingTime()>=timeToExpiredReservationInMins*millisInMin) {
                reservations.remove(i);
            }
            else {
                i++;
            }
        }
    }

    public void displayReservations() {
        System.out.println("Reservations");
        System.out.println("------------");
        int i=0;
        while(i<reservations.size()) {
            reservations.get(i).displayReservation();
        }
        System.out.println("------------\n");
    }
}