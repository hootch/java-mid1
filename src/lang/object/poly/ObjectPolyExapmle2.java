package lang.object.poly;

public class ObjectPolyExapmle2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object o = new Object();

        Object[] objects = {dog, car, o};

        getSize(objects);
    }

    private static void getSize(Object[] objects) {
        System.out.println("배열의 길이는 " + objects.length);
    }

}
