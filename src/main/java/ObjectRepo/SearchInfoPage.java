package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchInfoPage
{
	public SearchInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='OKAY, GOT IT!']")
	private WebElement okBtn;
	
	@FindBy(xpath="(//div[@class='textRight flexOne'])[1]")
	private WebElement firstPrice;
	
	@FindBy(xpath="(//button[@class='button actionBtn '])[1]")
	private WebElement viewAllDropdown;
	
	public void clkOnOkBtn()
	{
		okBtn.click();
	}
	public String getFirstPrice()
	{
		String price = firstPrice.getText();
		return price;
	}
	public void clkViewAllDD()
	{
		viewAllDropdown.click();
	}
}
