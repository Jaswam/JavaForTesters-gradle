package d_data_structures;

public class Exercise1 {

    public static void main(String[] args) {
        login(BrowserType.CHROME);
        login(BrowserType.EDGE);


    }
    public static void login(BrowserType b) {
        System.out.println(b.ordinal());
        System.out.println(b.name());

    }
}
