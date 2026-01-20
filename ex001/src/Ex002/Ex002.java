package Ex002;

import java.util.Locale;
import java.util.Scanner;
import Ex002.Product;

public class Ex002 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.printf("\n \t Enter product data: ");
        System.out.printf("\n Pleans, inserte the name: ");
        product.setName(sc.nextLine());
        System.out.printf("\n Please, inserte the quantity:  ");
        product.setQuantity(sc.nextInt());
        System.out.printf("\n Please, insert the price: ");
        product.setPrice(sc.nextDouble());

        product.getStatus();

        System.out.printf("Right thing: ");
        System.out.println(" Product data: " + product);

        System.out.println("\n Please, enter the number of products must be added from stock: ");
        product.AddProducts(sc.nextInt());
        System.out.println("Updated data: " + product);

        System.out.println("\n Please, enter the number of products must be removed from stock: ");
        product.removeProducts(sc.nextInt());
        System.out.println("Updated data: " + product);

        sc.close();
    }

}
