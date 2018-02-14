import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Mvn_Scpript {

public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Applications/Drivers/chromedriver");
    WebDriver x = new ChromeDriver();
    x.manage().window().maximize();
    x.get("file:///Users/Sergey/Desktop/Elements.html");
    System.out.println(x.findElement(By.name("firstname")).isEnabled());
    Thread.sleep(3000);
    System.out.println((x.findElement(By.xpath("//input[@name='firstname']")).getText()));
    System.out.println(x.findElement(By.name("firstname")).getTagName());
    System.out.println(x.findElement(By.name("lastname")).isEnabled());
    System.out.println(x.findElement(By.name("firstname")).getAttribute("value"));
    System.out.println(x.findElement(By.name("lastname")).getText());
    System.out.println(x.findElement(By.name("lastname")).getTagName());
    System.out.println(x.findElement(By.name("lastname")).getAttribute("value"));



}


}
