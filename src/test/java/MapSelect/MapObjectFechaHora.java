package MapSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DemoQNav.DemoQBase;

public class MapObjectFechaHora  extends DemoQBase
{
	public MapObjectFechaHora(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		
	}
	
	protected By alertsframe= By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]");
	protected By PageAlerts = By.xpath("//span[contains(text(),'Alerts')]");
	
	protected By Button1 = By.xpath("//button[@id='alertButton' ]");
	
	
	protected By Button2= By.xpath("//button[@id='timerAlertButton' ]");
	
	protected By Button3 = By.xpath("//button[@id='confirmButton' ]");
	
	protected By Button4 = By.xpath("//button[@id='promtButton' ]");
	
	
	//Fecha,Dia y Hora
	
		
		

}
