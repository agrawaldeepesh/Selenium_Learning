import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumDemo {

    public static void main(String[] args) {
        WebDriver wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wd.manage().window().maximize();
        //wd.get("https://demo.evershop.io/");
        //wd.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[3]/a")).click();
        wd.get("https://apim-nonprod.developer.nhs.wales/");
        wd.findElement(By.cssSelector("#index > div > ng-component > page-content > div > div.home-page-cards > mat-card.mat-card.mat-focus-indicator.home-page-card.view-apis > mat-card-content > a > p")).click();
        wd.findElement((By.xpath("//input[@id='mat-input-0']"))).sendKeys("Sandbox");
        wd.findElement(By.xpath("//*[@id=\"mat-radio-5-input\"]")).click();

    }
}
