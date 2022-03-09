
//Map object de select element DIEGO ESTEPA 
package MapSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DemoQNav.DemoQBase;

public class MapobjectElementnewuser extends DemoQBase

{
	
	public MapobjectElementnewuser(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		
	}
	
	
	protected By txtNombre  = By.xpath("//input[@placeholder='First Name']");
	protected By txtApellido = By.xpath("//input[@placeholder='Last Name']");
	protected By txtEmail = By.xpath("//input[@id='userEmail']");
	protected By txtEdad = By.xpath("//input[@id='age']");
	protected By txtSalario = By.xpath("//input[@id='salary']");
	protected By txtDepartamento = By.xpath("//input[@id='department']");
	
	protected By btnSubmit = By.xpath("//button[@id='submit']");
	protected By btnDelete = By.xpath("//*[@id='delete-record-1']");
	
	
	


	
	
	
	////input[@placeholder="First Name"]
}


/*public PageObjectWidgets(WebDriver driver) {
super(driver);
this.driver = driver;
// TODO Auto-generated constructor stub
}

public void SelecBarraWidged(File rutaCarpeta) throws Exception {

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,1000)");

click(barraWidged, rutaCarpeta);
tiempoEspera(3000);

click(datePiker, rutaCarpeta);
tiempoEspera(3000);

} 
*/