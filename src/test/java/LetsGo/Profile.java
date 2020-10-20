package LetsGo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Profile {


@Test
    public void browserControl()
    {

        String path = System.getProperty("user.dir");
        ChromeOptions option = new ChromeOptions();

        Map<String,Object> m = new HashMap<String,Object>();  // why i take map

        m.put("download.default_directory",path + "\\Resource");

        option.setExperimentalOption("prefs", m);


/*
Map<String, Object> chromePrefs = new HashMap<String, Object>()
chromePrefs.put(“download.default_directory”, downloadPath)
chromePrefs.put(“download.prompt_for_download”, false)
*/


        System.out.println("" + path);
        System.setProperty("webdriver.chrome.driver", path + "\\Resource\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(option);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        String s = driver.getWindowHandle();
        System.out.println(""+s.length());
        driver.get("https://www.guru99.com/download-sample-test-case-template-with-explanation-of-important-fields.html");

        WebElement e = driver.findElement(By.xpath("//a[text()=' Download Test Case Template(.xls)']"));
        jse.executeScript("arguments[0].scrollIntoView(true)", e);
        e.click();
        ArrayList<String> allwin = new ArrayList<String>(driver.getWindowHandles());
        int count = allwin.size();
        System.out.println("Total window: "+count);
        if(count >1)
        {
            System.out.println("File download successfully ");
        }


    }
}
