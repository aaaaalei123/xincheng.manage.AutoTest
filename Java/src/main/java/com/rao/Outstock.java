package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.rao.tool.PageTool;
import com.rao.tool.WebDriverTool;

public class Outstock {
	public void pageRun() throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		Actions actions = new Actions(webdriver);
		PageTool pageTool = new PageTool();
		
		//进入产品流通-入库管理
//		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[5]/div")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[5]/ul/li[2]")).click();
		
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
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div/div[3]/table/tbody/tr/td[8]/div/button")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div/button")).click();
		
		//切换每页显示条数
/*		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[placeholder='请选择']")).click();
		
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[2]")).click();
		
		Thread.sleep(1000);
		//通过xpath获取到滚动条所在元素位置
		WebElement A = webdriver.findElement(By.cssSelector("div[class='el-pagination is-background']"));
		//循环点击键盘下键，直到元素可见
		while(true){
			actions.sendKeys(A,Keys.DOWN).perform();
			 A：滚动条所在元素位置
			 * Keys.DOWN：点击键盘下键
			 * perform()：确定键盘操作事件，不能省略
			
			// 使用try…catch…来判断元素是否可见，可见就进行元素操作并退出循环
			try {
				webdriver.findElement(By.cssSelector("div[class='el-pagination is-background']"));
				break;
			} catch (Exception e) {
			}
		}
		
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[placeholder='请选择']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[1]")).click();
		
		//点击第二页
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[2]/ul/li[2]")).click();
		//点击向前一页按钮
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("i[class='el-icon el-icon-arrow-left']")).click();
		//点击向后一页按钮
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("i[class='el-icon el-icon-arrow-right']")).click();
		//输入第一页并回车执行
		Thread.sleep(1000);
		pageTool.setElementValue(webdriver.findElement(By.cssSelector("input[type='number'][autocomplete='off'][class='el-input__inner']")), "1");
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='number'][autocomplete='off'][class='el-input__inner']")).sendKeys(Keys.chord(Keys.ENTER));		
		*/
	}

}
