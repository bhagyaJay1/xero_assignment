package com.xero.teststeps;

import org.junit.Assert;

import com.xero.ui.po.NewInvoicePage;
import com.xero.util.BaseTestObject;
import io.cucumber.java.en.Then;

public class InvoiceSteps extends BaseTestObject {
	
	@Then("Verify data displayed in the invoice subtotal as {string} and GST presentage as {string} and total GST as {string} and Total as {string}")
	public void verify_data_displayed_in_the_invoice_subtotal_as_and_gst_presentage_as_and_total_gst_as_and_total_as(String subTotal, String gstPresentage, String totalGST, String total) {
	    
		newInvoicePage = new NewInvoicePage(driver);
		Assert.assertTrue(newInvoicePage.isNewInvoiceLabelDisplayed(50));
		Assert.assertEquals(subTotal, newInvoicePage.getSubtotal());
		Assert.assertTrue(newInvoicePage.getTotalGSTPresentage().contains(gstPresentage));
		Assert.assertEquals(totalGST, newInvoicePage.getTotalGSTValue());
		Assert.assertEquals(total, newInvoicePage.getTotal());
		
	}

	
	@Then("save the invoice as draft")
	public void save_the_invoice_as_draft() {
	    newInvoicePage.clickSavebtn();
	    newInvoicePage.clickSaveAsDraftbtn();
	    String s = newInvoicePage.getInvoiceSuccessMsg();
	    Assert.assertEquals("Draft Invoice Saved", s.substring(0, 19));
	}

}
