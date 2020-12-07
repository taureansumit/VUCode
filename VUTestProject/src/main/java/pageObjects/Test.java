package pageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import resources.base;



public class Test {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\U\\TrainingDocs\\Selenium\\chromedriver.exe");



WebDriver driver=new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
LandingPage l=new LandingPage(driver);

ArrayList<WebElement> MegaSubMenuItems= new ArrayList<WebElement>();
List<WebElement> Category=driver.findElements(By.xpath("//*[@id=\"block_top_menu\"]/ul/li"));

for(int i=0;i<Category.size();i++)

{
	System.out.println("Maincat size is "+Category.size());
Actions builder = new Actions(driver);
WebElement MainElement = Category.get(i);
//System.out.println(Category.get(i).getText());
builder.moveToElement(MainElement).perform();
int c=i+1;
List<WebElement> SubCategory = driver.findElements(By.xpath("//*[@id=\"block_top_menu\"]/ul/li["+c+"]/ul/li"));

//System.out.println(SubCategory);
System.out.println("Subcat size is "+SubCategory.size());
for(int j=0;j<SubCategory.size();j++)
{
	WebElement SubElement = SubCategory.get(j);
	System.out.println(SubElement.getText());
	MegaSubMenuItems.add(SubElement);
}
}
}
}



