package lang.Immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address addr = new Address("서울");

        MemberV1 member1 = new MemberV1("회원A", addr);
        MemberV1 member2 = new MemberV1("회원B", addr);

        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + member1);
        System.out.println("memberB = " + member2);

        member2.getAddress().setValue("푸산");
        System.out.println("MemberB 주소 변경");

        System.out.println("memberA = " + member1);
        System.out.println("memberB = " + member2);

    }
}
