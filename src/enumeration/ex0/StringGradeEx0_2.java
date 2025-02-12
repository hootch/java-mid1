package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService dSvc = new DiscountService();

        //존재하지 않는 등급

        int vip =  dSvc.discount("VIP", price);
        System.out.println("VIP :" + vip);
        int basic = dSvc.discount("BASIC", price);
        int gold = dSvc.discount("GOLD", price);
        int diamond = dSvc.discount("DIAMOND", price);

        System.out.println("BASIC : " + basic);
        System.out.println("GOLD : " + gold);
        System.out.println("DIAMOND : " + diamond);
    }
}
