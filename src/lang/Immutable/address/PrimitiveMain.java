package lang.Immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println(a + " " + b);
        b = 20;
        System.out.println(a + " " + b);
    }
}
