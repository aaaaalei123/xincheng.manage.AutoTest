package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.rao.tool.PageTool;
import com.rao.tool.WebDriverTool;

public class Massif {
	@SuppressWarnings("static-access")
	public void pageRun() throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		Actions actions = new Actions(webdriver);
		PageTool pageTool = new PageTool();
		 /**
	      * 
	      * 果园管理
	      * 地块列表
	      * */
		//进入地块列表
		//webdriver.findElement(By.xpath("/html/body/div/div/div/aside/ul/li/div")).click();
		webdriver.findElement(By.xpath("/html/body/div/div/div/aside/ul/li/ul/li[2]")).click();
		
	    //输入果园名称并点击搜索
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='果园名称']")).sendKeys("初夏果园");
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/button")).click();
		
		
		//刷新界面
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("i[class='el-icon-refresh']")).click();
		
	   
		//点击添加按钮
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[class='el-button add el-button--success is-plain']")).click();
		
		//新增地块
		
		Thread.sleep(1000);
//		webdriver.findElement(By.cssSelector("input[placeholder='选择果园名称']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[2]/div/div/input")).sendKeys("地块一");
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[3]/div/div/input")).sendKeys("500");
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[5]/button")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[placeholder='选择种植品种'][class='el-input__inner']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[4]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[4]/div/div[2]/form/div[2]/div/div/input")).sendKeys("100");
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[placeholder='选择日期'][class='el-input__inner']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[type='button'][aria-label='前一年']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[type='button'][aria-label='上个月']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[4]/div/div/div/span")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/table[2]/tbody/tr[3]/td/a")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/table[3]/tbody/tr[3]/td[4]/div/a")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[type='button'][aria-label='下个月']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[type='button'][aria-label='后一年']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/table/tbody/tr[4]/td[1]/div/span")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[4]/div/div[3]/div/button")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("i[class='el-dialog__close el-icon el-icon-close']")).click();
		
		
		//详情
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div/div[3]/table/tbody/tr/td[6]/div/button")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[5]/div/div/button")).click();
		
		//删除
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div/div[3]/table/tbody/tr/td[6]/div/button[2]")).click();
//		Thread.sleep(1000);
//		webdriver.findElement(By.cssSelector("i[class='el-message-box__close el-icon-close']")).click();
		//取消按钮
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button")).click();
		//确定按钮
//		Thread.sleep(1000);
//		webdriver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button[2]")).click();
		
		//切换每页显示条数
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[placeholder='请选择']")).click();
		
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[5]/div/div/ul/li[2]")).click();
		
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
		webdriver.findElement(By.xpath("/html/body/div[5]/div/div/ul/li[1]")).click();
		
		//点击第二页
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[2]/ul/li[2]")).click();
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
}
