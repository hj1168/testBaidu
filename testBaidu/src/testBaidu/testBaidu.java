package testBaidu;




import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class testBaidu {
	WebDriver driver;
	@BeforeClass
	public void openfire() {
//		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//		 driver=new FirefoxDriver();
		 
		 System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver = new ChromeDriver();
		String url="https://www.baidu.com";
		driver.get(url);
	}
	
	@Test
	public void login() throws InterruptedException {

        //找到输入框
		WebElement inputbox=driver.findElement(By.name("wd"));
		//暂停
		Thread.sleep(1000);
		//给输入框中输入内容
		inputbox.sendKeys("selenium");
		//找到百度一下的按钮
		WebElement buton=driver.findElement(By.id("su"));
		//点击按钮
		buton.click();
	}

}
