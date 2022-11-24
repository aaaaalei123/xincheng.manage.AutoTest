package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.rao.tool.WebDriverTool;

public class Systemcrop {
	public void pageRun() throws Exception {
		WebDriver webdriver = WebDriverTool.webdriver;
			
        	//webdriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[8]/div")).click();
			// 进入系统作物管理界面
		 	webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/aside/ul[1]/li[8]/ul/li[6]")).click();
		    Thread.sleep(500);
			
		    // 筛选搜索
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/div[1]/div/input")).click();
		    Thread.sleep(500);
		    webdriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[2]")).click();
		    Thread.sleep(500);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/div[2]/input")).sendKeys("蜜柚");
		    Thread.sleep(500);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/button[1]")).click();
		    Thread.sleep(500);
		    webdriver.findElement(By.cssSelector("button[title='刷新']")).click();
		    Thread.sleep(500);
		    
		    // 新增/删除
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/button[2]")).click();
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[1]/div/div/div[1]/input")).click();
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[3]")).click();
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[2]/div/div[1]/input")).sendKeys("高坚果");
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[3]/div/div[1]/input")).sendKeys("666");
		    Thread.sleep(500);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[4]/div/div[1]/input[1]")).click();
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/table/tbody/tr[2]/td[5]/div/span")).click();  // 开始
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/table/tbody/tr[7]/td[2]/div/span")).click();  // 结束
		    Thread.sleep(1000);
		    // 生长周期
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[6]/button/span")).click();
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div/div[2]/form/div[1]/div/div/input")).sendKeys("好多周期");
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div/div[2]/form/div[2]/div/div/div/input")).click();
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[1]")).click();
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div/div[2]/form/div[3]/div/div/div/input")).click();
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[5]")).click();
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div/div[2]/form/div[4]/div/div/textarea")).sendKeys("别问，问就是好多周期");;
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div/div[2]/form/div[5]/div/div/div")).click();
		    Thread.sleep(1000);
		    Runtime.getRuntime().exec("D:\\JOBSoftware\\upload.exe");
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div/div[3]/div/button")).click();
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[7]/div/div[1]/textarea")).sendKeys("简介：123456");
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[8]/div/div/div")).click();
		    Thread.sleep(1000);
		    Runtime.getRuntime().exec("D:\\JOBSoftware\\upload.exe");
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[3]/div/button")).click();
		    Thread.sleep(3000);				
		    
		    webdriver.navigate().refresh();
		    Thread.sleep(1500);
		    
		    // 分页-删除
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[2]/span[2]/div/div[1]/input")).click();
		    Thread.sleep(1500);
		    webdriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[2]")).click();
		    Thread.sleep(1500);
		    
		    WebElement GJG = webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[12]"));
		    Thread.sleep(1000);
		    //循环点击键盘下键，直到元素可见
		    Actions action666 = new Actions(webdriver);
		    while(true){
			     action666.sendKeys(GJG,Keys.DOWN).perform();
			     // 使用try…catch…来判断元素是否可见，可见就进行元素操作并退出循环
			     try {
			    	 webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[12]"));
			    	 break;
			     } catch (Exception e) {
			     
			     }
		    }
		    
		    Thread.sleep(1500);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[12]/td[6]/div/button[1]")).click();
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div/div[2]/form/div[5]/div/div/div[3]/table/tbody/tr[1]/td[6]/div/button[2]")).click();
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div/div[3]/div/button")).click();
		    Thread.sleep(1000);
		    // 删除
		    webdriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[12]/td[6]/div/button[2]")).click();
		    Thread.sleep(1000);
		    webdriver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button[2]")).click();
		    Thread.sleep(1000);
		    
	}
}
