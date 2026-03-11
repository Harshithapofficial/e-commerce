public class Order {

    public void placeOrder(Cart cart){

        System.out.println("\nOrder Placed Successfully!");

        cart.showCart();

        System.out.println("Total Amount: Rs." + cart.getTotal());

    }

}
