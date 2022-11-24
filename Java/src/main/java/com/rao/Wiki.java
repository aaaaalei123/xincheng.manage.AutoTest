package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.tool.WebDriverTool;

public class Wiki {
	public void pageRun() throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		
		// 进入作物百科页面
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[8]/ul/li[3]")).click();
	    Thread.sleep(1000);
	    
	    // 添加
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/button[2]")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[1]/div/div/div/input")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[1]")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[2]/div/div/div/input")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[2]")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[3]/div/div/div/input")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[5]/div/div/ul/li[2]")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.cssSelector("div[data-placeholder='请输入作物百科内容']")).sendKeys("selenium");
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[3]/div/button")).click();
	    Thread.sleep(1000);
	    
	    // 编辑发布
	    webdriver.findElement(By.xpath("/html/body/div/div//div[2]/section/div/div/div/div[2]/div/div[3]/table/tbody/tr/td[6]/div/div/button[2]")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[4]/div/div[2]/form/div[3]/div/div/div/input")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[6]/div/div/ul/li[1]")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[4]/div/div[3]/div/button")).click();
	    Thread.sleep(1000);
	    
	    webdriver.navigate().refresh();
	    Thread.sleep(1500);
	    
	    // 条件查询
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/div/div/input")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/button[1]")).click();
	    Thread.sleep(1000);
	    
	    // 删除
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[6]/div/div/button[2]")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[2]")).click();
	    Thread.sleep(1000);
	    
	    webdriver.navigate().refresh();
	    Thread.sleep(1500);
	}
}
