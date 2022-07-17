package com.xero.ui.po;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.xero.util.BasePageObject;

public class NewInvoicePage extends BasePageObject {

	//Elements//
	
	@FindBy(how = How.XPATH, using = "//h1[text()='New Invoice']")
	private WebElement lblNewInvoice;
	
	@FindBy(how = How.XPATH, using = "//input[@id='subTotal']")
	private WebElement lblSubtotal;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Total GST')]")
	private WebElement lblTotalGSTPresentage;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Total GST')]/..//input")
	private WebElement lblTotalGSTValue;

	@FindBy(how = How.XPATH, using = "//input[@id='invoiceTotal']")
	private WebElement lblTotal;
	
	@FindBy(how = How.CSS,using ="a[title='More Save options...']")
	private WebElement saveAsBtn;
	
	@FindBy(how = How.CSS,using ="a[title='Save as draft']")
	private WebElement saveAsDraftBtn;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Draft Invoice Saved')]")
	private WebElement draftInvoiceSusscessMsg;
				
	
	public NewInvoicePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean isNewInvoiceLabelDisplayed(int timeout) {

		try {
			Wait wait = new FluentWait(webDriver).withTimeout(Duration.ofSeconds(timeout))
					.pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);

			wait.until(ExpectedConditions.visibilityOf(lblNewInvoice));
			return true;

		} catch (NoSuchElementException e) {
			return false;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
    /**
     * Method to get sub total of the invoice
     */
	public String getSubtotal() {

		try {
			return lblSubtotal.getAttribute("value");

		} catch (Exception e) {
			throw e;
		}
	}

	
    /**
     * Method to get GST percentage of the invoice
     */
	public String getTotalGSTPresentage() {

		try {
			return lblTotalGSTPresentage.getText();

		} catch (Exception e) {
			throw e;
		}
	}
	
	
    /**
     * Method to get total GST value of the invoice
     */
	public String getTotalGSTValue() {

		try {
			return lblTotalGSTValue.getAttribute("value");

		} catch (Exception e) {
			throw e;
		}
	}

	
    /**
     * Method to get total of the invoice
     */
	public String getTotal() {

		try {
			return lblTotal.getAttribute("value");

		} catch (Exception e) {
			throw e;
		}
	}

	
    /**
     * Method to save the invoice
     */
	public void clickSavebtn() {

		try {
			saveAsBtn.click();

		} catch (Exception e) {
			throw e;
		}
	}
	
	
    /**
     * Method to save the invoice as draft
     */
	public void clickSaveAsDraftbtn() {

		try {
			saveAsDraftBtn.click();

		} catch (Exception e) {
			throw e;
		}
	}
	
	
	public String getInvoiceSuccessMsg() {

		try {
			return draftInvoiceSusscessMsg.getText();

		} catch (Exception e) {
			throw e;
		}
	}
}
