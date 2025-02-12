package enumeration.ref1;


public class ClassGradeRefMain1 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountService dSvc = new DiscountService();

        int basic = dSvc.discount(ClassGrade.BASIC, price);
        int gold = dSvc.discount(ClassGrade.GOLD, price);
        int diamond = dSvc.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC : " + basic);
        System.out.println("GOLD : " + gold);
        System.out.println("DIAMOND : " + diamond);
    }
}
