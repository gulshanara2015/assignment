package FreeCRMBDDFramework.DemoHamza;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
// goto google
driver.get("https://www.gmail.com/");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("itsgulshannadaph2019@gmail.com");
driver.findElement(By.xpath("(//content[@class='CwaK9'])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("technical@123");
driver.findElement(By.xpath("(//content[@class='CwaK9'])[1]")).click();
Thread.sleep(2000);
//compose
driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
Thread.sleep(2000);
//menu for labels
driver.findElement(By.xpath("(//div[@class='J-J5-Ji J-JN-M-I-JG'])[5]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id=\":qz\"]")).click();
driver.findElement(By.xpath("//a[@title='Categories']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@title='Social']")).click();



driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("itsgulshannadaph2019@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("test");
driver.findElement(By.xpath("//div[@id=':p8']")).click();

List<WebElement> email = driver.findElements(By.cssSelector("div.xT>div.y6>span>b"));

for(WebElement emailsub : email){
if(emailsub.getText().equals("test") == true){

emailsub.click();
break;
}
}


driver.close();
}

}
