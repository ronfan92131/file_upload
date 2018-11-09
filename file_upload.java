package test1;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class file_upload {

    @Test
    public void WebDriver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //2. get an url
        String url = "http://demo.guru99.com/test/upload/";
        driver.get(url);


        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        uploadElement.sendKeys("/Users/fans/Documents/test.txt");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        System.out.println("file uploaded!");

        driver.close();

    }

}
