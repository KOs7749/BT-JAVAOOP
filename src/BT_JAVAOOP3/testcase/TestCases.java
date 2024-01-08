package BT_JAVAOOP3.testcase;

import BT_JAVAOOP3.common.BaseTest;
import BT_JAVAOOP3.common.Constants;

public class TestCases extends BaseTest {
    public void loginCMS(){
        Constants.setBrowers("Chrome");
        createDriver();
        System.out.println("Access to url https://cms.anhtester.com/login");
        System.out.println("Enter valid email");
        System.out.println("Enter valid password");
        System.out.println("Click button Login");
        System.out.println("Check validate and redirect to Homepage");
        closeDriver();
    }

    public void addCategoryCMS(){
        Constants.setBrowers("Chrome");
        createDriver();
        System.out.println("Access to url https://cms.anhtester.com/login");
        System.out.println("Enter valid email");
        System.out.println("Enter valid password");
        System.out.println("Click Login button");
        System.out.println("Check validate and redirect to Homepage");

        System.out.println("On the menu bar, click on the Products");
        System.out.println("Click on the sub-menu Category");
        System.out.println("Click on the button Add New category");
        System.out.println("Enter all fields on the form create new category");
        System.out.println("Click on the Save button");
        System.out.println("Check validate and add new category");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.loginCMS();
        System.out.println("--------------------------------");
        testCases.addCategoryCMS();
    }
}
