package myassignment;

public class Product1 {  // Changed 'product1' to 'Product1'
    
    int productId;
    String productname;
    double price;

    // Constructor
    Product1(int Id, String name, double price) {  
        this.productId = Id;
        this.productname = name;
        this.price = price;
    }
    public static void main(String[] args) {
        Product1[] products = {
            new Product1(1, "food", 250),
            new Product1(2, "grocery", 90),
            new Product1(3, "TV", 25000),
            new Product1(4, "bike", 250000)
        };

        Product1 maxProduct = products[0];
        double total = 0;

        for (Product1 p : products) {
            if (p.price > maxProduct.price)
                maxProduct = p;
            total += p.price;
        }

        System.out.println("Highest priced product: " + maxProduct.productname + " - " + maxProduct.price);
        System.out.println("Total price: " + total);
        System.out.println("All products:");

        for (Product1 p : products) {
            System.out.println(p.productId + " " + p.productname + " " + p.price);
        }
    }


}


    