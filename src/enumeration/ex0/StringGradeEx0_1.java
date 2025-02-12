package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService dSvc = new DiscountService();
        int basic = dSvc.discount("BASIC", price);
        int gold = dSvc.discount("GOLD", price);
        int diamond = dSvc.discount("DIAMOND", price);

        System.out.println("BASIC : " + basic);
        System.out.println("GOLD : " + gold);
        System.out.println("DIAMOND : " + diamond);
    }
}
