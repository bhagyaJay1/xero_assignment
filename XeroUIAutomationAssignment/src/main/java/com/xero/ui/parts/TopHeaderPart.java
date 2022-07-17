package com.xero.ui.parts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.xero.ui.po.DashBoardPage;
import com.xero.ui.po.NewInvoicePage;
import com.xero.ui.po.QuotesPage;
import com.xero.util.BasePageObject;

public class TopHeaderPart extends BasePageObject {

	/* Elements */
	@FindBy(how = How.CLASS_NAME, using = "xnav-appbutton--body")
	private WebElement lnkOrganisationSelection;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Demo Company (NZ)']")
	private WebElement lnkOrganisation;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Business']")
	private WebElement lnkBusinessSelection;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Invoices']")
	private WebElement lnkInvoices;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Quotes']")
	private WebElement lnkQuotes;
	

	public TopHeaderPart(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	

    /**
     * Method to select organization in the header menu
     */
	public void clickOrganisationSelection() throws Exception {

		try {
			lnkOrganisationSelection.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			throw e;
		}
	}
	
    /**
     * Method to click Business tab in the header menu
     */
	public void clickBusinessSelection() throws Exception {

		try {
			lnkBusinessSelection.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			throw e;
		}
	}
	
	
    /**
     * Method to click organization in the header menu
     */
	public DashBoardPage selectOrganisation() {

		try {
			lnkOrganisation.click();
			return new DashBoardPage(webDriver);
		} catch (Exception e) {
			throw e;
		}
	}
	
	
    /**
     * Method to select invoice
     */
	public NewInvoicePage selectInvoices() {

		try {
			lnkInvoices.click();
			return new NewInvoicePage(webDriver);
		} catch (Exception e) {
			throw e;
		}
	}
	
	
    /**
     * Method to click Quotes
     */
	public QuotesPage selectQuotes() {

		try {
			lnkQuotes.click();
			return new QuotesPage(webDriver);
		} catch (Exception e) {
			throw e;
		}
	}

}
