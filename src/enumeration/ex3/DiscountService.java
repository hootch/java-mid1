package enumeration.ex3;


import static enumeration.ex3.Grade.*;

public class DiscountService {
    public int discount(Grade grade, int price ){
        int discountPercentage = 0;

        if (grade == BASIC) {
            discountPercentage = 10;
        } else if (grade == GOLD){
            discountPercentage = 20;
        } else if (grade == DIAMOND) {
            discountPercentage = 30;
        } else {
            System.out.println("할인x");
        }

        return  price * discountPercentage / 100;

    }
}
