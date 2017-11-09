package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface ElementByXPathIdInf {
	public WebElement element = null;

	static WebElement getByXPath(WebDriver driver, String xpathValue) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue)));
		return driver.findElement(By.xpath(xpathValue));
	}

	static WebElement getByID(WebDriver driver, String idValue) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idValue)));
		return driver.findElement(By.id(idValue));
	}
}
