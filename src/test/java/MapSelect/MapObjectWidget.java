package MapSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DemoQNav.DemoQBase;

public class MapObjectWidget extends DemoQBase
{
	public MapObjectWidget(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		
	}
	
	
	protected By btnnextMonth = By.xpath("//button[@aria-label='Next Month']");
	protected By btnLastmonth = By.xpath("//button[@aria-label='Previous Month']");
	
	
	//Scroll dia primera barra
	protected By scrollMonthSelector1 = By.xpath("//select[@class='react-datepicker__month-select']");
	protected By scrollYearSelector1 = By.xpath("//select[@class='react-datepicker__year-select']");
	protected By Dayselected = By.xpath("//div[@aria-label='Choose Wednesday, February 16th, 2022']");
	protected By btnWidgetSelec= By.xpath("//*[@class='left-pannel']/div/div[4]");
	protected By btnDatePicker = By.xpath("//*[@class='element-list collapse show']/ul/li[3]");
	protected By btnSelectDate = By.xpath("//*[@class = 'react-datepicker']/div/div[2]/div[3]/div[5]");
	protected By SearchDate = By.xpath("//*[@id='datePickerMonthYearInput']");
	protected By btnFechayHora = By.xpath("//*[@id='dateAndTimePickerInput']");
	
	
	protected By AñodosmilVentiuno = By.xpath("//option[@value='2021']");
	protected By MesCuarto = By.xpath("//option[@value='4']");
	
	
	protected By ScrollMonthSelector = By.xpath("//span[@class='react-datepicker__month-read-view--selected-month']  ");
	
	protected By Year2020 = By.xpath("//div[@class='react-datepicker__year-dropdown']/div[8]");
	protected By ScrollYearSelector= By.xpath("//div[@class='react-datepicker__year-read-view']");
	
	protected By BringMonth = By.xpath("//div[@class='react-datepicker__month-dropdown']/div[4]");
	
	protected By TimeListScroll = By.xpath("//ul[@class='react-datepicker__time-list'] ");
	protected By Daywithtimer = By.xpath("//div[@class='react-datepicker__day react-datepicker__day--004 react-datepicker__day--weekend']");
	
	protected By TimeSelector = By.xpath("//ul[@class='react-datepicker__time-list']/li[29]");  	
	
	
	

}
