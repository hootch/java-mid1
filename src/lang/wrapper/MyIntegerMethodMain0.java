package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;

        int i1 = compareTo(value, 5);
        System.out.println(i1);
        int i2 = compareTo(value, 10);
        System.out.println(i2);
        int i3 = compareTo(value, 20);
        System.out.println(i3);


    }

    public static int compareTo(int v, int t){

        if (v < t) {
            return -1;
        } else if (v > t) {
            return 1;
        }
        return 0;
    }
}
