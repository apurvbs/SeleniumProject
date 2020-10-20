package LetsGo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scripts {

    @Test
    public void scriptsExample() {
        String path = System.getProperty("user.dir");

        System.setProperty("webdriver.chrome.driver", path + "\\Resource\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // here we are using java scripts executor and this is interface
        JavascriptExecutor jse = (JavascriptExecutor) driver;  // this is unique way to create object

       /* driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Drm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
        driver.manage().window().maximize();

        WebElement ele = driver.findElement(By.className("VfPpkd-RLmnJb"));

        jse.executeScript("arguments[0].click()",ele);

        WebElement ele1 = driver.findElement(By.name("identifier"));

       // ele1.sendKeys("apurvsharma07@gmail.com");

        // send value by javascript executor

        jse.executeScript("arguments[0].value = 'apurvsharma07@gmail.com';", ele1);

        jse.executeScript("arguments[0].click()",ele);

        WebElement ele3= driver.findElement(By.id("pass"));

        ele3.sendKeys("Apuubhai");

        WebElement ele2= driver.findElement(By.id("loginbutton"));

        jse.executeScript("arguments[0].click()", ele2);  //  yaha arguments m hmesha [0] hi likhte h. this is syntax
*/
        driver.get("https://www.selenium.dev/");

        //jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        WebElement ele = driver.findElement(By.cssSelector("div[class = 'download-button webdriver']"));
        jse.executeScript("arguments[0].scrollIntoView(true)", ele);
        //
        ele.click();


    }
}
