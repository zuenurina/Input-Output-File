package assignment2;
import java.io.*;
import javax.swing.JOptionPane;

public class DataInput {
    public void datainput () throws IOException {
        
        File inFile = new File("order.data");
        FileInputStream inFileStream = new FileInputStream(inFile);
        DataInputStream inDataStream = new DataInputStream(inFileStream);
        
        JOptionPane.showMessageDialog(null, "RECEIPT"
                + "\n Table No: " + inDataStream.readInt()
                + "\n\n Total: RM " + String.format("%.2f", inDataStream.readDouble()));
        
        inDataStream.close();
    }
}
