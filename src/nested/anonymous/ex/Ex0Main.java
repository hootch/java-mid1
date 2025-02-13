package nested.anonymous.ex;

public class Ex0Main {
    public static void helloSomething(String something){
        System.out.println("프로그램 시작");
        System.out.printf("Hello %s\n", something);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloSomething("Java");
        helloSomething("Spring");
    }
}
