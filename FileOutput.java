package assignment2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileOutput {
    public void fileoutput(Customer[] customer) throws IOException {
        File outFile  = new File("list.data");
        FileOutputStream outFileStream = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);
        
        Customer print;
        for (int i = 0; i < customer.length; i++) {
            print = new Customer(customer[i].getTable(), customer[i].getTotal());
            outObjectStream.writeObject(print);
        }
        outObjectStream.close();
    }
    
}
