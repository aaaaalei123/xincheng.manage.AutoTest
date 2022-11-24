package com.mrgd;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.rao.tool.SetValue;
import com.rao.tool.WebDriverTool;


public class Guide {
	public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","E:/JAVA/chromedriver.exe");   // 谷歌:后边路径修改为谷歌驱动路径
        WebDriver webDriver = WebDriverTool.webdriver;
        Actions action=new Actions(webDriver);
		// 引用 OpenChrome 打开浏览器
		webDriver.manage().window().maximize();  //浏览器最大化
		webDriver.manage().deleteAllCookies();   //删除所有缓存
		
		// 与浏览器同步非常重要，必须等待浏览器加载完成
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// 打开目标地址
		webDriver.get("http://testorchdbs.yufengtek.com/admin");
		Thread.sleep(1000);
		
		// 登录
		webDriver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/div/div/input")).sendKeys("15970771067");
		webDriver.findElement(By.xpath("/html/body/div/div/div/div/form/div[2]/div/div/input")).sendKeys("qwer123");
		webDriver.findElement(By.cssSelector("span[class='el-checkbox__inner']")).click();
		webDriver.findElement(By.cssSelector("button[class='el-button size submit el-button--primary']")).click();
		
        // 点击设置
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[8]/div")).click();
		Thread.sleep(500);
		
// 指南维护
	    // 点击指南维护
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[8]/ul/li[1]")).click();
		Thread.sleep(500);
		
		// 添加
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/button[2]")).click();
		Thread.sleep(1000);
		// 标题
		webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div/div/div/input")).sendKeys("CS");
		Thread.sleep(1000);
		// 指南类型
		webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[2]/div/div")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[2]")).click();
		Thread.sleep(1000);
		// 录入方式
		webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[3]")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[1]")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.cssSelector("div[class='ql-editor ql-blank'][data-gramm='false']")).sendKeys("尼古拉斯凯奇慕容狗蛋");
		Thread.sleep(1000);
		// 查询元素 Enter
		WebElement B = webDriver.findElement(By.cssSelector("div[class='el-pagination is-background']"));
		action.sendKeys(B,Keys.ENTER);
		Thread.sleep(1000);
		webDriver.findElement(By.cssSelector("button[type='button'][class='ql-image']")).click();
		Thread.sleep(1000);
		// 选择图片
		Runtime.getRuntime().exec("D:\\JOBSoftware\\upload.exe");
		webDriver.findElement(By.cssSelector("button[class='el-button el-button--primary']")).click();
		Thread.sleep(1000);
		
		webDriver.navigate().refresh();
	    Thread.sleep(2000);
		
	// 搜索
		webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/div/span/span/i")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]")).click();
		Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/button[1]")).click();
	    Thread.sleep(1000);
	// 编辑
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[6]/div/div/button")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.cssSelector("span[class='el-upload-list__item-actions']")).click();
	    Thread.sleep(1000);
	    WebElement sctp = webDriver.findElement(By.cssSelector("span[class='el-upload-list__item-actions']"));
	    Thread.sleep(1000);
	    action.sendKeys(sctp,Keys.DELETE);
	    Thread.sleep(1000);
	    webDriver.findElement(By.cssSelector("i[data-v-05f756c3][class='el-icon-plus']")).click();
	    Thread.sleep(1000);
	    Runtime.getRuntime().exec("D:\\JOBSoftware\\upload.exe");
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[4]/div/div[3]/div/button")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[6]/div/div/button[1]")).click();
	    Thread.sleep(1000);
//  消息发布
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[8]/ul/li[2]")).click();
	    Thread.sleep(1000);
	    // 消息类型
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/button[2]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.cssSelector("input[placeholder='消息类型']")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[1]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.cssSelector("input[placeholder='消息状态']")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[1]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[2]/div/div/div/div/input")).sendKeys("qwer123");
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[3]/div/div/div/div/input")).sendKeys("123456");
	    Thread.sleep(1000);
	    webDriver.findElement(By.cssSelector("i[data-v-5850c5bd][class='el-icon-plus']")).click();
	    Runtime.getRuntime().exec("D:\\JOBSoftware\\upload.exe");
	    Thread.sleep(1000);
	    webDriver.findElement(By.cssSelector("div[class='ql-editor ql-blank'][data-gramm='false'][data-placeholder='请输入消息内容']")).sendKeys("hhhhhhhhhhhhhhh");
	    Thread.sleep(1000);
	    // 保存
	    webDriver.findElement(By.cssSelector("button[data-v-5850c5bd][class='el-button el-button--primary']")).click();
	    Thread.sleep(1000);
	    
	    webDriver.navigate().refresh();
	    Thread.sleep(1500);
	    
	  // 消息发布-详情修改
		webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[5]/div/button")).click();
		Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[4]/div/div[2]/form/div[1]/div[2]/div/div/div/div[1]/input")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[2]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[4]/div/div[3]/div/button[2]")).click();
	    Thread.sleep(1000);
	    
	    webDriver.navigate().refresh();
	    Thread.sleep(1500);

	  // 消息发布-筛选
        webDriver.findElement(By.cssSelector("input[placeholder='选择消息类型']")).click();
        Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/button[1]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div/div/div[3]/button[1]")).click();  // 刷新
	    Thread.sleep(1000);
	    
// 作物百科 - 主页
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[8]/ul/li[3]")).click();
	    Thread.sleep(1000);
	  // 作物百科-添加
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/button[2]")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[1]/div/div/div/input")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[1]")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[2]/div/div/div/input")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[2]")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[2]/form/div[3]/div/div/div/input")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[5]/div/div/ul/li[2]")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.cssSelector("div[data-placeholder='请输入作物百科内容']")).sendKeys("selenium");
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[3]/div/div[3]/div/button")).click();
	    Thread.sleep(1000);
	    
	  // 作物百科-编辑
	    webDriver.findElement(By.xpath("/html/body/div/div//div[2]/section/div/div/div/div[2]/div/div[3]/table/tbody/tr/td[6]/div/div/button[2]")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[4]/div/div[2]/form/div[3]/div/div/div/input")).click();
	    Thread.sleep(500);
	    
	  // 编辑发布
	    webDriver.findElement(By.xpath("/html/body/div[6]/div/div/ul/li[1]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div[2]/div[4]/div/div[3]/div/button")).click();
	    Thread.sleep(1000);
	    
	    webDriver.navigate().refresh();
	    Thread.sleep(1500);
	    
	 // 作物百科-筛选搜索
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/div/div/input")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/button[1]")).click();
	    Thread.sleep(1000);
	    
	  // 删除
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[6]/div/div/button[2]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[2]")).click();
	    Thread.sleep(1000);
	    
	    webDriver.navigate().refresh();
	    Thread.sleep(1500);
	    
// 系统参数设置
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/aside/ul/li[8]/ul/li[4]")).click();
	    Thread.sleep(2000);
	    
	  // 农事类型-添加/删除
	    webDriver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div/div/div/div/span/span/button")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div/div/input")).sendKeys("测试-农事类型");
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div/button")).click();
	    Thread.sleep(2000);
	    webDriver.findElement(By.xpath("//span[contains(., '测试-农事类型')]/i")).click();    // 查询文本
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//div/button[2]/span")).click();
	    Thread.sleep(500);
	    
	    webDriver.navigate().refresh();
	    Thread.sleep(2000);
	    
	  // 施肥种类-添加/删除
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/span/span/button")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div/div/div/input")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[1]")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/input")).sendKeys("测试-1");
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div/button")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//span[contains(., '测试-1')]/i")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//div/button[2]/span")).click();
	    Thread.sleep(500);
	    
	    webDriver.navigate().refresh();
	    Thread.sleep(2000);
	    
	  // 果品分类-添加/删除
	    
	    //通过xpath获取到滚动条所在元素位置
	    WebElement fl = webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div[1]"));
	    //循环点击键盘下键，直到元素可见
	    Actions action111=new Actions(webDriver);
	    while(true){
	     action111.sendKeys(fl,Keys.DOWN).perform();
	     // 使用try…catch…来判断元素是否可见，可见就进行元素操作并退出循环
	     try {
	      webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div[1]"));
	      break;
	     } catch (Exception e) {
	     }
	    }
	    
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div[1]/span/span/button")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div/div/input")).sendKeys("测试类");
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div/button")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//span[contains(., '测试类')]/i")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//div/button[2]/span")).click();
	    Thread.sleep(500);
	    
	    webDriver.navigate().refresh();
	    Thread.sleep(3000);
	    
      // 果品等级-添加/删除
	    
	    WebElement B1 = webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[6]/div[1]"));
	    //循环点击键盘下键，直到元素可见
	    Actions action222 = new Actions(webDriver);
	    while(true){
	     action222.sendKeys(B1,Keys.DOWN).perform();
	     // 使用try…catch…来判断元素是否可见，可见就进行元素操作并退出循环
	     try {
	      webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[6]/div[1]"));
	      break;
	     } catch (Exception e) {
	     }
	    }
	    
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div[1]/span/span/button")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div/div/input")).sendKeys("满级");
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div/button")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//span[contains(., '满级')]/i")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//div/button[2]/span")).click();
	    Thread.sleep(500);
	    
	    webDriver.navigate().refresh();
	    Thread.sleep(3000);
// 标签参数设定
		
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/aside/ul[1]/li[8]/ul/li[5]")).click();
	    Thread.sleep(500);
	    
	    webDriver.findElement(By.xpath("//span[contains(., '添加')]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[1]/div/div/div[1]/input")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[2]/div/div/div[1]/input")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[4]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[3]/div/div/div/input")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[4]/div/div[1]/input")).sendKeys("20");
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[3]/div/button")).click();
	    Thread.sleep(1000);
	    // 修改详情
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[7]/div/button")).click();
	    Thread.sleep(1000);
	    SetValue.setElementValue(webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div/div[2]/form/div[4]/div/div/input")), "16");
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div/div[3]/div/button/span")).click();
	    Thread.sleep(1000);
	    
	    webDriver.navigate().refresh();
	    Thread.sleep(1500);
	    
	    // 筛选
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/div/div/input")).click();
	    Thread.sleep(1000);
	    
	    WebElement D = webDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[14]"));
	    //循环点击键盘下键，直到元素可见
	    Actions action333 = new Actions(webDriver);
	    while(true){
	     action333.sendKeys(D,Keys.DOWN).perform();
	     // 使用try…catch…来判断元素是否可见，可见就进行元素操作并退出循环
	     try {
	      webDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[14]"));
	      break;
	     } catch (Exception e) {
	     }
	    }
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[14]")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/button[1]/span")).click();
	    
	    webDriver.navigate().refresh();
	    Thread.sleep(3000);
	    
// 系统作物管理
	  // 筛选搜索
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/aside/ul[1]/li[8]/ul/li[6]")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/div[1]/div/input")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[2]")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/div[2]/input")).sendKeys("蜜柚");
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/button[1]")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.cssSelector("button[title='刷新']")).click();
	    Thread.sleep(500);
	  // 新增/删除
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[1]/button[2]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[1]/div/div/div[1]/input")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[3]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[2]/div/div[1]/input")).sendKeys("高坚果");
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[3]/div/div[1]/input")).sendKeys("666");
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[4]/div/div[1]/input[1]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/table/tbody/tr[2]/td[5]/div/span")).click();  // 开始
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/table/tbody/tr[7]/td[2]/div/span")).click();  // 结束
	    Thread.sleep(1000);
	    // 生长周期
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[6]/button/span")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div/div[2]/form/div[1]/div/div/input")).sendKeys("好多周期");
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div/div[2]/form/div[2]/div/div/div/input")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[1]")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div/div[2]/form/div[3]/div/div/div/input")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[5]")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div/div[2]/form/div[4]/div/div/textarea")).sendKeys("别问，问就是好多周期");;
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div/div[2]/form/div[5]/div/div/div")).click();
	    Thread.sleep(500);
	    Runtime.getRuntime().exec("D:\\JOBSoftware\\upload.exe");
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[5]/div/div[3]/div/button")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[7]/div/div[1]/textarea")).sendKeys("简介：123456");
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[2]/form/div[8]/div/div/div")).click();
	    Thread.sleep(500);
	    Runtime.getRuntime().exec("D:\\JOBSoftware\\upload.exe");
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[3]/div/div[3]/div/button")).click();
	    Thread.sleep(1000);
	    
	    webDriver.navigate().refresh();
	    Thread.sleep(1500);
	    
	    // 筛选-删除
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[2]/span[2]/div/div[1]/input")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[2]")).click();
	    Thread.sleep(1000);
	    
	    WebElement GJG = webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[15]"));
	    Thread.sleep(1000);
	    //循环点击键盘下键，直到元素可见
	    Actions action666 = new Actions(webDriver);
	    while(true){
	     action666.sendKeys(GJG,Keys.DOWN).perform();
	     // 使用try…catch…来判断元素是否可见，可见就进行元素操作并退出循环
	     try {
	      webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[15]"));
	      break;
	     } catch (Exception e) {
	     }
	    }
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[15]/td[6]/div/button[1]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div/div[2]/form/div[5]/div/div/div[3]/table/tbody/tr/td[6]/div/button[2]/span")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[4]/div/div[3]/div/button")).click();
	    Thread.sleep(1000);
	    // 删除
	    webDriver.findElement(By.xpath("//*[@id='app']/div/div[2]/section/div/div/div/div[2]/div[1]/div[3]/table/tbody/tr[11]/td[6]/div/button[2]/span")).click();
	    Thread.sleep(500);
	    webDriver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button[2]")).click();
	    Thread.sleep(500);
	    
	}

}
