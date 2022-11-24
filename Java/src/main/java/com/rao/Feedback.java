package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.tool.JudgeElement;
import com.rao.tool.WebDriverTool;

public class Feedback {
	public void pageRun() throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		JudgeElement judge = new JudgeElement();
		
		//进入用户中心-反馈管理
		Thread.sleep(1000);
//		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[7]/div")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[7]/ul/li[3]")).click();
		
		//条件查询
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='选择反馈类型']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[type='button'][class='el-button el-button--success']")).click();
		
		//刷新界面
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("i[class='el-icon-refresh']")).click();
		
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[8]/div/div/button")).click();
		
		//判读反馈是否待处理
		if (judge.ElementExist(webdriver, By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[3]/div/button[2]")) == true) {
			//取消
			Thread.sleep(1000);
//			webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[3]/div/button[1]")).click();
			//确定
			webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[3]/div/button[2]")).click();
		}else {
			Thread.sleep(1000);
			webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[1]/button")).click();
		}
		
		
	}
}
