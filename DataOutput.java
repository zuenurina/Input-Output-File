package assignment2;
import java.io.*;
import javax.swing.JOptionPane;

public class DataOutput {
    public void dataoutput () throws IOException {
        
        File outFile = new File("order.data");
        FileOutputStream outFileStream  = new FileOutputStream(outFile);
        DataOutputStream outDataStream  = new DataOutputStream(outFileStream);
        
        int quantity, code, tableNo;
        double pay = 0, price = 0, total = 0;
        String food = "";
        
        String input = JOptionPane.showInputDialog("Table No: ");
        tableNo = Integer.parseInt(input);
        
        Menu m = new Menu();
        code = m.menu(pay);
        
        do {
            switch(code){
                case 1:
                    price = 4.50;
                    food = "Mee Goreng";
                    break;
                
                case 2:
                    price = 5.50;
                    food = "Nasi Goreng";
                    break;
                
                case 3:
                    price = 2.00;
                    food = "Nasi Lemak";
                    break;
                
                default:
                    System.out.println("Invalid input.");
            }
            
            String input3 = JOptionPane.showInputDialog(food + "                 RM "
                    + String.format("%.2f", price) + "\nQuantity: ");
            quantity = Integer.parseInt(input3);
            
            Calculate c = new Calculate(price, quantity);
            total = c.calculate();
            
            pay = pay + total;
            code = m.menu(pay);
            
            Customer[] customer = new Customer[5];
            for(int i = 0; i < customer.length; i++){
                customer[i] = new Customer();
                customer[0] = new Customer(tableNo, total);
                customer[1] = new Customer(2, 5);
                customer[2] = new Customer(3, 2);
            }
            FileOutput output = new FileOutput();
            output.fileoutput(customer);
        }
        while(code != 4);
        JOptionPane.showMessageDialog(null, "Order is sent to kitchen!");
        outDataStream.writeInt(tableNo);
        outDataStream.writeDouble(pay);
        outDataStream.close();
    }
}

