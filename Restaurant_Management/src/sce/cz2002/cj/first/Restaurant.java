package sce.cz2002.cj.first;

import java.util.ArrayList;
import java.util.Scanner;


public class Restaurant {
    private Menu menu;
    private ArrayList<Order> historicalOrders = new ArrayList<Order>(), currentOrders = new ArrayList<Order>();
    private TableManager tableManager = new TableManager();
    private ArrayList<Staff> staffs =  new ArrayList<Staff>();
    private ReservationManager reservationManager = new ReservationManager();
    private long currentTime;
    private Scanner in = new Scanner(System.in);

    public void mainChoices() {
        while(true) {
            System.out.println("1: Manage Menu");
            System.out.println("2: Manage Tables");
            System.out.println("3: Manage Reservations");
            System.out.println("0: Quit");

            int input = in.nextInt();
            switch(input) {
                case 0:
                    return;
                case 1:
                    menuChoices();
                    break;
                case 2:
                    tableChoices();
                    break;
            }
        }
    }

    public void menuChoices() {
        System.out.println("1: ");
    }

    public void tableChoices() {
        System.out.println("1: View all tables");
        System.out.println("2: View vacant tables");
        System.out.println("3: Add table");

        int input = in.nextInt();
        switch(input) {
            case 1:
                checkTable();
                break;
            case 2:
                checkVacantTables();
                break;
            case 3:
                addTable();
                break;
            default:
                System.out.println("Unrecgonized input.");
                tableChoices();
        }
    }

    public void checkTable() {
        tableManager.printTables();
    }

    public void checkVacantTables() {
        tableManager.printVacantTables();
    }

    public void addTable() {
        System.out.print("What is the tableID? ");
        int tableID = in.nextInt();
        System.out.print("What is the capacity? ");
        short capacity = in.nextShort();
        while(capacity % 2 != 0 || capacity < 2 || capacity > 10 ) {
            System.out.println("Error: Capacity needs to be an even number from 2 to 10");
            System.out.print("What is the capacity? ");
            capacity = in.nextShort();
        }
        tableManager.addTable(tableID, capacity);
    }
}
