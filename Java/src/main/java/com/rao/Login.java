package com.rao;

import org.openqa.selenium.By;

import com.rao.tool.BasePage;
import com.rao.tool.LogRecorder;

public class Login{

	public void pageRun() throws Exception{
		BasePage basePage = new BasePage();

		/**
		 * 
		 * 登录
		 * 
		 * */
		//输入账号 密码并登陆系统
		LogRecorder.Info("进入登录页");
		basePage.sendKeys(By.id("txtUserName"), "","账号框");
		basePage.sendKeys(By.id("txtPassword"), "","密码框");
		basePage.click(By.id("btnSave"), "登录按钮");

	}
}
