package automationprojectFLIPKART;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Project {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_7qhce485bd_");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act=new Actions(d);
		WebElement findElement = d.findElement(By.id("nav-link-accountList"));
		act.moveToElement(findElement).click().perform();
		
		d.findElement(By.id("ap_email")).sendKeys("6382519651");
		d.findElement(By.id("continue")).click();
		
		d.findElement(By.id("ap_password")).sendKeys("Sudharsen");
		d.findElement(By.id("signInSubmit")).click();
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("boat earphones");
		d.findElement(By.id("nav-search-submit-button")).click();
		act.scrollByAmount(0, 200).perform();
		WebElement f1 = d.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61lYn7-+w9L._"
				+ "AC_UY218_.jpg']"));
		f1.click();
		
		Set <String> set=d.getWindowHandles();
		List<String> win=new ArrayList<String>(set);
		d.switchTo().window(win.get(1));
		act.scrollByAmount(0, 300).perform();
		
		d.findElement(By.id("add-to-cart-button")).click();
		d.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
		WebElement del = d.findElement(By.xpath("//input[@aria-label='Delete boAt Newly Launched "
				+ "Airdopes 141 ANC TWS Earbuds with 42 hrs Playback, 50 ms Low Latency BEAST&trade;Mode, "
				+ "IWP&trade;Tech,Signature Sound, Quad Mics with ENx&trade;, ASAP&trade; Charge, USB Type-C Port &amp; IPX5(Gunmetal black)']"));
	    act.moveToElement(del).click().perform();
	    Thread.sleep(2000);
	    WebElement findElement2 = d.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']"));
	    act.moveToElement(findElement2).click().perform();
	    Thread.sleep(2000);
	    WebElement findElement3 = d.findElement(By.id("nav-hamburger-menu"));
	    act.moveToElement(findElement3).click().perform();
	    Thread.sleep(2000);
	    act.scrollByAmount(0,1000).perform();
	    d.findElement(By.xpath("//a[text()='Sign Out']")).click(); 
	    Thread.sleep(4000);
	    d.quit();
	    
	}

}
