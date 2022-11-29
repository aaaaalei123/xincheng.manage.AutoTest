package com.rao;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.github.bonigarcia.wdm.WebDriverManager;

import com.rao.tool.WebDriverTool;

public class AllRun {

	public static void main(String[] args) throws Exception {
		Thread.sleep(3000);
		System.setProperty("webdriver.edge.driver", "D:/OneDrive/JobData/software/edgedriver_win64/msedgedriver.exe");
		//WebDriverManager.edgedriver().setup();
		WebDriver webDriver = WebDriverTool.webdriver;
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		
		// 与浏览器同步非常重要，必须等待浏览器加载完毕
		//旧方法
		// webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		new WebDriverWait(webDriver, Duration.ofSeconds(10));
		//打开目标地址
		webDriver.get("http://xincheng.manage.kukeduo.net/Admin/ShopLogin.aspx");
		
		Login login = new Login();
		
		Home home = new Home();
		Garden garden = new Garden();
		Massif massif = new Massif();
		Farm farm = new Farm();
		Plant plant = new Plant();
		Pick pick = new Pick();
		Monitor monitor = new Monitor();
		Station station = new Station();
		Instock instock = new Instock();
		Outstock outstock = new Outstock();
		Qrcode qrcode = new Qrcode();
		User user = new User();
		Admin admin = new Admin();
		Feedback feedback = new Feedback();
		Guide guide = new Guide();
		Message message = new Message();
		Wiki wiki = new Wiki();
		Systems systems = new Systems();
		Label label = new Label();
		Systemcrop systemcrop = new Systemcrop();
		
		
		//登录
		login.pageRun();
		Thread.sleep(1000);
		
		//首页
		home.pageRun();
		Thread.sleep(1000);
		
		//果园管理-果园列表
		garden.pageRun();
		Thread.sleep(1000);
		
		//果园管理-地块列表
		massif.pageRun();
		Thread.sleep(1000);
		
		webDriver.navigate().refresh();
		
		//农事活动-农事记录
		farm.pageRun();
		Thread.sleep(1000);
		
		//农事活动-种植记录
		plant.pageRun();
		Thread.sleep(1000);
		
		//农事活动-采摘记录
		pick.pageRun();
		Thread.sleep(1000);
	
		
		webDriver.navigate().refresh();
		
		//物联监控-监控管理
		monitor.pageRun();
		Thread.sleep(1000);
		
		//webDriver.navigate().refresh();
		
		//物联监控-监测站管理
		station.pageRun();
		Thread.sleep(1000);
		
		webDriver.navigate().refresh();
		
		//产品流通-入库管理
		instock.pageRun();
		Thread.sleep(1000);
		
		//webDriver.navigate().refresh();
		
		//产品流通-入库管理
		outstock.pageRun();
		Thread.sleep(1000);
		
		webDriver.navigate().refresh();
		
		//审核管理-精品二维码审核
		qrcode.pageRun();
		Thread.sleep(1000);
		
		//webDriver.navigate().refresh();
		
		//用户中心-用户管理
		user.pageRun();
		Thread.sleep(1000);
		
		//用户中心-管理员管理
		admin.pageRun();
		Thread.sleep(1000);
		
		webDriver.navigate().refresh();
		
		//用户中心-反馈管理
		feedback.pageRun();
		Thread.sleep(1000);
		
		webDriver.navigate().refresh();
		
		//设置-指南维护
		guide.pageRun();
		Thread.sleep(1000);
		
		//设置-消息发布
		message.pageRun();
		Thread.sleep(1000);
		
		//设置-作物百科
		wiki.pageRun();
		Thread.sleep(1000);
		
		//设置-系统参数设置
		systems.pageRun();
		Thread.sleep(1000);
		
		//设置-标签参数设定
		label.pageRun();
		Thread.sleep(1000);
		
		//设置-系统作物管理
		systemcrop.pageRun();
		Thread.sleep(1000);
		
		//退出浏览器
		Thread.sleep(2000);
		webDriver.quit();
	}
}
