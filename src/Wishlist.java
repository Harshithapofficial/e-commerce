import java.util.ArrayList;

public class Wishlist {

    ArrayList<Product> items = new ArrayList<>();

    public void add(Product p){
        items.add(p);
        System.out.println("Product added to wishlist");
    }

    public void show(){

        if(items.size()==0){
            System.out.println("Wishlist empty");
            return;
        }

        for(Product p : items){
            p.display();
        }

    }

}
