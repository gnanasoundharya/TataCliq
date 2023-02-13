package finalassesment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.event.MenuKeyEvent;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tatacliq {
	 WebDriver driver; 
		String url1="https://www.tatacliq.com/";

		@BeforeTest(enabled = true)
		public void title() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(url1);
			driver.manage().window().maximize();
			System.out.println(driver.getCurrentUrl());
			driver.getTitle();
			System.out.println(driver.getTitle());			
			Thread.sleep(8000);

}
		
		@Test(enabled = true,priority = 0)
		public void robot01() throws InterruptedException, AWTException
    {
        driver.findElement(By.id("wzrk-cancel")).click();
        Thread.sleep(9000);
        WebElement searchAt = driver.findElement(By.id("search-text-input"));
        searchAt.sendKeys("kurtas sets for Women");
        searchAt.sendKeys(Keys.ENTER);
        Thread.sleep(9000);
        WebElement imgAt =driver.findElement(By.xpath("//div[@id='ProductModule-MP000000014487205'][1]"));
        imgAt.click();
        Thread.sleep(7000);
        Robot ro=new Robot();
        ro.keyPress(KeyEvent.VK_PAGE_DOWN);       
 
 }
		@Test(enabled = true,priority = 1)
    public void tabhandle() throws InterruptedException
    {
	Thread.sleep(9000);
    	ArrayList<String> tabs1= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		driver.close();		
		ArrayList<String> tabs2= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(9000);
    }

@Test(enabled = true,priority = 2)
public void windowhandle() throws InterruptedException, AWTException
{
	WebElement imgAt =driver.findElement(By.xpath("//div[@id='ProductModule-MP000000014487205'][1]"));
Actions act=new Actions(driver);
act.contextClick(imgAt).build().perform();
Thread.sleep(6000);
Robot rc=new Robot();
rc.keyPress(MenuKeyEvent.VK_DOWN);
Thread.sleep(9000);
rc.keyPress(MenuKeyEvent.VK_DOWN);
rc.keyPress(MenuKeyEvent.VK_ENTER);
Thread.sleep(9000);
ArrayList<String> window1= new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(window1.get(1));
driver.close();
Thread.sleep(6000);
ArrayList<String> window2= new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(window1.get(0));
}
@Test(enabled=true,priority = 3)
public void screenshot() throws IOException, InterruptedException
{
	File harya=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(harya,new File("C:/Users/user/Desktop/selenium screenshot/1.png"));
	Thread.sleep(5000);
}
@Test (enabled = true,priority = 4)
public void close()
{
	driver.close();
}


//@Test
		public void category() throws InterruptedException
		{
			driver.findElement(By.id("wzrk-cancel")).click();
			//Actions act =new Actions
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//a[@class='wzrkClose']")).click();
			//driver.findElement(By.xpath("//div[@class='DesktopHeader__categoryAndBrand'][1]")).click();
			driver.findElement(By.xpath("//div[@class='DesktopHeader__arrow'][1]")).click();//categories
			//driver.findElement(By.xpath("//div[class='DesktopHeader_catergoryDetailsValueWithArrow']")).click();
			//driver.findElement(By.className("div.DesktopHeader__categoryDetailsValueWithArrow")).click();
			//Actions act=new Actions(driver);
			//Thread.sleep(3000);
			//WebElement web=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]]"));
			//web.click();
			//driver.findElements(By.className("DesktopHeader__subCategoryDetailsValues"));
			//WebElement web=driver.findElement(By.cssSelector("div.App__base div.DesktopHeader__stickyBase.DesktopHeader__base div.DesktopHeader__headerHolder div.DesktopHeader__headerFunctionality div.DesktopHeader__lowerHeader div.DesktopHeader__leftTabHolder div.DesktopHeader__categoryAndBrand:nth-child(1) > div.DesktopHeader__arrow"));
			//act.moveToElement(web).build().perform();
			//act.click().build().perform();
			WebElement web01=driver.findElement(By.linkText("Beauty"));
			web01.click();
			
		}
		//WebElement web =driver.findElement(By.linkText("Size guide"));
	       // web.click();
	           
	       // WebElement web1=driver.findElement(By.xpath("[@id=\"root\"]/div/div[3]/div/div[1]/div[2]/div[3]/div[2]/div/div[2]/div[4]/div/div"));
	        //WebElement web1=driver.findElement(By.cssSelector("div.App__base div.PdpFrame__base div.ProductDescriptionPage__base div.ProductDescriptionPage__pageCenter div.ProductDescriptionPage__content div.ProductDescriptionPage__horizontalOffset:nth-child(3) div.ProductDescriptionPage__sizeHolder div.SizeSelector__size div:nth-child(2) div.SizeSelector__size:nth-child(3) div.SizeSelect__baseActive.SizeSelect__base div.SizeSelect__selected.SizeSelect__textHolder > h4:nth-child(1)"));
	       //WebElement web1=driver.findElement(By.xpath("//div[@class='UnderLinedButton__base']"));
	      // web1.click();
	        //web1.click();        
		   // WebElement web2=driver.findElement(By.className("Button__base"));
	        //web2.click();
	        
}

