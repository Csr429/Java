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
    
    public double totalValueInStock()
    {
        return this.getPrice() * this.getQuantity();
    }

    // fiz do jeito que eu achava ser o certo
    public void getStatus() {
        System.out.printf("\n Name: %s", this.getName());
        System.out.printf("\n Quantity: %d", this.getQuantity());
        System.out.printf("\n Price: $:%.2f", this.getPrice());
        System.out.println("\n");
    }

    // jeito certo:
    public String toString() {
        return name
            + ", $ "
            + String.format("%.2f", this.getPrice())
            + ", "
            + quantity
            + " units, Total: $ "
            + totalValueInStock();
                
    }
}
