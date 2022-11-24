package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.tool.WebDriverTool;

public class Admin {
	public void pageRun() throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
		
		//进入用户中心-管理员管理
		//webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[7]/div")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[7]/ul/li[2]")).click();

		//条件查询
/*		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("input[type='text'][placeholder='选择用户类型']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("button[type='button'][class='el-button el-button--success']")).click();*/
		
		//刷新界面
/*		Thread.sleep(1000);
		webdriver.findElement(By.cssSelector("i[class='el-icon-refresh']")).click();*/
		
		//添加
/*		Thread.sleep(2000);
		webdriver.findElement(By.cssSelector("button[type='button'][class='el-button add el-button--success is-plain']")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[1]/div/div[1]/input")).sendKeys("莫洛托夫");
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[2]/div/div[1]/input")).sendKeys("18370454744");
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[3]/div/div[1]/input")).sendKeys("abc123");
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[4]/div/div/div[1]/input")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[5]/div/div/div")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("D:\\JOBSoftware\\upload.exe");
		Thread.sleep(1000);
		//取消
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[3]/div/button[1]")).click();
		//确定
		//webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[3]/div/button[2]")).click();
		*/
		
/*		Thread.sleep(1000);
		//冻结
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[7]/div/div/button[1]")).click();
		Thread.sleep(2000);
		//激活
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[7]/div/div/button[1]")).click();
*/		
		//详情
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[7]/div/div/button[2]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div/div[1]/button")).click();
		
		//删除
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[7]/div/div/button[3]")).click();
		Thread.sleep(1000);
		//取消
		webdriver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
		//确定
		//webdriver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[2]")).click();
		
	}
}
