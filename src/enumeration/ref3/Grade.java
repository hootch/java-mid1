package enumeration.ref3;

public enum Grade {
    BASIC(10,1), GOLD(20,2), DIAMOND(30,3);


    private final int discountPercentage;
    private final int grade;

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public int getGrade() {
        return grade;
    }

    Grade(int discountPercentage, int grade) {
        this.discountPercentage = discountPercentage;
        this.grade = grade;
    }

    public int discount(int price) {
        return price * discountPercentage / 100;
    } 

}
