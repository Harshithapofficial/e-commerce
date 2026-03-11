import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to TechCart E-Commerce");

        System.out.println("1. View Products");
        System.out.println("2. Add to Cart");
        System.out.println("3. Exit");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Showing products...");
                break;

            case 2:
                System.out.println("Product added to cart");
                break;

            case 3:
                System.out.println("Thank you for visiting");
                break;

            default:
                System.out.println("Invalid option");
        }

    }
}
