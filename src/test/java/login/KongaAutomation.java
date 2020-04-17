package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {

    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.konga.com/");
        Thread.sleep(5000);

        //1. maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.findElement(By.id("email")).sendKeys("oscarceko@gmail");
        driver.findElement(By.id("pass")).sendKeys("819967890");
        driver.findElement(By.id("loginbutton")).click();

    }
    public static void main(String[] args) throws InterruptedException {
        LoginTest test = new LoginTest();
        test.setup();

    }
}