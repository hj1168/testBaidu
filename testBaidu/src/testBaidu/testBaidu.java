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

        //�ҵ������
		WebElement inputbox=driver.findElement(By.name("wd"));
		//��ͣ
		Thread.sleep(1000);
		//�����������������
		inputbox.sendKeys("selenium");
		//�ҵ��ٶ�һ�µİ�ť
		WebElement buton=driver.findElement(By.id("su"));
		//�����ť
		buton.click();
	}

}
