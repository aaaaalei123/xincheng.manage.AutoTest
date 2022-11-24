package com.rao.tool;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageTool {
	@SuppressWarnings("static-access")
	public void pageRun() throws InterruptedException {
		PageTool pageTool = new PageTool();
		WebDriver webdriver = WebDriverTool.webdriver;
		Actions actions = new Actions(webdriver);
		
		//切换每页显示条数
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[placeholder='请选择']")).click();
		
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("li[class='el-select-dropdown__item']")).click();
		
//		if(pageTool.ElementExist(webdriver, By.cssSelector("li[class='el-select-dropdown__item']"))==true & pageTool.ElementExist(webdriver, By.cssSelector("li[class='el-select-dropdown__item selected hover']"))==false){
//			System.out.println("Garden--Yes");
//			webdriver.findElement(By.cssSelector("li[class='el-select-dropdown__item']")).click();
//		}else{
//			System.out.println("Massif--Yes");
//			webdriver.findElement(By.cssSelector("li[class='el-select-dropdown__item hover']")).click();
//		}
		
		
		Thread.sleep(1000);
		//通过xpath获取到滚动条所在元素位置
		WebElement A = webdriver.findElement(By.cssSelector("div[class='el-pagination is-background']"));
		//循环点击键盘下键，直到元素可见
		while(true){
			actions.sendKeys(A,Keys.DOWN).perform();
			/* A：滚动条所在元素位置
			 * Keys.DOWN：点击键盘下键
			 * perform()：确定键盘操作事件，不能省略
			*/
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
		webdriver.findElement(By.cssSelector("li[class='el-select-dropdown__item']")).click();
		
		//点击第二页
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("li[class='number']")).click();
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

	}
	
	public static void setElementValue(WebElement element,String value){
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"), value);//method1
	}
	
	 public boolean ElementExist(WebDriver driver,By locator)
	    {
	        try {
	            driver.findElement(locator);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }

	    }
}
