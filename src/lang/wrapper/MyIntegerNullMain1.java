package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInterger [] intArr = {new MyInterger(-1),new MyInterger(0),new MyInterger(1),new MyInterger(2), new MyInterger(3)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100  ));

    }

    private static MyInterger findValue(MyInterger[] intArr, int t) {
        for (MyInterger myInterger : intArr) {
            if (myInterger.getValue() == t) return myInterger;
        }
        return null;
    }
}
