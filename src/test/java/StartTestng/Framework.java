package StartTestng;

import org.testng.annotations.Test;

public class Framework {

    @Test(invocationCount = 3)
    public void login()
    {
        System.out.println("Here is log-in");
    }

    @Test(priority = 1) // Bt this priority keyword we can run tests in sequence as we want
    public void click()
    {
        System.out.println("Do click");
    }
}
