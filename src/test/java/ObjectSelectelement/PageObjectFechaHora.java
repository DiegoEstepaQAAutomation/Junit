package ObjectSelectelement;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import MapSelect.MapObjectFechaHora;
import MapSelect.MapObjectWidget;
import UtilidadesExcel.ReadExcel;

public class PageObjectFechaHora extends MapObjectFechaHora
{
	
	public PageObjectFechaHora(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
	}
	
	public void AlertsSelect(ReadExcel leer, Properties propiedades,String numHoja,File rutaCarpeta) throws Exception 
	{
		
		
		
		click(alertsframe,rutaCarpeta);
		tiempoEspera(500);
		
		
		click(PageAlerts,rutaCarpeta);
		tiempoEspera(500);
		
		
		click(Button1,rutaCarpeta);
		driver.switchTo().alert().dismiss();
		tiempoEspera(500);
		
		click(Button2,rutaCarpeta);
		tiempoEspera(2000);
		driver.switchTo().alert().dismiss();
		tiempoEspera(500);
		
		click(Button3,rutaCarpeta);
		tiempoEspera(500);
		driver.switchTo().alert().accept();
		
		
		click(Button3,rutaCarpeta);
		tiempoEspera(500);
		driver.switchTo().alert().dismiss();
		tiempoEspera(500);
		
		click(Button4,rutaCarpeta);
		
		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,1));
		alert.accept();
		
		tiempoEspera(3000);
		
		

		
		
		
		
	}
	
	//Alert alert = driver.switchTo().alert();
	//alert.accept();
	

}
