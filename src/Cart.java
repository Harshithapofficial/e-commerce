import java.util.ArrayList;

public class Cart {

    ArrayList<Product> items = new ArrayList<>();

    public void addProduct(Product p){
        items.add(p);
        System.out.println("Product added to cart");
    }

    public void showCart(){
        for(Product p : items){
            p.display();
        }
    }

}
