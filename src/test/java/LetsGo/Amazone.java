package LetsGo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Amazone {

    public void startbrowser() {
        String path = System.getProperty("user.dir");
        System.out.println("" + path);
        System.setProperty("webdriver.gecko.driver", path + "\\Resource\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=8079TVNW7G44HPMDVFGJ&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

        WebElement e1 = driver.findElement(By.cssSelector("input[id='ap_customer_name']"));
        e1.sendKeys("Appuu ji");

        WebElement e2 = driver.findElement(By.id("ap_phone_number"));
        e2.sendKeys("2345778970");

        WebElement e3 = driver.findElement(By.xpath("//input[@id = 'ap_email']"));
        e3.sendKeys("apurvxactli1@gmail.com");

        WebElement e4 = driver.findElement(By.id("ap_password"));
        e4.sendKeys("Apurv@2018");

       /* WebElement e5 = driver.findElement(By.id("continue"));
        e5.submit();
*/
        driver.navigate().refresh();
        WebElement e6 = driver.findElement(By.cssSelector("i[class = 'a-icon a-icon-logo']"));
        e6.click();

       /* WebElement e7 = driver.findElement(By.cssSelector("img[src^='https://images-eu.ssl-images-amazon.com/images/G/31/img19/Home/LA/LATVFdesktopQC/D16106072_IN_LATV_MSO_QC_Washing-machin']"));
        e7.click();

        WebElement e8 = driver.findElement(By.xpath("//div[@class= 'a-section aok-relative s-image-fixed-height']/img[@src='https://m.media-amazon.com/images/I/61JeJKWBWNL._AC_UY218_.jpg']"));
        e8.click();

       WebElement e9 = driver.findElement(By.cssSelector("span[id = 'productTitle']"));
        if(e9.getText() == "Samsung ")
        {
            System.out.println(""+e9);
        }*/
        WebElement e9 = driver.findElement(By.id("twotabsearchtextbox"));
        e9.sendKeys("Apple mobile");
        e9.submit();
        List<WebElement> l1= driver.findElements(By.className("sg-col-20-of-24 s-result-item s-asin sg-col-0-of-12 sg-col-28-of-32 sg-col-16-of-20 sg-col sg-col-32-of-36 sg-col-12-of-16 sg-col-24-of-28"));

        for(WebElement ele1 : l1)
        {
            if(ele1.getAttribute(ele1.getAttribute("")).equals("Apple iPhone 11 (64GB) - Black"))
            {
                ele1.click();
            }
        }
    }

    // String litral(String pool) and string object (heap memory)
    public void stringMethod() {
        String s1 = "Apurv";
        String s2 = "Apurv";
        String s = new String("Apurv");
        System.out.println("" + s1 == s2);
        System.out.println("" + s1 == s);
        System.out.println("" + s1.equals(s));

    }

    public static void main(String[] args) {

        Amazone a = new Amazone();
        a.startbrowser();
        //a.stringMethod();
    }
}
