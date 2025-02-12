package enumeration.ex2;

import enumeration.ex1.StringGrade;

public class DiscountService {
    public int discount(ClassGrade grade, int price ){
        int discountPercentage = 0;

        if (grade == ClassGrade.BASIC) {
            discountPercentage = 10;
        } else if (grade == ClassGrade.GOLD){
            discountPercentage = 20;
        } else if (grade == ClassGrade.DIAMOND) {
            discountPercentage = 30;
        } else {
            System.out.println("할인x");
        }

        return  price * discountPercentage / 100;

    }
}
