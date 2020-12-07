package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class LandingPage {

	
	public WebDriver driver;
	
		
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		driver.get("http://automationpractice.com/index.php");
		
	}
	
	
	
	public WebElement SignInLink ()
	{
		WebElement SignInLink=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		return SignInLink;
	}
	
	public ArrayList<WebElement> MegaMenu ()
	{

		ArrayList<WebElement> MegaMenuItems= new ArrayList<WebElement>();
		List<WebElement> Category=driver.findElements(By.xpath("//*[@id=\"block_top_menu\"]/ul/li"));

		for(int i=0;i<Category.size();i++)

		{

		WebElement MainElement = Category.get(i);
		MegaMenuItems.add(MainElement);
		}
		return MegaMenuItems;
	}
	
	public ArrayList<WebElement> MegaSubMenu ()
	{

		ArrayList<WebElement> MegaSubMenuItems= new ArrayList<WebElement>();
		List<WebElement> Category=driver.findElements(By.xpath("//*[@id=\"block_top_menu\"]/ul/li"));

		for(int i=0;i<Category.size();i++)

		{
			//System.out.println("Maincat size is "+Category.size());
		Actions builder = new Actions(driver);
		WebElement MainElement = Category.get(i);
		//System.out.println(Category.get(i).getText());
		builder.moveToElement(MainElement).perform();
		int c=i+1;
		List<WebElement> SubCategory = driver.findElements(By.xpath("//*[@id=\"block_top_menu\"]/ul/li["+c+"]/ul/li"));

		//System.out.println(SubCategory);
		//System.out.println("Subcat size is "+SubCategory.size());
		for(int j=0;j<SubCategory.size();j++)
		{
			WebElement SubElement = SubCategory.get(j);
		//	System.out.println(SubElement.getText());
			System.out.println(SubElement.getText());
			MegaSubMenuItems.add(SubElement);
		}
		}
		return MegaSubMenuItems;
	}
		public ArrayList<WebElement> ClickItems ()

		{
		ArrayList<WebElement> AllProducts= new ArrayList<WebElement>();
		List<WebElement> productList=driver.findElements(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li"));

		for(int i=0;i<productList.size();i++)

		{

		WebElement element = productList.get(i);
		int c=i+1;
		List<WebElement> productName= driver.findElements(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li["+c+"]/div[1]/div[2]/h5[1]/a[1]"));
		for(int j=0;j<productName.size();j++)
		{
			WebElement SubElement = productName.get(j);
	//		System.out.println(SubElement.getText());			
			AllProducts.add(SubElement);
			
		}


		}
		return AllProducts;
	}
	}
	
