package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.rao.tool.WebDriverTool;

public class Systems {
	public void pageRun() throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		
		// 系统参数设置
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[8]/ul/li[4]")).click();
	    Thread.sleep(3000);
	    
	    // 农事类型-添加/删除
	    webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/span/span/button")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[2]/div/div/input")).sendKeys("测试-农事类型");
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("/html/body/div[2]/div/button")).click();
	    Thread.sleep(2000);
	    webdriver.findElement(By.xpath("//span[contains(., '测试-农事类型')]/i")).click();    // 查询文本
	    Thread.sleep(1000);
	    webdriver.findElement(By.xpath("//div/button[2]/span")).click();
	    Thread.sleep(500);
	    
	    webdriver.navigate().refresh();
	    Thread.sleep(3000);
	    
	    // 施肥种类-添加/删除
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/span/span/button")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[2]/div/div/div/input")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[1]")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/input")).sendKeys("测试-1");
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[2]/div/button")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("//span[contains(., '测试-1')]/i")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("//div/button[2]/span")).click();
	    Thread.sleep(500);
	    
	    webdriver.navigate().refresh();
	    Thread.sleep(3000);
	    
	    // 果品分类-添加/删除
	    
	    //通过xpath获取到滚动条所在元素位置
	    WebElement fl = webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div[1]"));
	    //循环点击键盘下键，直到元素可见
	    Actions action111=new Actions(webdriver);
	    while(true){
	     action111.sendKeys(fl,Keys.DOWN).perform();
	     // 使用try…catch…来判断元素是否可见，可见就进行元素操作并退出循环
	     try {
	      webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div[1]"));
	      break;
	     } catch (Exception e) {
	     }
	    }
	    
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div[1]/span/span/button")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[2]/div/div/input")).sendKeys("测试类");
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[2]/div/button")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("//span[contains(., '测试类')]/i")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("//div/button[2]/span")).click();
	    Thread.sleep(500);
	    
	    webdriver.navigate().refresh();
	    Thread.sleep(3000);
	    
	    // 果品等级-添加/删除
	    
	    WebElement B1 = webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[6]/div[1]"));
	    //循环点击键盘下键，直到元素可见
	    Actions action222 = new Actions(webdriver);
	    while(true){
	     action222.sendKeys(B1,Keys.DOWN).perform();
	     // 使用try…catch…来判断元素是否可见，可见就进行元素操作并退出循环
	     try {
	      webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[6]/div[1]"));
	      break;
	     } catch (Exception e) {
	     }
	    }
	    
	    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div[1]/span/span/button")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[2]/div/div/input")).sendKeys("满级");
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("/html/body/div[2]/div/button")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("//span[contains(., '满级')]/i")).click();
	    Thread.sleep(500);
	    webdriver.findElement(By.xpath("//div/button[2]/span")).click();
	    Thread.sleep(500);
	    
	    webdriver.navigate().refresh();
	    Thread.sleep(3000);
	}
}
