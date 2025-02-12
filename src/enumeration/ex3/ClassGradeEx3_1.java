package enumeration.ex3;


public class ClassGradeEx3_1 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountService dSvc = new DiscountService();

        int basic = dSvc.discount(Grade.BASIC, price);
        int gold = dSvc.discount(Grade.GOLD, price);
        int diamond = dSvc.discount(Grade.DIAMOND, price);

        System.out.println("BASIC : " + basic);
        System.out.println("GOLD : " + gold);
        System.out.println("DIAMOND : " + diamond);
    }
}
