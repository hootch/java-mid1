package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
//        Random random = new Random();
        Random random = new Random(); //seed가 같으면 random의 결과가 같음

        int randomInt = random.nextInt();
        System.out.println(randomInt);

        int randomDouble = random.nextInt();
        System.out.println(randomDouble);

        int randomBoolean = random.nextInt();
        System.out.println(randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10); //0~9조회
        System.out.println(randomRange1);


        int randomRange2 = random.nextInt(10) + 1; //1~10조회
        System.out.println(randomRange2);

    }
}
