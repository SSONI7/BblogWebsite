package Bblog.testcase;


import org.testng.annotations.Test;

import Bblog.basepage.Bblog_FirstMain_Page;
import Bblog.basepage.Bblog_SignIn_Page;



public class TC01 extends CommonClass {

	
  @Test
  public void BblogTestCase(){
	 
	  Bblog_FirstMain_Page mainpage = new Bblog_FirstMain_Page(driver);
	  Bblog_SignIn_Page signin = new  Bblog_SignIn_Page(driver);
	  
	  
	  driver.get("https://candidatex:qa-is-cool@qa-task.backbasecloud.com/#/login");
	  signin.SignInMethod();
	  mainpage.NewPostLink();
	  mainpage.CreatePost();
	  mainpage.EditPost();
	  mainpage.ScrollDown();
	  mainpage.VerifingTag();
	  mainpage.Scrollup();
	  mainpage.NameLink();
	  mainpage.FavouriteClick();
	  mainpage.FavouriteSection();
	  mainpage.VerifingArticle();
	  mainpage.DeleteArticle();
	  
	  


	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  FirstMainPage mainpage = PageFactory.initElements(driver,FirstMainPage.class);
//	  mainpage.Buttonclick();
//	  mainpage.CheckoutButtonClick();
//	  OrderSummary ordersummary = PageFactory.initElements(driver,OrderSummary.class);  
//	  ordersummary.ContinueButton();
//	  ordersummary.CreditCard();
//	  ordersummary.CardDetails();
//	  IssuingBank issuingbank = PageFactory.initElements(driver,IssuingBank.class);
//	  issuingbank.OTPdetails();
//	  
  }

}
