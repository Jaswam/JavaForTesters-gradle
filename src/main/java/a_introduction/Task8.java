package a_introduction;

//## Functions
//        ### Task 8
//        Create method that takes price before discount, discount -> and returns price after discount.
//        ```java
//public static double calculatePrice(int price, double discount) {}

public class
Task8 {

    public static void main(String[] args) {
        int price = 100;
        double discount = 20;
        System.out.println(calculatePrice(price, discount));
    }

    public static double calculatePrice(int price, double discount) {
        double priceAfterDiscount = (price - discount);
        return priceAfterDiscount;
    }
}
