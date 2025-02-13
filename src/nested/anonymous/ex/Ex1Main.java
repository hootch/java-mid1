 package nested.anonymous.ex;

 import java.util.Random;

 public class Ex1Main {

     public static void helloSomething2(SomeCode someCode){
         System.out.println("프로그램 시작");
         someCode.something();
         System.out.println("프로그램 종료");
     }
    public static void helloDice(){
        System.out.println("프로그램 시작");

        //코드 조각 시작
        int randV = new Random().nextInt(6) + 1;
        System.out.println("randV = " + randV);
        //코드 조각 종료


        System.out.println("프로그램 종료");
    }

     public static void helloSum(){
         System.out.println("프로그램 시작");

         //코드 조각 시작
         for (int i = 0; i < 3; i++){
             System.out.println("i : " + i);
         }
         //코드 조각 종료


         System.out.println("프로그램 종료");
     }

     public static void main(String[] args) {
         SomeCode randomSomething = new SomeCode(){
            @Override
            public void something() {
                int randV = new Random().nextInt(6) + 1;
                System.out.println("randV = " + randV);
            }
        };

         SomeCode printSomething = new SomeCode(){
             @Override
             public void something() {
                 for (int i = 0; i < 3; i++){
                     System.out.println("i : " + i);
                 }
             }
         };



         helloSomething2(randomSomething);
         helloSomething2(printSomething);
     }

}
