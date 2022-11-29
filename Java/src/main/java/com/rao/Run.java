package com.rao;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.regex.Pattern;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.io.File;

import com.rao.tool.WebDriverTool;


public class Run {

	static WebDriver webDriver = WebDriverTool.webdriver;
	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		Thread.sleep(3000);
		System.setProperty("webdriver.edge.driver", "D:/OneDrive/JobData/software/edgedriver_win64/msedgedriver.exe");
		//WebDriverManager.edgedriver().setup();
	
	}

	@Test
	public static void main(String[] args) throws Exception {
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
				
		// 与浏览器同步非常重要，必须等待浏览器加载完毕
		//旧方法
		// webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new WebDriverWait(webDriver, Duration.ofSeconds(10));
		//打开目标地址
		webDriver.get("http://xincheng.manage.kukeduo.net/Admin/ShopLogin.aspx");

		try { 

		Login login = new Login();
		Default pagDefault = new Default();
		
		
		//登录
		login.pageRun();
		Thread.sleep(1000);
		
		// //首页
		pagDefault.pageRun();
		Thread.sleep(1000);
		
		
		
		// //退出浏览器
		// Thread.sleep(2000);
		// webDriver.quit();
		
		// webDriver.quit();
		// String verificationErrorString = verificationErrors.toString();
		// if (!"".equals(verificationErrorString)) {
		//   fail(verificationErrorString);
		// }
  
		} catch(NoSuchElementException NSEE){ 
			System.out.println("未找到元素！！！"+ NSEE);
		}catch(NoSuchWindowException NSWE){
			System.out.println("切换浏览器窗口时出现异常!!!"+ NSWE);
		}catch(NoAlertPresentException  NAPE){
			System.out.println("找不到对话框！！！"+ NAPE);
		}catch(ElementNotVisibleException ENVE ){
			System.out.println("找不到元素！！！"+ ENVE);	
		}catch(ElementNotSelectableException ENSE ){
			System.out.println("无法选择元素！！！"+ ENSE);	
		}catch(NoSuchSessionException NSSE ){
			System.out.println("无法搜索会话！！！"+ NSSE);	
		}catch(StaleElementReferenceException SERE ){
			System.out.println("无法与所需元素交互！！！"+ SERE);	
		}catch(TimeoutException TE ){
			System.out.println("超时！！！"+ TE);	
		}catch(NoSuchFrameException NSF){
			System.out.println("找不到所需的框架！！！"+ NSF);	
		}
	}

}
