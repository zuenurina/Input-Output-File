package assignment2;
import javax.swing.*;

public class Menu {
    public int menu(double pay){
        String input = JOptionPane.showInputDialog("MENU" 
                + "\n  1. Mee Goreng                 RM 4.50  " 
                + "\n  2. Nasi Goreng                RM 5.50  "
                + "\n  3. Nasi Lemak                 RM 2.00  " 
                + "\n  4. Done                                " 
                + "\n\n Total: RM " + String.format("%.2f", pay)
                + "\n\n Food: ");
        
        int code = Integer.parseInt(input);
        return code;
    }
}
