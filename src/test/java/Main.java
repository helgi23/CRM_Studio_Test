import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Main extends  WebDriverSettings{

    public void scenary() throws InterruptedException {

        driver.findElement(By.id("user_name")).sendKeys("demo");
        driver.findElement(By.id("username_password")).sendKeys("demo");
        driver.findElement(By.id("bigbutton")).click();
        Thread.sleep(3000L);

        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//a[@id='grouptab_2']"));
        action.moveToElement(we).build().perform();

        driver.findElement(By.xpath("//li[4]//span[2]//ul[1]//li[2]//a[1]")).click();

        Thread.sleep(2000L);

        driver.findElement(By.cssSelector("#edit-ae2763b6-f408-1236-05d3-5e9030bb8557")).click();

        driver.findElement(By.xpath("//input[@id='phone_office']")).clear();

        driver.findElement(By.xpath("//input[@id='phone_office']")).sendKeys("111111111");

        driver.findElement(By.id("SAVE")).click();

        driver.findElement(By.xpath("//a[@id='subpanel_title_activities']//div[@class='col-xs-10 col-sm-11 col-md-11']//div")).click();
    }
}
