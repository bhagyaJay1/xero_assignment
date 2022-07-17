package com.xero.ui.po;

import java.time.Duration;

import org.openqa.selenium.Keys;
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

public class NewQuotePage extends BasePageObject {

	// Elements //
	
	@FindBy(how = How.XPATH, using = "//h1[text()='New quote']")
	private WebElement lblNewQuote;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'contacts-mfe-textinput')]")
	private WebElement txtContact;

	@FindBy(how = How.XPATH, using = "//input[contains(@aria-label,'Inventory item')]")
	private WebElement txtItem;

	@FindBy(how = How.XPATH, using = "//span[text()='Subtotal']/following-sibling::span")
	private WebElement lblSubtotal;

	@FindBy(how = How.XPATH, using = "//span[text()='Total GST']/following-sibling::span")
	private WebElement lblTotalGST;

	@FindBy(how = How.XPATH, using = "//span[text()='Total']/following-sibling::span/span")
	private WebElement lblTotal;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Send']")
	private WebElement btnSend;
	
	@FindBy(how = How.XPATH, using = "//footer/button[text()='Send']")
	private WebElement btnSendEmail;

	public NewQuotePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean isNewQuoteLabelDisplayed(int timeout) {

		try {
			Wait wait = new FluentWait(webDriver).withTimeout(Duration.ofSeconds(timeout))
					.pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);

			wait.until(ExpectedConditions.visibilityOf(lblNewQuote));
			return true;

		} catch (NoSuchElementException e) {
			return false;
		} catch (Exception e) {
			throw e;
		}
	}

    /**
     * Method to enter contact information
     */
	public void enterContactInfo(String contactInfo) throws Exception {

		try {
			txtContact.sendKeys(contactInfo);
			Thread.sleep(5000);
			txtContact.sendKeys(Keys.ENTER);

		} catch (Exception e) {
			throw e;
		}
	}

	
    /**
     * Method to enter item to the quote
     */
	public void enterItem(String itemName) throws Exception {

		try {
			txtItem.sendKeys(itemName);
			Thread.sleep(5000);
			txtItem.sendKeys(Keys.ENTER);

		} catch (Exception e) {
			throw e;
		}
	}

    /**
     * Method to get sub total of the quote
     */
	public String getSubtotal() {

		try {
			return lblSubtotal.getText();

		} catch (Exception e) {
			throw e;
		}
	}

	
    /**
     * Method to get total GST value of the quote
     */
	public String getTotalGST() {

		try {
			return lblTotalGST.getText();

		} catch (Exception e) {
			throw e;
		}
	}

	
    /**
     * Method to get total of the quote
     */
	public String getTotal() {

		try {
			return lblTotal.getText();

		} catch (Exception e) {
			throw e;
		}
	}
	
	
    /**
     * Method to send the quote
     */
	public void clickSend() {

		try {
			btnSend.click();

		} catch (Exception e) {
			throw e;
		}
	}

	
    /**
     * Method to send an email to the quote
     */
	public ViewQuotePage clickSendEmail() throws Exception {

		try {
			Thread.sleep(5000);
			btnSendEmail.click();
			Thread.sleep(10000);
			return new ViewQuotePage(webDriver);

		} catch (Exception e) {
			throw e;
		}
	}
}
