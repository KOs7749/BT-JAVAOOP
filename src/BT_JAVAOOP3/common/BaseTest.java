package BT_JAVAOOP3.common;

public class BaseTest {
    public void createDriver() {
        System.out.println("Open browser: " + Constants.getBrowers());
        System.out.println("Open report: " + Constants.report);
        System.out.println("Open headless: " + Constants.headless);
    }

    public void closeDriver() {
        System.out.println("Close browser: " + Constants.getBrowers());
        System.out.println("Close report: " + Constants.report);
        System.out.println("Close headless: " + Constants.headless);
    }
}
