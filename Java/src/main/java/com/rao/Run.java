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

import com.rao.tool.*;

public class Run extends BrowserBase {

	@Test
	public static void main(String[] args) throws Exception {
		BrowserBase browserBase = new BrowserBase();

		//打开浏览器和地址
		browserBase.setBrowserType(3);
		browserBase.maxWindow();
		browserBase.open("http://xincheng.manage.kukeduo.net/Admin/ShopLogin.aspx");

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
		browserBase.quit();
  
		
		// webDriver.quit();
		// String verificationErrorString = verificationErrors.toString();
		// if (!"".equals(verificationErrorString)) {
		//   fail(verificationErrorString);
		// }
  
		} catch(NoSuchElementException NSEE){ 
			LogRecorder.Error("未找到元素!!!" + NSEE);
		}catch(NoSuchWindowException NSWE){
			LogRecorder.Error("切换浏览器窗口时出现异常!!!"+ NSWE);
		}catch(NoAlertPresentException  NAPE){
			LogRecorder.Error("找不到对话框！！！"+ NAPE);
		}catch(ElementNotVisibleException ENVE ){
			LogRecorder.Error("找不到元素！！！"+ ENVE);
		}catch(ElementNotSelectableException ENSE ){
			LogRecorder.Error("无法选择元素！！！"+ ENSE);
		}catch(NoSuchSessionException NSSE ){
			LogRecorder.Error("无法搜索会话！！！"+ NSSE);
		}catch(StaleElementReferenceException SERE ){
			LogRecorder.Error("无法与所需元素交互！！！"+ SERE);
		}catch(TimeoutException TE ){
			LogRecorder.Error("超时！！！"+ TE);
		}catch(NoSuchFrameException NSF){
			LogRecorder.Error("找不到所需的框架！！！"+ NSF);
		}
	}

}
