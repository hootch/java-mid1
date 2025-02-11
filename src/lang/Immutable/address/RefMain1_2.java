package lang.Immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("스울");
        Address b = new Address("스울");
        System.out.println(a + " " + b);

        b.setValue("푸산");

        System.out.println(a + " " + b);
    }
}
