package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재시간 밀리초
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("CurrentTimeMillis : " + currentTimeMillis );

        //현재 시간 나노초
        long currentNano = System.nanoTime();
        System.out.println("currentTimeNano : " + currentNano);

        // 환경변수 엮음
        System.out.println("getenv : " + System.getenv());

        // 시스템 속성 읽음
        System.out.println("properties : " + System.getProperties());
        System.out.println("Java version : " + System.getProperty("java.version"));

        // 배열 고속 복사
        char[] orginalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(orginalArray, 0, copiedArray, 0, orginalArray.length);
        System.out.println("copy : " + Arrays.toString(copiedArray));
        System.out.println("original : " + Arrays.toString(orginalArray));

        //프로그램 종료
        System.exit(0);
        System.out.println("종료됐나!");


    }
}
