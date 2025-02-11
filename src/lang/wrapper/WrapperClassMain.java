package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {

        Integer newInteger = new Integer( 10); //삭제 예정
        Integer IntgerObj = Integer.valueOf( 10); // -128 ~ 127 자주 사용하는 숫자 값 재사용

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(100);
        System.out.println(newInteger);
        System.out.println(IntgerObj);
        System.out.println(longObj);
        System.out.println( doubleObj);


        System.out.println("내부값 읽기");

        int intV = newInteger.intValue();
        System.out.println(intV);
        long longV = longObj.intValue();
        System.out.println(longV);
        double doubleV = doubleObj.intValue();
        System.out.println(doubleV);

        System.out.println("비교");
        System.out.println(" == " + (newInteger == IntgerObj));
        System.out.println("equals " + (newInteger.equals(IntgerObj)));


    }
}
