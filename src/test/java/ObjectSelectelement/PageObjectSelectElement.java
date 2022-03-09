package ObjectSelectelement;

import java.io.File;

import org.openqa.selenium.WebDriver;

import MapSelect.Mapselectelement;

public class PageObjectSelectElement extends Mapselectelement
{
	
	public PageObjectSelectElement(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
	}
	
	
	
	public void seleccionDemoQ( File rutaCarpeta) throws Exception
	{
		//OBTENER EL NOMBRE DEL METODO A EJECUTAR
	    //String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			
	    //CREAR CARPETA PARA EL ALMACENAMIENTO DE IMAGENES
		//File rutaCarpeta = crearCarpeta(propiedades,nomTest);
		
		
		//click(TxtBusquedaMercadoLibre, nomTest);
		//tiempoEspera(2000);
		
				
		//click(pro, nomTest);
		//tiempoEspera(2000);
		
		
		click(btnSelectElement,rutaCarpeta);
		tiempoEspera(2000);
		
		
		
		click(btnSelectWebTables, rutaCarpeta);
		tiempoEspera(2000);
		
		
		click (btnSelectAdd, rutaCarpeta);
		tiempoEspera(2000);
		
		
		
		
		
		//click(btnContinuar,rutaCarpeta);
		//tiempoEspera(2000);

		
		//click(btnRevisar, rutaCarpeta);
		//tiempoEspera(2000);
		
		//sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"),"prueba2",1,2),txtMail,rutaCarpeta);
		//tiempoEspera(2000);

		
		
		
		//click(btnEnviarMail, nomTest);
		//driver.close();

	}


}
