package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
    public Homepage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//iframe[@title='Sign in with Google Dialogue']")
    private WebElement defaultLoginFrame;
    public WebElement getFramepth()
    {
    	return defaultLoginFrame;
    }
    @FindBy(xpath="//div[@id='close']")
    private WebElement closeframe;
    public void switcchToFrameAndClose(WebDriver driver)
    {
    	driver.switchTo().frame(defaultLoginFrame);
    	closeframe.click();
    }
    
    @FindBy(xpath="//li[@class='menu_Flights']")
    private WebElement flightsMenu;
    public void flightmenu()
    {
    	flightsMenu.click();
    }
    @FindBy(xpath="//li[text()='OneWay']")
    private WebElement oneWayRadioBtn;
    public void selectOnewayTripRadioBtn()
    {
    	oneWayRadioBtn.click();
    }
    
    @FindBy(xpath="//input[@id='fromCity']")
    private WebElement fromCityDropdown;
    public void selectFromCityDD()
    {
    	fromCityDropdown.click();	
    }
    
    @FindBy(xpath="//input[@id='toCity']")
	private WebElement toCityDropdown;
    public void selectToCityDD()
    {
    	toCityDropdown.click();
    }
    
    @FindBy(xpath="//input[@id='departure']")
    private WebElement departureDropdown;
    public void selectDepartureDD()
    {
    	departureDropdown.click();
    }
    
    @FindBy(xpath="//span[text()='RETURN']")
    private WebElement returnDropdown;
    public void selectReturnDD()
    {
    	returnDropdown.click();
    }
    
    @FindBy(xpath="//span[text()='Travellers & CLASS']")
    private WebElement travellersDropdown;
    public void selectTravellersDD()
    {
    	travellersDropdown.click();
    }
    
    @FindBy(xpath="//p[text()='Regular ']")
    private WebElement fareType;
    public void selectFareTypeRadioBtn()
    {
    	fareType.click();
    }
    
    @FindBy(xpath="//a[text()='Search']")
    private WebElement searchBtn;
    public void clkSearchBtn()
    {
    	searchBtn.click();
    }
    
    @FindBy(xpath="//input[@placeholder='From']")
    private WebElement fromTxtField;
    public void enterCheckInn(String src)
    {
    	fromTxtField.clear();
    	fromTxtField.sendKeys(src);
    }
    
    @FindBy(xpath="//input[@placeholder='To']")
    private WebElement toTxtField;
    public void enterCheckOut(String dst)
    {
    	toTxtField.clear();
    	toTxtField.sendKeys(dst);
    }
    public WebElement getToTxtField()
    {
    	return toTxtField;
    }
    
    @FindBy(xpath="//span[@aria-label='Next Month']")
    private WebElement nextMonArrow;
    public void clkNextArrow()
    {
    	nextMonArrow.click();
    }
    
    @FindBy(xpath="//span[@aria-label='Previous Month']")
    private WebElement prevMonArrow;
    public void clkPreviousArrow()
    {
    	prevMonArrow.click();
    }
    
    @FindBy(xpath="//span[@class='langCardClose']")
    private WebElement langCard;
    public void closeLanCard()
    {
    	langCard.click();
    }
    
    @FindBy(xpath="(//p[text()='15'])[1]")//(//p[text()='15'])[2]
    private WebElement boardDate;
    public void selectBoardDate()
    {
    	boardDate.click();
    }
    public WebElement getBoardDate()
    {
    	return boardDate;
    }
    
    @FindBy(xpath="//p[contains(.,'Chhatrapati Shivaji International Airport')]")
    private WebElement mumbaiOpt;
    public void selectMumOpt()
    {
    	mumbaiOpt.click();
    }
    
    @FindBy(xpath="//div[text()='BOM']")
    private WebElement mumbaiOpt2;
    public void selectMumByCode()
    {
    	mumbaiOpt2.click();
    }
    
	@FindBy(xpath="(//ul[@role='listbox'])[1]/li[1]")
	private WebElement firstOpt;
	public void selectFirstOpt()
	{
		firstOpt.click();	
	}
	
	@FindBy(xpath="//li[@data-cy='adults-1']")
	private WebElement oneAdult;
	public void selectSingleAdult()
	{
		oneAdult.click();
	}
	
	@FindBy(xpath="//li[@data-cy='children-0']")
	private WebElement zeroChild;
	public void selectZeroChild()
	{
		zeroChild.click();
	}
	
	@FindBy(xpath="//li[@data-cy='infants-0']")
	private WebElement zeroInfant;
	public void selectZeroInfant()
	{
		zeroInfant.click();
	}
	
	@FindBy(xpath="//li[@data-cy='travelClass-0']")
	private WebElement economyOrpremiumClass;
	public void selectTravelClass()
	{
		economyOrpremiumClass.click();
	}
	
	@FindBy(xpath="//button[text()='APPLY']")
	private WebElement applyBtn;
	public void clkApplyBtn()
	{
		applyBtn.click();
	}
}
