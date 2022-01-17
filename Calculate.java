package assignment2;

public class Calculate {
    private double price;
    private int quantity;
    
    public Calculate(double price, int quantity){
        this.price = price;
        this.quantity = quantity;
    }
    
    public double calculate(){
        double total = 0;
        
        total = price * quantity;
        return total;
    }
}
