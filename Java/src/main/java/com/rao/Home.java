package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.rao.tool.WebDriverTool;

public class Home {
	public void pageRun() throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		Actions actions = new Actions(webdriver);
		
		/**
		 * 
		 * 首页
		 * 快捷方式
		 * */
		 Thread.sleep(1000);
		 //指南维护
		 actions.moveToElement(webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div/div/div"))).perform();
		 Thread.sleep(500);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div/div/div")).click();
		 Thread.sleep(1000);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[1]")).click();		//首页
		 
		 Thread.sleep(1000);
		 //百科维护
		 actions.moveToElement(webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div/div[2]/div"))).perform();
		 Thread.sleep(500);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div/div[2]/div")).click();
		 Thread.sleep(1000);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[1]")).click();		//首页
		 
		 Thread.sleep(1000);
		 //种植维护
		 actions.moveToElement(webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div/div[3]/div"))).perform();
		 Thread.sleep(500);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div/div[3]/div")).click();
		 Thread.sleep(1000);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[1]")).click();		//首页
		
		 Thread.sleep(1000);
		 //消息通知
		 actions.moveToElement(webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div/div[4]/div"))).perform();
		 Thread.sleep(500);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div/div[4]/div")).click();
		 Thread.sleep(1000);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[1]")).click();		//首页
		
		 Thread.sleep(1000);
		 //监控设备
		 actions.moveToElement(webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div[2]/div/div"))).perform();
		 Thread.sleep(500);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
		 Thread.sleep(1000);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[1]")).click();		//首页
		
		 Thread.sleep(1000);
		 //监测设备
		 actions.moveToElement(webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div[2]/div[2]/div"))).perform();
		 Thread.sleep(500);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div[2]/div[2]/div")).click();
		 Thread.sleep(1000);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[1]")).click();		//首页
		
		 Thread.sleep(1000);
		 //灌溉设备
		 actions.moveToElement(webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div[2]/div[3]/div"))).perform();
		 Thread.sleep(500);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div[2]/div[3]/div")).click();
		 Thread.sleep(1000);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[1]")).click();		//首页
		
		 Thread.sleep(1000);
		 //出入库
		 actions.moveToElement(webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div[2]/div[4]/div"))).perform();
		 Thread.sleep(500);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div[2]/div[4]/div")).click();
		 Thread.sleep(1000);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[1]")).click();		//首页
		
		
		/**
		 * 
		 * 首页
		 * 待办事项
		 * **/
		
		 Thread.sleep(1000);
		 //待审果园
		 actions.moveToElement(webdriver.findElement(By.cssSelector("div[class='bg1 wrap-item']"))).perform();
		 Thread.sleep(500);
		 webdriver.findElement(By.cssSelector("div[class='bg1 wrap-item']")).click();
		 Thread.sleep(1000);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[1]")).click();		//首页
		 
		 Thread.sleep(1000);
		 //待审二维码
		 actions.moveToElement(webdriver.findElement(By.cssSelector("div[class='bg2 wrap-item']"))).perform();
		 Thread.sleep(500);
		 webdriver.findElement(By.cssSelector("div[class='bg2 wrap-item']")).click();
		 Thread.sleep(1000);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[1]")).click();		//首页
		 
		 Thread.sleep(1000);
		 //待审异常
		 actions.moveToElement(webdriver.findElement(By.cssSelector("div[class='bg3 wrap-item']"))).perform();
		 Thread.sleep(500);
		 webdriver.findElement(By.cssSelector("div[class='bg3 wrap-item']")).click();
		 Thread.sleep(1000);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[1]")).click();		//首页
		
		 Thread.sleep(1000);
		 //待处理反馈
		 actions.moveToElement(webdriver.findElement(By.cssSelector("div[class='bg4 wrap-item']"))).perform();
		 Thread.sleep(500);
		 webdriver.findElement(By.cssSelector("div[class='bg4 wrap-item']")).click();
		 Thread.sleep(1000);
		 webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[1]")).click();		//首页
		
		 //数据概览
	     // 获取 moveToElement 方法 ，元素定位到想要移上去的元素上 
		 Thread.sleep(1000);
	     actions.moveToElement(webdriver.findElement(By.cssSelector("canvas[data-zr-dom-id='zr_0'][width='1612'][height='400']")),200,200).perform();
	     Thread.sleep(1000);
	     actions.moveToElement(webdriver.findElement(By.cssSelector("canvas[data-zr-dom-id='zr_0'][width='1612'][height='400']")),405,200).perform();
	     Thread.sleep(1000);
	     actions.moveToElement(webdriver.findElement(By.cssSelector("canvas[data-zr-dom-id='zr_0'][width='1612'][height='400']")),620,200).perform();
	     Thread.sleep(1000);
	     actions.moveToElement(webdriver.findElement(By.cssSelector("canvas[data-zr-dom-id='zr_0'][width='1612'][height='400']")),830,200).perform();
	     Thread.sleep(1000);
	     actions.moveToElement(webdriver.findElement(By.cssSelector("canvas[data-zr-dom-id='zr_0'][width='1612'][height='400']")),1040,200).perform();
	     Thread.sleep(1000);
	     actions.moveToElement(webdriver.findElement(By.cssSelector("canvas[data-zr-dom-id='zr_0'][width='1612'][height='400']")),1250,200).perform();
	     Thread.sleep(1000);
	     actions.moveToElement(webdriver.findElement(By.cssSelector("canvas[data-zr-dom-id='zr_0'][width='1612'][height='400']")),1460,200).perform();
	
	}
}
