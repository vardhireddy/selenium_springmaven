package com.selenium.test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ApplicationImpl implements ApplicationInf{

	static WebDriver driver = null;
	
	@Override
	public void process(List<String> cellValue) {
		ExcelDataPojo excelData = null;

		if (!cellValue.contains("TYPE")) {
			excelData = getValues(cellValue);
			waitTillElementLoad(excelData);
			performAction(excelData);
		}
		
	}

	@Override
	public WebElement getElement(String pathType, String pathValue) {
		WebElement element = null;

		switch (pathType.toUpperCase()) {
		case "XPATH":
			element = ElementByXPathIdInf.getByXPath(driver, (String) pathValue);
			break;
		case "ID":
			element = ElementByXPathIdInf.getByID(driver, (String) pathValue);
			break;
		default:
			break;
		}
		return element;
	}

	@Override
	public String getDriverFullPath(String browser) {
		return browser.isEmpty() ? BrowserDriverPath.FIREFOX.getDriver()
				: BrowserDriverPath.valueOf(browser.toUpperCase()).getDriver();
	}

	@Override
	public void performAction(ExcelDataPojo excelData) {
		switch (excelData.getAction().toUpperCase()) {
		case "CLICK":
			getElement(excelData.getxPathIdType(), excelData.getXpathIdValue()).click();
			break;
		case "KEYS":
			getElement(excelData.getxPathIdType(), excelData.getXpathIdValue()).sendKeys(excelData.getActionData());
			break;
		case "DROPDOWN":
			Select dropdownlist = new Select(getElement(excelData.getxPathIdType(), excelData.getXpathIdValue()));
			dropdownlist.selectByValue(excelData.getActionData());
		default:
			break;
		}
		
	}

	@Override
	public void waitTillElementLoad(ExcelDataPojo excelData) {
		getElement(excelData.getPreRequestType(), excelData.getPreRequestData());
	}

	@Override
	public ExcelDataPojo getValues(List<String> cellValue) {
		return new ExcelDataPojo(cellValue.get(1), cellValue.get(2), cellValue.get(3), cellValue.get(4),
				cellValue.get(5), cellValue.get(6));
	}

}
