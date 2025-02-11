package lang.Immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress addr = new ImmutableAddress("서울");

        MemberV2 member1 = new MemberV2("회원A", addr);
        MemberV2 member2 = new MemberV2("회원B", addr);

        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + member1);
        System.out.println("memberB = " + member2);

        //회원 b 주소 변경
//        member1.getAddress().setValue("부산");
        member2.setAddress(new ImmutableAddress("푸산"));

        System.out.println("memberA = " + member1);
        System.out.println("memberB = " + member2);
    }
}
