public class Order {

    public void placeOrder(Cart cart){

        if(cart.items.size()==0){
            System.out.println("Cart is empty!");
            return;
        }

        double total = cart.getTotal();

        Payment payment = new Payment();

        payment.processPayment(total);

        System.out.println("Order placed successfully!");

    }

}
