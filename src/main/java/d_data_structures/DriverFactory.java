package d_data_structures;
//
//#### Exercise 2
//        1. Uncomment the `public class DriverFactory` code. -Done
//        2. Correct the code of the `getDriver()` method so that for each of the elements created in the enum it returns a string with the name of the selected browser.
//        3. Call the `getDriver()` method in the `main()` method with various enum parameters.

public class DriverFactory
{
    static String driver = null;

    public static void main(String[] args) {
        driver = getDriver(BrowserType.CHROME);
        System.out.println(getDriver(BrowserType.EDGE));

    }

    public static String getDriver(BrowserType browserType)
    {
        switch (browserType)
        {
            case CHROME:
                return "CHROME";

            case EDGE:
                return "EDGE";

            default:
                return "Invalid Browser";
        }
    }
}