package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println(sb);

        sb.insert(2, "JAVA");
        System.out.println(sb);

        sb.delete(4,8);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        //StringBuild -> String
        String string =  sb.toString();
        System.out.println(string);
    }
}
