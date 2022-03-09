package ObjectSelectelement;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import MapSelect.MapObjectWidget;
import UtilidadesExcel.ReadExcel;

public class PageObjectWidget extends MapObjectWidget 
{
	public PageObjectWidget(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
	}
	
	public void SelectWidget(ReadExcel leer, Properties propiedades,String numHoja,File rutaCarpeta) throws Exception 
	{
		
		
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		
		
		click(btnWidgetSelec,rutaCarpeta);
		tiempoEspera(500);
		
		click(btnDatePicker,rutaCarpeta);
		tiempoEspera(500);
		
		controla(SearchDate,rutaCarpeta);
		tiempoEspera(500);
		
		
		//borrar(SearchDate,rutaCarpeta);
		//tiempoEspera(500);
		
		teclaborrar(SearchDate,rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,0),SearchDate,rutaCarpeta);
		tiempoEspera(500);
		
		intro(SearchDate,rutaCarpeta);
		
		
		click(btnFechayHora ,rutaCarpeta);
		
		//intro(btnDatePicker,rutaCarpeta);
		
		
		
		controla(btnFechayHora,rutaCarpeta);
		tiempoEspera(500);
		
		teclaborrar(btnFechayHora,rutaCarpeta);
		
		String dt = (leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,0)+" , " +(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,1)));
		
		sendkey(dt,btnFechayHora,rutaCarpeta);
		
		intro(btnFechayHora,rutaCarpeta);
		tiempoEspera(1000);
		
		/*
		click(SearchDate,rutaCarpeta);
		tiempoEspera(500);
		
		click(scrollMonthSelector1,rutaCarpeta);
		tiempoEspera(500);
		
		click(MesCuarto,rutaCarpeta);
		tiempoEspera(500);
		
		
		click(scrollYearSelector1,rutaCarpeta);
		tiempoEspera(500);
		
		click(AñodosmilVentiuno,rutaCarpeta);
		tiempoEspera(500);
		
		click(btnSelectDate,rutaCarpeta);
		tiempoEspera(500);
		
		
		click(btnFechayHora,rutaCarpeta);
		tiempoEspera(1000);
		
		
		click(ScrollMonthSelector,rutaCarpeta);
		tiempoEspera(1000);
		
		click(BringMonth,rutaCarpeta);
		tiempoEspera(1000);
		
		
		click(ScrollYearSelector,rutaCarpeta);
		tiempoEspera(1000);
		
		click(Year2020,rutaCarpeta);
		tiempoEspera(1000);
		
		//click(TimeSelector,rutaCarpeta);
		//tiempoEspera(1000);
		
		//click(Daywithtimer,rutaCarpeta);
		//tiempoEspera(1000);  */

		
		
		//sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,0,1),BringMonth,rutaCarpeta);
				//tiempoEspera(500);
		
		/*sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,0,1),btnnextMonth,rutaCarpeta);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		 
		tiempoEspera(500);
		
		
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,0,1),btnLastmonth,rutaCarpeta);
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		 
		tiempoEspera(500);*/
		
		
		
		
		//click(Dayselected,rutaCarpeta);
		//tiempoEspera(500);
		
		
		
		
		//sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,0,1),scrollMonthSelector,rutaCarpeta);
		 
		//sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,1),scrollYearSelector,rutaCarpeta);
		
		
		
		
		//sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,0,1),scrollMonthSelector,rutaCarpeta);
		 
		 
		 //sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,1),scrollYearSelector,rutaCarpeta);
			 
			 
		 //sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,2),Dayselected,rutaCarpeta);
			
		 
		
		 
		 

		 
	    // JavascriptExecutor js2=(JavascriptExecutor)driver;
		// js1.executeScript("window.scrollBy(0,100)");
		 
		 
		 
		 
		 
		 
		
	}

}
