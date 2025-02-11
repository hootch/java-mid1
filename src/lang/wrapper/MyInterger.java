package lang.wrapper;

public class MyInterger  {
    private final int value;

    public int getValue() {
        return value;
    }

    public MyInterger(int value) {
        this.value = value;
    }

    public int compareTo(int t){
        if (value < t) {
            return -1;
        } else if (value > t) {
            return 1;
        }
        return 0;
    }

    public String toString(){
        return String.valueOf(value);
//        return value +"";
    }
}
