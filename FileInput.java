package assignment2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileInput {
    
    public void fileinput(Customer[] customer) throws ClassNotFoundException, IOException {
        File inFile  = new File("list.data");
        FileInputStream inFileStream = new FileInputStream(inFile);
        ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);
        
        Customer print;
        for (int i = 0; i < customer.length; i++) {
            print = (Customer)inObjectStream.readObject();

            System.out.println("Table " + print.getTable() + ": RM " 
                    + String.format("%.2f", print.getTotal()));
        }

        inObjectStream.close();
    }
    
}
