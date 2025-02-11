package lang.Immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("스울");
        ImmutableAddress b = a;
        System.out.println(a + " " + b);

//        b.setValue("부산");
        System.out.println(a + " " + b);
        ImmutableAddress c = new ImmutableAddress("푸산");
        System.out.println(a + " " + c);
    }

}
