package Ex002;

public class Product {
    
    private String name;
    private double price;
    private int quantity;

    /*
       
            getters and setters
    
     */
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
      /*
       
            Constructor
    
     */

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /*
       
            Methods
    
     */
    public double TotalValueInStock() {
        return this.getQuantity();
    }
    
    public void AddProducts(int quantity) {
        this.setQuantity(this.getQuantity() + quantity);
    }
    
    public void removeProducts(int quantity) {
        this.setQuantity(this.quantity - quantity);
    }
    
}
