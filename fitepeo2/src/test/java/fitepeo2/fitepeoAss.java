package fitepeo2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fitepeoAss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fitpeo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[contains(text(),'Revenue Calculator')]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down the page
		js.executeScript("window.scrollBy(0, window.innerHeight);");
		WebElement textbox = driver.findElement(By.id(":r0:"));
		textbox.sendKeys(Keys.CONTROL, "a");
		textbox.sendKeys(Keys.BACK_SPACE);
		int value = 560;
		WebElement sliderball = driver.findElement(By.xpath("//input[@type='range']"));
		for (int i = 1; i <= value; i++) {
			sliderball.sendKeys(Keys.ARROW_UP);

		}
		WebElement v = driver.findElement(By.xpath("//p[text()='Total Individual Patient/Month']/following-sibling::p"));
		String p = v.getText();

		String PatientMonth = "560";
		if (PatientMonth.equals(p)) {
			System.out.println(" test case pass");

		} else {
			System.out.println("test cases fail");
		}
		driver.navigate().refresh();
		

		// Scroll down the page
		js.executeScript("window.scrollBy(0, window.innerHeight);");
		WebElement textbox1= driver.findElement(By.xpath("//input[@type='number']"));
		
		textbox1.sendKeys(Keys.CONTROL,"a");
		textbox1.sendKeys(Keys.BACK_SPACE);
		WebElement sliderball1 = driver.findElement(By.xpath("//input[@type='range']"));
		int  value2=820;
		for(int j=1;j<=value2;j++) {
		sliderball1.sendKeys(Keys.ARROW_UP);
		}
		WebElement y = driver.findElement(By.xpath("//p[text()='Total Individual Patient/Month']/following-sibling::p"));
		String PatientMonth2 = "820";
		String o=y.getText();
		if(o.equals(PatientMonth2)) {
			System.out.println(" 820 number testcase pass");
		}else {
			System.out.print("820 number testcases fail");
		}
		js.executeScript("window.scrollBy(0, window.innerHeight);");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		js.executeScript("window.scrollBy(0, window.innerHeight);");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		WebElement e=driver.findElement(By.xpath("//p[contains(text(),'Patients Per Month:')]//p"));
		String PerMonth= e.getText();
	
		System.out.println(PerMonth);
		String amount="$110700";
		if(PerMonth.equals(amount)) {
			System.out.println("test cases per month pass");
		}else {
			System.out.println("test cases per month fail");
		}
		

	}

}
