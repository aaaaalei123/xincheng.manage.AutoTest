package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.rao.tool.SetValue;
import com.rao.tool.WebDriverTool;

public class Label {
	public void pageRun() throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		
		// 进入标签参数设定界面
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/aside/ul[1]/li[8]/ul/li[5]")).click();
	    Thread.sleep(500);
	    
	    // 添加
/*	    webdriver.findElement(By.xpath("//span[contains(., '添加')]")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[1]/div/div/div[1]/input")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[2]/div/div/div[1]/input")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[4]")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[3]/div/div/div/input")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li")).click();
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[4]/div/div[1]/input")).sendKeys("20");
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[3]/div/button")).click();
	    Thread.sleep(1000);*/
	    // 修改详情
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[7]/div/button")).click();
	    Thread.sleep(1000);
	    SetValue.setElementValue(webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div/div[2]/form/div[4]/div/div/input")), "16");
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div/div[3]/div/button/span")).click();
	    Thread.sleep(1000);
	    
	    webdriver.navigate().refresh();
	    Thread.sleep(1500);
	    
	    // 筛选
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/div/div/input")).click();
	    Thread.sleep(1000);
	    
	    WebElement D = webdriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[11]"));
	    //循环点击键盘下键，直到元素可见
	    Actions action333 = new Actions(webdriver);
	    while(true){
	     action333.sendKeys(D,Keys.DOWN).perform();
	     // 使用try…catch…来判断元素是否可见，可见就进行元素操作并退出循环
	     try {
	      webdriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[11]"));
	      break;
	     } catch (Exception e) {
	     }
	    }
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[11]")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/button[1]/span")).click();
	    
	    webdriver.navigate().refresh();
	    Thread.sleep(3000);
	}
}
