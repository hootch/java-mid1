 package nested.anonymous.ex;

 import java.util.Random;

 public class Ex3Main {

     public static void helloSomething2(SomeCode someCode){
         System.out.println("프로그램 시작");
         someCode.something();
         System.out.println("프로그램 종료");
     }


     public static void main(String[] args) {
         helloSomething2(() -> {
             int randV = new Random().nextInt(6) + 1;
             System.out.println("randV = " + randV);
         });
         helloSomething2(() -> {
             for (int i = 0; i < 3; i++){
                 System.out.println("i : " + i);
             }
         });
     }

}
