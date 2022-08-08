package org.xpath;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","D:\\Study\\Java\\xpath\\driver\\chromedriver.exe" );
	WebDriver drive =new ChromeDriver();
	drive.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	
//	WebElement textFacebook = drive.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
//	String text = textFacebook.getText();
//	System.out.println(text);
//	
//	drive.close();
//	
//	File file = new File("D:\\FilesPrabhu\\Prabhu.txt");
//	boolean createNewFile = file.createNewFile();
//	System.out.println(createNewFile);
//	
//	FileUtils.write(file,text,false);
//	
//	List<String> readLines = FileUtils.readLines(file);
//	int size = readLines.size();
//	System.out.println(size);
//	
//	String[] split = text.split(" ");
//	for(String splittext:split) {
//		System.out.println(splittext);
//		int lengthOfLetter = splittext.length();
//		System.out.println("length contains in the word "+lengthOfLetter);
//	}
//	
//	System.out.println();
//
//	int lengthOfWords = split.length;
//	System.out.println("word containd in the line "+lengthOfWords);
//	
	
	drive.navigate().to("https://www.flipkart.com/");
	
	Thread.sleep(3000);
//	
//	WebElement close = drive.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//	close.click();
//	
	
	JavascriptExecutor j = (JavascriptExecutor) drive;
//	j.executeScript ("window.scrollBy(0,500)");
//	
//	Thread.sleep(3000);
//	
//	j.executeScript("window.scrollBy(0,-500)");
	
	
	drive.navigate().to("http://www.greenstechnologys.com/");
	
	Thread.sleep(3000);
	
	WebElement scrldown = drive.findElement(By.xpath("(//div[@class='trainer-info'])[2]"));
	j.executeScript("arguments[0].scrollIntoView(true)", scrldown);
	
	
	drive.navigate().to("http://demo.automationtesting.in/Alerts.html");
	
	WebElement simpleAlertButton = drive.findElement(By.xpath("//a[text()='SwitchTo']"));
	simpleAlertButton.click();
	Thread.sleep(3000);
	
	Alert alert = drive.switchTo().alert();
	Thread.sleep(3000);
	alert.accept();
	
	
	
	 
	
	
}

}
