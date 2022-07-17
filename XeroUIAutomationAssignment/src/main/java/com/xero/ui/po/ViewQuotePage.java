package com.xero.ui.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.xero.util.BasePageObject;

public class ViewQuotePage extends BasePageObject {

	// Elements //
	@FindBy(how = How.XPATH, using = "//button[text()='Create invoice']")
	private WebElement btnCreateInvoice;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Mark as accepted']")
	private WebElement btnMarkAsAccepted;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Subtotal']/following-sibling::span")
	private WebElement lblSubtotal;

	@FindBy(how = How.XPATH, using = "//span[text()='Total GST']/following-sibling::span")
	private WebElement lblTotalGST;

	@FindBy(how = How.XPATH, using = "//span[text()='Total']/following-sibling::span/span")
	private WebElement lblTotal;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Create']")
	private WebElement btnCreateInvoiceConfirm;
	
	public ViewQuotePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	
    /**
     * method to accept the created quote
     */
	public void clickMarkAsAcceptedButton() {

		try {
			btnMarkAsAccepted.click();

		} catch (Exception e) {
			throw e;
		}
	}
	
	
    /**
     * method to verify mark as accepted button is displayed
     */
	public boolean isMarkAsAcceptedButtonDisplayed() {

		try {
			return btnMarkAsAccepted.isDisplayed();

		} catch (Exception e) {
			return false;
		}
	}
	
	
    /**
     * method to click on the create invoice button
     */
	public void clickCreateInvoiceButton() throws Exception {

		try {
			btnCreateInvoice.click();
			Thread.sleep(5000);

		} catch (Exception e) {
			throw e;
		}
	}
	
	
    /**
     * method to verify create invoice button is displayed
     */
	public boolean isCreateInvoiceButtonDisplayed() {

		try {
			return btnCreateInvoice.isDisplayed();

		} catch (Exception e) {
			return false;
		}
	}
	
	
    /**
     * method to click on the create invoice button
     */
	public String getSubtotal() {

		try {
			return lblSubtotal.getText();

		} catch (Exception e) {
			throw e;
		}
	}

    /**
     * method to get total GST value
     */
	public String getTotalGST() {

		try {
			return lblTotalGST.getText();

		} catch (Exception e) {
			throw e;
		}
	}

	
    /**
     * method to get total value
     */
	public String getTotal() {

		try {
			return lblTotal.getText();

		} catch (Exception e) {
			throw e;
		}
	}
	
	
    /**
     * method to press create invoice
     */
	public NewInvoicePage clickCreateInvoiceConfirmButton() {

		try {
			btnCreateInvoiceConfirm.click();
			return new NewInvoicePage(webDriver);

		} catch (Exception e) {
			throw e;
		}
	}

}
