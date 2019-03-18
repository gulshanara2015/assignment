package FreeCRMBDDFramework.DemoHamza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
// goto google
driver.get("https://www.gmail.com/");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rogerdmello666@gmail.com");
driver.findElement(By.xpath("(//content[@class='CwaK9'])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("technical@123");
driver.findElement(By.xpath("(//content[@class='CwaK9'])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@class='J-J5-Ji J-JN-M-I-JG'])[5]")).click();
driver.findElement(By.xpath("(//div[@class=\"nH\"]//div[@role=\"menuitem\"])[7]")).click();
driver.findElement(By.xpath("(//div[@class=\"J-LC-Jz\"])[1]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id=':p8']")).click();


driver.close();
}

}
