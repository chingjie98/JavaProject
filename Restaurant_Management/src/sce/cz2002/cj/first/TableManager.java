package sce.cz2002.cj.first;

import java.util.ArrayList;

public class TableManager {
    private ArrayList<Table> tables = new ArrayList<Table>();

    public TableManager() {
        tables.add(new Table(0, (short)2));
        tables.add(new Table(1, (short)2));
        tables.add(new Table(2, (short)4));
        tables.add(new Table(3, (short)4));
        tables.add(new Table(4, (short)4));
        tables.add(new Table(5, (short)4));
        tables.add(new Table(6, (short)8));
        tables.add(new Table(7, (short)8));
        tables.add(new Table(8, (short)8));
        tables.add(new Table(9, (short)8));
    }

    public void printVacantTables() {
        int i=0;
        boolean anyVacant = false;
        System.out.print("Vacant tables:");
        while(i<tables.size()) {
            if(tables.get(i).getStatus() == Status.vacant) {
                anyVacant = true;
                System.out.print(" " + tables.get(i).getTableID() + " ");
            }
            i++;
        }
        if(anyVacant == false) {
            System.out.print("None");
        }
        System.out.print('\n');
    }

    public void printTables() {
        int i=0;
        System.out.println("Table List");
        System.out.println("------------");
        while(i<tables.size()) {
            Table cur = tables.get(i);
            System.out.println("Table ID: " + cur.getTableID());
            System.out.println("Capacity: " + cur.getCapacity());
            System.out.println("Status: " + cur.getStatus().toString());
            System.out.println();
            i++;
        }
        System.out.println("------------\n");
    }

    public int findSuitableTable(short pax) {
        int ret = -1, i=0, minDiff=10000;
        while(i<tables.size()) {
            if(tables.get(i).getCapacity()>=pax && tables.get(i).getCapacity()-pax<minDiff) {
                minDiff=tables.get(i).getCapacity()-pax;
                ret=i;
            }
            i++;
        }
        return ret;
    }

    public void updateStatus(int tableID, Status status) {
        int i=0;
        while(i<tables.size()) {
            if(tables.get(i).getTableID() == tableID) {
                tables.get(i).setStatus(status);
                return;
            }
            i++;
        }
        System.out.println("ERROR: No such table ID found.");
    }

    public void addTable(int tableID, short capacity) {
        int i=0;
        while(i<tables.size()) {
            if(tables.get(i).getTableID() == tableID) {
                System.out.println("ERROR: tableID already exists.");
            }
            i++;
        }
        tables.add(new Table(tableID, capacity));
    }
}
