package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = str2;

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println("*******************");
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));
        str2 = "야호";
        System.out.println(str3);
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));


        String str4 = "hello";
        String str5 = "hello";
        System.out.println("리터럴 비교");
        System.out.println(str4 == str5);
        System.out.println(str4.equals(str5));

    }
}
