package LetsGo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class First {

    @Test
public void openBrowser()
{
    System.out.println("Hello google");

    // hard coded path for chrome browser
//System.setProperty("webdriver.chrome.driver","C:\\Users\\Jasdeep\\Videos\\call_recording\\Selenium-Webdriver\\chromedriver.exe");

    // hard coded path for Firefox browser
//System.setProperty("webdriver.gecko.driver","C:\\Users\\Jasdeep\\Videos\\call_recording\\Selenium-Webdriver\\geckodriver.exe");

//Relative path

    String path = System.getProperty("user.dir");   //this user.div gives you the path of this project.

    System.out.println(path);

    System.setProperty("webdriver.chrome.driver",path+"\\Resource\\chromedriver.exe");

// calling chrome

    WebDriver driver = new ChromeDriver();

    // calling firefox
   //WebDriver driver = new FirefoxDriver();

    driver.get("https://www.naukri.com/account/register/basicdetails");

    driver.manage().window().maximize();

    driver.findElements(By.cssSelector(""));

}

/*
public static void main(String[] args){      // i am using main method i commeted the annotations

        First f = new First();  //object of class
        f.openBrowser();    //calling of method
}*/
}
