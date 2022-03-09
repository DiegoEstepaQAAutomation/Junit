package ObjectSelectelement;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import MapSelect.MapobjectElementnewuser;
import MapSelect.Mapselectelement;
import UtilidadesExcel.ReadExcel;


public class PageObjectTextoElement extends MapobjectElementnewuser
{
	
	
	public PageObjectTextoElement(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
	}
	
	//Metodo envio desde excel
	public void EnvioTexto(ReadExcel leer, Properties propiedades,String numHoja,File rutaCarpeta ) throws Exception 
	{
		
		//Envio de texto desde el excel
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,0),txtNombre,rutaCarpeta);
		tiempoEspera(500);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,1),txtApellido,rutaCarpeta);
		tiempoEspera(500);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,2),txtEmail,rutaCarpeta);
		tiempoEspera(500);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,3),txtEdad,rutaCarpeta);
		tiempoEspera(500);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,4),txtSalario,rutaCarpeta);
		tiempoEspera(500);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),numHoja,1,5),txtDepartamento,rutaCarpeta);
		tiempoEspera(500);
		
		//Enviar la informacion suministrada en los campos al server
		click(btnSubmit, rutaCarpeta);
		tiempoEspera(500);
		
		//eliminacion de campo
		click(btnDelete, rutaCarpeta);
		tiempoEspera(500);
		
				
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
