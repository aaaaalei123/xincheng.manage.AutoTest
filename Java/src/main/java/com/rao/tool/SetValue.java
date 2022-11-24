package com.rao.tool;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SetValue {
	public static void setElementValue(WebElement element,String value){
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"), value);//method1
	}
}
