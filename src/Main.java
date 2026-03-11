import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cart cart = new Cart();

        Product p1 = new Product(1,"Laptop",50000);
        Product p2 = new Product(2,"Mobile",20000);
        Product p3 = new Product(3,"Headphones",2000);

        while(true){

            System.out.println("\nWelcome to TechCart E-Commerce");

            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Available Products:");
                    p1.display();
                    p2.display();
                    p3.display();
                    break;

                case 2:
                    System.out.println("Enter product id to add:");
                    int id = sc.nextInt();

                    if(id==1)
                        cart.addProduct(p1);
                    else if(id==2)
                        cart.addProduct(p2);
                    else if(id==3)
                        cart.addProduct(p3);
                    else
                        System.out.println("Invalid product");

                    break;

                case 3:
                    System.out.println("Items in Cart:");
                    cart.showCart();
                    break;

                case 4:
                    System.out.println("Thank you for visiting TechCart");
                    return;

                default:
                    System.out.println("Invalid option");
            }

        }

    }
}
