package TestNG;

import org.testng.annotations.Test;

public class TestClass1 {

    @Test(groups = {"Group1"}, priority = 1)
    public void suiteTestCase1() {
        System.out.println("Test Class 1 - Test case 1");
    }

    @Test(groups = {"Group1"}, priority = 0)
    public void suiteTestCase2() {
        System.out.println("Test Class 1 - Test case 2");
    }

    @Test(groups = {"Group2"})
    public void suiteTestCase3() {
        System.out.println("Test Class 1 - Test case 3");
    }

}
