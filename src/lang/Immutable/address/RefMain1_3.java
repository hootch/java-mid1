package lang.Immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        Address a = new Address("스울");
        Address b = a;
        System.out.println(a + " " + b);

        change(b, "푸산");

        System.out.println(a + " " + b);
    }

    private static void change (Address addr, String changeAddr){
        addr.setValue(changeAddr);
    }
}
