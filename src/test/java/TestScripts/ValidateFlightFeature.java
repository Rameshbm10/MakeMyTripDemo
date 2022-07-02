package TestScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepo.Homepage;
import ObjectRepo.SearchInfoPage;
import Utility.BaseClass;

public class ValidateFlightFeature extends BaseClass
{
   @Test
   public void flightSearch() throws InterruptedException
   {
	   Homepage hp=new Homepage(driver);
	   //wait.until(ExpectedConditions.visibilityOf(hp.getFramepth()));
	   //hp.switcchToFrameAndClose(driver);
	   hp.selectOnewayTripRadioBtn();
	   hp.selectFromCityDD();
	   hp.enterCheckInn("DEL");
	   Thread.sleep(2000);
	   hp.selectFirstOpt();
	   //hp.selectToCityDD();
	   JavascriptExecutor jss=(JavascriptExecutor)driver;
	   Thread.sleep(2000);
	  // wait.until(ExpectedConditions.elementToBeClickable(hp.getToTxtField()));
	   //jss.executeScript("arguments[0].scrollIntoView(true)",hp.getToTxtField());
	   wait.until(ExpectedConditions.visibilityOf(hp.getToTxtField()));
	   hp.enterCheckOut("BOM");
	   hp.selectFirstOpt();
	   
	   Thread.sleep(5000);
	  // jss.executeScript("arguments[0].scrollIntoView(true)", hp.getBoardDate());
	   hp.closeLanCard();
	   hp.selectBoardDate();
	   hp.selectTravellersDD();
	   hp.clkApplyBtn();
	   hp.selectFareTypeRadioBtn();
	   hp.clkSearchBtn();
	   SearchInfoPage sip=new SearchInfoPage(driver);
	   sip.clkOnOkBtn();
	   String actPrice = sip.getFirstPrice();
	   System.out.println(actPrice);
	  // Assert.assertEquals(actPrice, "9400");
   }
}
