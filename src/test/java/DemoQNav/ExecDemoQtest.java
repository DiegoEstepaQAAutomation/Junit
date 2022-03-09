package DemoQNav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import ObjectSelectelement.PageObjectFechaHora;
import ObjectSelectelement.PageObjectSelectElement;
import ObjectSelectelement.PageObjectTextoElement;
import ObjectSelectelement.PageObjectWidget;
import UtilidadesExcel.ReadExcel;
import UtilidadesExcel.WriteExcel;


public class ExecDemoQtest 
{
	
	private WebDriver driver;
	Properties propiedades;
	ReadExcel leer;
	WriteExcel escribir;
	PageObjectSelectElement selecObject;
	String  url = null;
	PageObjectTextoElement paginas;
	PageObjectWidget  widget;
	PageObjectFechaHora fechaHora;
	
	
	@Before
	public void setUp() throws InterruptedException, IOException 
	{
		

		driver= DemoQBase.chromeDriverConnection();
		
		
		fechaHora = new PageObjectFechaHora(driver);
		//ACCESOS PORTABLES DEL NAVEGADOR
		selecObject = new PageObjectSelectElement(driver);
		// INSTANCIAR LA CLASE PROPIEDADES DE JAVA UNIT
		propiedades = new Properties();
		//claseBase= new ClaseBase(driver);
		//ACCESOS PORTABLES DEL NAVEGADOR(VAN EN CADA CASO DE PRUEBA)
	    //driver = claseBase.chromeDriverConnection();
		paginas = new PageObjectTextoElement(driver);
		
		widget = new PageObjectWidget(driver);
	
		//INSTANCIAR CLASES DE EXCEL 
		leer = new ReadExcel();
		escribir = new WriteExcel();

		// CREAR LA VARIABLE TIPO INPUTSTRING
		InputStream entrada = null;

		// VALIDAR SI GENERA ERROR AL NO ENCONTRAR EL ARCHIVO
		try {
			entrada = new FileInputStream("./Properties/datos.propiedades");
			propiedades.load(entrada);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
			// TODO: handle exception
		}
		// INSTANCIAR LA CLASE PAGOBJET
		//paginas = new PagsObjeInicioPrueba(driver);

		// ASIGNAMOS LAS OPCIONES Y LA CONFIGURACION DEL NAVEGADOR A LA VARIABLE DRIVER

		//driver = paginas.chromeDriverConnection();

		// ACCEDER AL METODO DE ABRIR LA PAGINA

		
	}
	
	
	//METDODO DE ACCESO A MERCURY VIAJES
	@Test
	public void busquedaDemoq() throws Exception
	{
		if(leer.getCellValue(propiedades.getProperty("PathExcel"),"Hoja1",0,0).equals("Si")) 
		{ 
		
		
		
		
		
			
	    //OBTENER EL NOMBRE DEL METODO A EJECUTAR
	    String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			
	    //CREAR CARPETA PARA EL ALMACENAMIENTO DE IMAGENES
	    File rutaCarpeta = paginas.crearCarpeta(propiedades,nomTest);
				
					
		//ACCESO AL DRIVER DEL NAVEGADOR
		//driver = demobase.chromeDriverConnection();
		
				
		//INSTANCIACION DE LA VARIABLE URL A UN DOCUMENTO EXCEL 
	    //url = leer.getCellValue(propiedades.getProperty("PathExcel"),"Hoja2",0,1);
	    
	    
		
		//ENTRADAS AL METODO urlACCESO
	    paginas.urlAcceso(leer.getCellValue(propiedades.getProperty("PathExcel"),"Hoja1",0,1));
		
		selecObject.seleccionDemoQ(rutaCarpeta);
		
		paginas.EnvioTexto(leer, propiedades, "Hoja2",rutaCarpeta );
		
		
		widget.SelectWidget(leer, propiedades, "Hoja3", rutaCarpeta);
		
		fechaHora.AlertsSelect(leer, propiedades, "Hoja2", rutaCarpeta);
		
		
		
		
		
		
		
		}
		
		
		
		
		}
		
		
		
		
	
	
	@After
	public void cerrar() {
		driver.quit();
	}
	

	

}
