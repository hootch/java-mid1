package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {

        Car modelY = new Car("Model Y");
        Dog lego = new Dog("레고", 1);
        Dog dog = new Dog("강아지", 2);

        System.out.println("1. 단순  toString");

        System.out.println(modelY.toString());
        System.out.println(lego.toString());
        System.out.println(dog.toString());


        System.out.println("2. println 내부에서 toString 호출");

        System.out.println(modelY);
        System.out.println(lego);
        System.out.println(dog);


        System.out.println("3. object 다형성 활용");
        ObjectPrinter.print(modelY);
        ObjectPrinter.print(dog);
        ObjectPrinter.print(lego);
        int i = System.identityHashCode(dog);
        System.out.println(i);
        String refValue = Integer.toHexString(i);
        System.out.println(refValue);
    }
}
