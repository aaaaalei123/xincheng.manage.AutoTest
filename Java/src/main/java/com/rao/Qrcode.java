package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.tool.JudgeElement;
import com.rao.tool.WebDriverTool;

public class Qrcode {
	public void pageRun() throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		JudgeElement judge = new JudgeElement();
		
		//进入审核管理-精品二维码审核
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[6]/div")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[6]/ul/li[1]")).click();
		
		//条件查询
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='果园名称']")).sendKeys("江西赣县龙潭山江口果园");
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[type='button'][class='el-button el-button--success']")).click();
		
		//刷新界面
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("i[class='el-icon-refresh']")).click();
		
		//详情
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div/div[3]/table/tbody/tr/td[12]/div/button")).click();
		
		//判读二维码是否已审核
		if (judge.ElementExist(webdriver, By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[3]/div/button")) == true) {
			//驳回
			/*Thread.sleep(1000);
			  webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[13]/div/div/textarea")).sendKeys("数量不正确，请重新填写");
			  Thread.sleep(1000);
			  webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[3]/div/button")).click();
			*/
			//通过
			Thread.sleep(1000);
			webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[3]/div/button[2]")).click();
		}else {
			webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div/button")).click();
		}
		
		
	}
	

}
