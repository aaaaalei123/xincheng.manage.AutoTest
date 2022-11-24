package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.rao.tool.JudgeElement;
import com.rao.tool.PageTool;
import com.rao.tool.WebDriverTool;

public class Garden {

	public void pageRun() throws InterruptedException, Exception {
		WebDriver webdriver = WebDriverTool.webdriver;	
		JudgeElement judge = new JudgeElement();
		Actions actions = new Actions(webdriver);
		PageTool pageTool = new PageTool();
		
		/**
		 * 
		 * 果园管理
		 * 果园列表
		 * */
		//选择果园管理-果园列表
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div/aside/ul/li/div")).click();
		webdriver.findElement(By.xpath("/html/body/div/div/div/aside/ul/li/ul/li[1]")).click();
		
		//输入果园名称并点击搜索
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='果园名称']")).sendKeys("裕丰");
		webdriver.findElement(By.xpath("/html/body/div/div/div/section/div/div/div/div/button[1]")).click();
		
		//刷新界面
		Thread.sleep(2000);
		webdriver.findElement(By.cssSelector("i[class='el-icon-refresh']")).click();
		
		//点击添加按钮
//		Thread.sleep(1000);
//		webdriver.findElement(By.xpath("/html/body/div/div/div/section/div/div/div/div/button[2]")).click();
		
		//添加果园
		/*
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div/section/div/div/div/div/div/div/form/div[1]/div/div/input")).sendKeys("自动化测试果园1");
		webdriver.findElement(By.xpath("/html/body/div/div/div/section/div/div/div/div/div/div/form/div[2]/div/div/input")).sendKeys("500");
		webdriver.findElement(By.xpath("/html/body/div/div/div/section/div/div/div/div/div/div/form/div[3]/div/div/input")).sendKeys("测试者1");
		webdriver.findElement(By.xpath("/html/body/div/div/div/section/div/div/div/div/div/div/form/div[4]/div/div/input")).sendKeys("18370454744");
		webdriver.findElement(By.xpath("/html/body/div/div/div/section/div/div/div/div/div/div/form/div[5]/div/div/textarea")).sendKeys("如果是秋天来到伊宁，一定要到市区西郊的汉宾果园和南郊的塔西库勒克果园去，这两个地方被当地人称为“伊宁的迎宾园”。你可以亲手从硕果累累的枝头摘下苹果、葡萄、海棠、杏子，现摘现吃，哪儿也吃不到这样新鲜味美的水果。");
		//webdriver.findElement(By.xpath("/html/body/div/div/div/section/div/div/div/div/div/div/form/div[6]/div/div/input")).sendKeys("江西省赣州市章贡区东外街道文明大道6号");
		webdriver.findElement(By.cssSelector("div[class='el-vue-amap amap-container'][id='amapDemo']")).click();
		webdriver.findElement(By.xpath("/html/body/div/div/div/section/div/div/div/div/div/div/form/div[9]/div/div/div")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\JOBSoftware\\upload.exe");
		Thread.sleep(3000);
		webdriver.findElement(By.xpath("/html/body/div/div/div/section/div/div/div/div/div/div/div/button[2]")).click();
		*/
		
		//点击果园详情
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[10]/td[7]/div/button[1]")).click();
										
		//判断果园详情是否有图集
		if (judge.verifyElementIsPresent("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div/div[2]/form/div[10]/div/div/ul/li/span", "xpath") == true ) {
			System.out.println("果园图集存在");
			Thread.sleep(1500);
			webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div/div[2]/form/div[10]/div/div/ul/li/span")).click();	
			Thread.sleep(1000);
			webdriver.findElement(By.cssSelector("button[title='Close (Esc)'][class='pswp__button pswp__button--close']")).click();
		}else {
			System.out.println("果园图集不存在");
		}
		
		//关闭详情界面
		Thread.sleep(2000);
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div/div[1]/button")).click();
		
		//点击果园删除按钮
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div/section/div/div/div/div/div/div/table/tbody/tr[1]/td[7]/div/button[2]")).click();
		//点击关闭按钮
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/button")).click();
		//点击取消按钮
//		Thread.sleep(1000);
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		//点击确定按钮
//		Thread.sleep(1000);
//		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[2]")).click();
				
		pageTool.pageRun();
		
		
	}


}
