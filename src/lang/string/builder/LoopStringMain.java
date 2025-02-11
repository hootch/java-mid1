package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++){
//            result += "Hello Java";
            sb.append("Hello Java");
        }
        result = sb.toString();

        long endTime = System.currentTimeMillis();
        System.out.println(result);
//        System.out.println(sb);
        System.out.println(endTime - startTime + " ms");
    }
}
