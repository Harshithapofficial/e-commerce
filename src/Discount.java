public class Discount {

    public double applyDiscount(double total){

        if(total > 50000){
            System.out.println("10% discount applied");
            return total * 0.9;
        }

        return total;
    }

}
