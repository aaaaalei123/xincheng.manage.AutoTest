package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.rao.tool.JudgeElement;
import com.rao.tool.PageTool;
import com.rao.tool.WebDriverTool;

public class Farm {
	public void pageRun() throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		Actions actions = new Actions(webdriver);
		JudgeElement judge = new JudgeElement();
		PageTool pageTool = new PageTool();
		
		 //打开农事活动-农事记录界面
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[3]/div")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[3]/ul/li")).click();
		
		//输入果园名称并点击搜索
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[placeholder='果园名称']")).sendKeys("归元");
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[placeholder='农事类型']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[placeholder='开始日期']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[class='el-picker-panel__icon-btn el-icon-arrow-left']")).click();
		webdriver.findElement(By.cssSelector("button[class='el-picker-panel__icon-btn el-icon-arrow-left']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[3]/div/div/div/table/tbody/tr[2]/td[7]/div")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/table/tbody/tr[6]/td[4]/div")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[class='el-button el-button--success']")).click();
		
		//刷新界面
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("i[class='el-icon-refresh']")).click();
		
		//查看详情
		Thread.sleep(2000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div/div[3]/table/tbody/tr/td[8]/div/button")).click();
		
		//查看果园农事图集
		Thread.sleep(2000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[8]/div/div/ul/li/span"))).perform();
		Thread.sleep(500);
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[8]/div/div/ul/li/span/span[1]/i")).click();

		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[title='Close (Esc)'][class='pswp__button pswp__button--close']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("i[class='el-dialog__close el-icon el-icon-close']")).click();
		

		//切换每页显示条数
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[placeholder='请选择']")).click();
		
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[2]")).click();
		
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

	}

}
