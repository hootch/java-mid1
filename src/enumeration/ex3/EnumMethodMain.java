package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        //모든 Enum 반환
        Grade[] values = Grade.values();

        System.out.println(values);
        System.out.println("Values : " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name : " + value.name() + ", ordinal : "+  value.ordinal());
        }

        // String -> ENUM 변환 잘못 넣으면 IllegalArgumentException 발생함
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold : " + gold); //toString() 오버라이딩 가능
    }
}
