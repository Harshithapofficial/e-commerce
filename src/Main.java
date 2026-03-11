import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cart cart = new Cart();

        Product p1 = new Product(1,"Laptop",50000);
        Product p2 = new Product(2,"Mobile",20000);
        Product p3 = new Product(3,"Headphones",2000);

        while(true){

            System.out.println("\n===== TechCart E-Commerce =====");

            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Place Order");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch(choice){

                case 1:

                    System.out.println("\nAvailable Products:");
                    p1.display();
                    p2.display();
                    p3.display();
                    break;

                case 2:

                    System.out.println("Enter Product ID:");
                    int id = sc.nextInt();

                    if(id==1)
                        cart.addProduct(p1);
                    else if(id==2)
                        cart.addProduct(p2);
                    else if(id==3)
                        cart.addProduct(p3);
                    else
                        System.out.println("Invalid Product ID");

                    break;

                case 3:

                    System.out.println("\nItems in Cart:");
                    cart.showCart();
                    break;

                case 4:

                    Order order = new Order();
                    order.placeOrder(cart);

                    break;

                case 5:

                    System.out.println("Thank you for shopping with TechCart!");
                    return;

                default:
                    System.out.println("Invalid choice");

            }

        }

    }

}
System.out.println("Search product name:");
String name = sc.next();

if(p1.name.equalsIgnoreCase(name))
    p1.display();

else if(p2.name.equalsIgnoreCase(name))
    p2.display();

else if(p3.name.equalsIgnoreCase(name))
    p3.display();

else
    System.out.println("Product not found");
