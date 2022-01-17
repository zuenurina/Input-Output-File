package assignment2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class Frame implements ActionListener, WindowListener {
    private JFrame win;
    private JButton operation[];

    public Frame() {
        win = new JFrame();
        win.setTitle("3 Ekor Cafe");
        win.setSize(400, 400);
        win.addWindowListener(this);
        win.setLayout(new GridLayout(3, 1));

        operation = new JButton[3];
        for(int i=0; i< operation.length; i++){
            operation[i] = new JButton();
            win.add(operation[i]);
            operation[i].addActionListener(this);
        }
        operation[0].setText("New Order");
        operation[1].setText("Receipt");
        operation[2].setText("Record");
        win.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Customer [] customer;
        customer = new Customer[5];
        
        //funtion button 1 (New Record)
        if (operation[0] == e.getSource()) {
            DataOutput data = new DataOutput();
            try {
                data.dataoutput();
            } 
            catch (IOException b) {
                b.getStackTrace();
            }
        }
        
        //funtion button 2 (Receipt)
        else if (operation[1] == e.getSource()) {
            DataInput data = new DataInput();
            try {
                data.datainput();
            } 
            catch (IOException b) {
                b.getStackTrace();
            }
        }
        
        //funtion button 3 (Record)
        else if (operation[2] == e.getSource()) {
            try {
                FileInput input = new FileInput();
                input.fileinput(customer);
            }
            catch (IOException | ClassNotFoundException a) {
                a.getStackTrace();
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        win.dispose(); 
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}