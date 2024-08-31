package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class C1 {
	@Test
	public void test() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.quit();
		
		System.out.println("Saqeb");
	}
}
