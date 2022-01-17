package assignment2;
import java.io.*;

class Customer implements Serializable {
    private int tableNo;
    private double total;
    
    public Customer() {
        this(0, 0);
    }

    public Customer(int tableNo, double total) {
        this.tableNo = tableNo;
        this.total = total;
    }

    public int getTable( ) {
        return tableNo;
    }

    public double getTotal( ) {
        return total;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public void setTotal( double total ) {
        this.total = total;
    }
    
    public String toString( )  {
        return "Table " + this.tableNo    + ": RM " +
               this.total;
    }
}