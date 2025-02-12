package enumeration.ex1;


public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService dSvc = new DiscountService();
        int basic = dSvc.discount(StringGrade.BASIC, price);
        int gold = dSvc.discount(StringGrade.GOLD, price);
        int diamond = dSvc.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC : " + basic);
        System.out.println("GOLD : " + gold);
        System.out.println("DIAMOND : " + diamond);
    }
}
