import java.util.ArrayList;

public class Cart {

    ArrayList<Product> items = new ArrayList<>();

    public void addProduct(Product p){

        items.add(p);
        System.out.println("Product added to cart");

    }

    public void showCart(){

        if(items.size()==0){
            System.out.println("Cart is empty");
            return;
        }

        for(Product p : items){

            p.display();

        }

    }

    public double getTotal(){

        double total = 0;

        for(Product p : items){

            total += p.price;

        }

        return total;

    }

}
