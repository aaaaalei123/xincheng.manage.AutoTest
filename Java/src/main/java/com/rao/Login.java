package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.tool.BasePage;
import com.rao.tool.WebDriverTool;

public class Login{

	public void pageRun() throws Exception{
		BasePage basePage = new BasePage();

		/**
		 * 
		 * 登录
		 * 
		 * */
		//输入账号 密码并登陆系统
		Thread.sleep(1000);
		// webdriver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/div/div/input")).sendKeys("18970786473");
		// webdriver.findElement(By.xpath("/html/body/div/div/div/div/form/div[2]/div/div/input")).sendKeys("abc123");
		// webdriver.findElement(By.cssSelector("span[class='el-checkbox__inner']")).click();
		// webdriver.findElement(By.cssSelector("button[class='el-button size submit el-button--primary']")).click();

		// webdriver.findElement(By.id("txtUserName")).sendKeys("天天果园");
		// webdriver.findElement(By.id("txtPassword")).sendKeys("Aa123456");
		// webdriver.findElement(By.id("btnSave")).click();

		basePage.sendKeys(By.id("txtUserName"), "天天果园","账号框");
		basePage.sendKeys(By.id("txtPassword"), "Aa123456","密码框");
		basePage.click(By.id("btnSave"), "登录按钮");

	}
}
