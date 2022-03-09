package MapSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DemoQNav.DemoQBase;

public class Mapselectelement extends DemoQBase
{
	
	public Mapselectelement(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		
	}
	
	//select element
	protected By btnSelectElement = By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]");
	protected By btnSelectWebTables = By.xpath("//li[@id=\'item-3']");
	protected By btnSelectAdd = By.xpath("//button[@id=\"addNewRecordButton\"]");
	
	
	
	
	
	
	
	

}
