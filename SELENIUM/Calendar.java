import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	
		driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();

	driver.findElement(By.xpath("//a[@text='Adampur (AIP)']")).click();
	Thread.sleep(2000);	
		driver.findElement(By.cssSelector(".ui-state-highlight")).click();
		

	}

}
