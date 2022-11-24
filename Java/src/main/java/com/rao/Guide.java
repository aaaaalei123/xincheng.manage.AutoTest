package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.rao.tool.JudgeElement;
import com.rao.tool.WebDriverTool;

public class Guide {
	public void pageRun() throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		Actions action=new Actions(webdriver);
		JudgeElement jude = new JudgeElement();
		
        // 打开设置-指南维护界面
        webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[8]/div")).click();
		Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[8]/ul/li[1]")).click();
		Thread.sleep(500);
		
/*		// 添加
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/button[2]")).click();
		Thread.sleep(1000);
		// 标题
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div/div/div/input")).sendKeys("CS");
		Thread.sleep(1000);
		// 指南类型
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[2]/div/div")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[2]")).click();
		Thread.sleep(1000);
		// 录入方式
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[3]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[1]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("div[class='ql-editor ql-blank'][data-gramm='false']")).sendKeys("尼古拉斯凯奇慕容狗蛋");
		Thread.sleep(1000);
		// 查询元素 Enter
		WebElement B = webdriver.findElement(By.cssSelector("div[class='el-pagination is-background']"));
		action.sendKeys(B,Keys.ENTER);
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[type='button'][class='ql-image']")).click();
		Thread.sleep(1000);
		// 选择图片
		Runtime.getRuntime().exec("D:\\JOBSoftware\\upload.exe");
		webdriver.findElement(By.cssSelector("button[class='el-button el-button--primary']")).click();
		Thread.sleep(1000);
		
		webdriver.navigate().refresh();
	    Thread.sleep(2000);*/
		
	    // 搜索
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/span/span/i")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]")).click();
		Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/button[1]")).click();
	    Thread.sleep(2000);
	    
		// 刷新界面
		webdriver.findElement(By.cssSelector("i[class='el-icon-refresh']")).click();
		Thread.sleep(1000);
		
		// 点击发布/编辑
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[6]/div/div/button[1]")).click();
		Thread.sleep(1000);
		
		// 判断是否已发布
		if (jude.ElementExist(webdriver, By.cssSelector("span[class='el-upload-list__item-actions']")) == true) {
			  // 编辑
		    webdriver.findElement(By.cssSelector("span[class='el-upload-list__item-actions']")).click();
		    Thread.sleep(1000);
		    WebElement sctp = webdriver.findElement(By.cssSelector("span[class='el-upload-list__item-actions']"));
		    Thread.sleep(1000);
		    action.sendKeys(sctp,Keys.DELETE);
		    Thread.sleep(1000);
		    webdriver.findElement(By.cssSelector("i[data-v-05f756c3][class='el-icon-plus']")).click();
		    Thread.sleep(1000);
		    Runtime.getRuntime().exec("D:\\JOBSoftware\\upload.exe");
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[4]/div/div[3]/div/button")).click();
		    Thread.sleep(2000);	
		}else {

		}
	}
}
