import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Chapter3Test {
    private WebDriver driver;
    private By shiftContentLinkLocator = By.linkText("Shifting Content");
    private By example1MenuElementLocator = By.linkText("Example 1: Menu Element");
    private By exampleMenuLocator = By.xpath("//ul/li");

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void chapter3Test(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement shiftContentLink = driver.findElement(shiftContentLinkLocator);
        shiftContentLink.click();
        WebElement example1MenuElement = driver.findElement(example1MenuElementLocator);
        example1MenuElement.click();
        List<WebElement> menuList = driver.findElements(exampleMenuLocator);
        System.out.println(menuList.size());

    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
