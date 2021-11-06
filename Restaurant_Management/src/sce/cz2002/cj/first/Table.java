package sce.cz2002.cj.first;

enum Status {occupied, vacant, reserved}

public class Table {
    private Status status = Status.vacant;
    private short capacity;
    private int tableID;

    public Table(int tableID, short capacity) {
        this.capacity = capacity;
        this.tableID = tableID;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public short getCapacity() {
        return capacity;
    }

    public void setCapacity(short capacity) {
        this.capacity = capacity;
    }

    public int getTableID() {
        return tableID;
    }
}
