package com.xero.teststeps;

import org.junit.Assert;

import com.xero.ui.po.DashBoardPage;
import com.xero.util.BaseTestObject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QuoteSteps extends BaseTestObject {
	
	@When("I should be able to create new quote")
	public void i_should_be_able_to_create_new_quote() throws Exception {
	    
		dashBoardPage = new DashBoardPage(driver);
		dashBoardPage.getTopHeaderPart().clickBusinessSelection();
		quotesPage = dashBoardPage.getTopHeaderPart().selectQuotes();
		newQuotePage = quotesPage.clickNewQuoteButton();
		Assert.assertTrue(newQuotePage.isNewQuoteLabelDisplayed(50));
		
	}
	
	@When("Enter contact data as {string} and Item as {string}")
	public void enter_contact_data_as_and_item_as(String contactInfo, String item) throws Exception {
	    
		newQuotePage.enterContactInfo(contactInfo);
		newQuotePage.enterItem(item);
		
	}
	
	@When("Verify display subtotal as {string} and total GST as {string} and Total as {string}")
	public void verify_display_subtotal_as_and_total_gst_as_and_total_as(String subTotal, String totalGST, String total) {
	    
		Assert.assertEquals(subTotal, newQuotePage.getSubtotal());
		Assert.assertEquals(totalGST, newQuotePage.getTotalGST());
		Assert.assertEquals(total, newQuotePage.getTotal());
		
	}
	
	@When("Send quote and verify subtotal as {string} and total GST as {string} and Total as {string}")
	public void send_quote_and_verify_subtotal_as_and_total_gst_as_and_total_as(String subTotal, String totalGST, String total) throws Exception {
	  
		newQuotePage.clickSend();
		viewQuotePage = newQuotePage.clickSendEmail();
		Assert.assertEquals(subTotal, viewQuotePage.getSubtotal());
		Assert.assertEquals(totalGST, viewQuotePage.getTotalGST());
		Assert.assertEquals(total, viewQuotePage.getTotal());
		Assert.assertTrue(viewQuotePage.isMarkAsAcceptedButtonDisplayed());
		Assert.assertFalse(viewQuotePage.isCreateInvoiceButtonDisplayed());
		
	}
	
	@Then("Accept the quote and create invoice")
	public void accept_the_quote_and_create_invoice() throws Exception {
	    
		viewQuotePage.clickMarkAsAcceptedButton();
		Assert.assertTrue(viewQuotePage.isCreateInvoiceButtonDisplayed());
		Assert.assertFalse(viewQuotePage.isMarkAsAcceptedButtonDisplayed());
		viewQuotePage.clickCreateInvoiceButton();
		newInvoicePage = viewQuotePage.clickCreateInvoiceConfirmButton();
		
	}

}
