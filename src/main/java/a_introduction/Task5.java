package a_introduction;

public class Task5 {
    public static void main(String[] args) {
        String name = "Michal";
        int age = 25;
        String msg = name + ", is " + age + " years old and is ";

        if (age > 19) {
            System.out.println(msg + "of age.");
        } else {
            System.out.println(msg + "under age.");
        }
    }
}