package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.tool.WebDriverTool;

public class Message {
	public void pageRun() throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		
		// 进入消息发布界面
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[8]/ul/li[2]")).click();
	    Thread.sleep(1000);
	    
	    // 消息新增
/*	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/button[2]")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.cssSelector("input[placeholder='消息类型']")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[1]")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.cssSelector("input[placeholder='消息状态']")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[1]")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[2]/div/div/div/div/input")).sendKeys("qwer123");
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[3]/div/div/div/div/input")).sendKeys("123456");
	    Thread.sleep(1000);
	    webdriver.findElement(By.cssSelector("i[data-v-5850c5bd][class='el-icon-plus']")).click();
	    Thread.sleep(1000);
	    Runtime.getRuntime().exec("D:\\JOBSoftware\\upload.exe");
	    Thread.sleep(1000);
	    webdriver.findElement(By.cssSelector("div[class='ql-editor ql-blank'][data-gramm='false'][data-placeholder='请输入消息内容']")).sendKeys("hhhhhhhhhhhhhhh");
	    Thread.sleep(1000);
	    // 保存
	    webdriver.findElement(By.cssSelector("button[data-v-5850c5bd][class='el-button el-button--primary']")).click();
	    Thread.sleep(1000);
	    
	    webdriver.navigate().refresh();
	    Thread.sleep(1500);*/
	    
	    // 消息详情
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[5]/div/button")).click();
		Thread.sleep(1000);
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[4]/div/div[2]/form/div[1]/div[2]/div/div/div/div[1]/input")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[2]")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[4]/div/div[3]/div/button[2]")).click();
	    Thread.sleep(1000);
	    
	    webdriver.navigate().refresh();
	    Thread.sleep(1500);

	    // 条件查询
        webdriver.findElement(By.cssSelector("input[placeholder='选择消息类型']")).click();
        Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/button[1]")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div/div/div/div[3]/button[1]")).click();  // 刷新
	    Thread.sleep(1000);
	}
}
