package com.mrgd;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;



public class Imgcode {
	
		@SuppressWarnings("static-access")
		public static void main(String[] args) throws InterruptedException {
			Thread.sleep(3000);   //等待3秒
			//System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
			System.setProperty("webdriver.chrome.driver","D:/JOBSoftware/chromedriver_win32/chromedriver.exe");   // 谷歌:后边路径修改为谷歌驱动路径
			//WebDriver webDriver = new FirefoxDriver();    火狐
			WebDriver webDriver = new ChromeDriver();  
			webDriver.manage().window().maximize();  //浏览器最大化
			webDriver.manage().deleteAllCookies();   //删除所有缓存
			
			//与浏览器同步非常重要，必须等待浏览器加载完成
			webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//打开目标地址
			webDriver.get("http://testorchdbs.yufengtek.com/#/login");
			Thread.sleep(3000);
			
			webDriver.findElement(By.cssSelector("input#name")).sendKeys("admin");
			Thread.sleep(1000);
			webDriver.findElement(By.cssSelector("input#password")).sendKeys("admin");
			
			Imgcode imgcode = new Imgcode();
			String code = imgcode.CodeClass();	
			
			webDriver.findElement(By.cssSelector("input#verify")).sendKeys(code);
			webDriver.findElement(By.cssSelector("div[class='submit']")).click();
			Thread.sleep(1000);
			
			while (true) {
				if (imgcode.isContentAppeared(webDriver, "canvas[data-zr-dom-id='zr_0']")) {
					System.out.println("Yes");
					break;
				}else {
					System.out.println("No");
					imgcode.setElementValue(webDriver.findElement(By.cssSelector("input#verify")), "");
					String code1 = imgcode.CodeClass();	
					webDriver.findElement(By.cssSelector("input#verify")).sendKeys(code1);
					webDriver.findElement(By.cssSelector("div[class='submit']")).click();
				}
			}
			
			
//			if (imgcode.isContentAppeared(webDriver, "canvas[data-zr-dom-id='zr_0']")==false) {
//				System.out.println("no");
//				imgcode.setElementValue(webDriver.findElement(By.cssSelector("input#verify")), "");
//				String code1 = imgcode.CodeClass();	
//				webDriver.findElement(By.cssSelector("input#verify")).sendKeys(code1);
//				webDriver.findElement(By.cssSelector("div[class='submit']")).click();
////				return;
//			}else {
//				System.out.println("yes");
//				return;
//			}
//			imgcode.isContentAppeared(webDriver, "canvas[data-zr-dom-id='zr_0']");

		}
		
		private String CodeClass() {
			//截取验证码并识别
			CodeVode codeVode = new CodeVode();
			//截取整个屏幕，并将截图保存至文件夹
			codeVode.robotSnapshot("png", "D:\\JOBSoftware\\imageCode\\codeimg1.png");
			//对截图进行裁剪,x,y,width,height,源文件路径,图片裁剪后存放路径
			codeVode.cut(1058, 605, 85, 40, "D:\\JOBSoftware\\imageCode\\codeimg1.png", "D:\\JOBSoftware\\imageCode\\Codes\\codeimg1.png");
			
			//识别验证码图片
			File imageFile = new File("D:\\JOBSoftware\\imageCode\\Codes\\codeimg1.png");
			//调用Tesseract
			ITesseract instance = new Tesseract();
			instance.setDatapath("D:\\JOBSoftware\\tess4j\\tessdata");

			String verifycode = null;
			try {
				verifycode = instance.doOCR(imageFile);
			} catch (TesseractException e1) {
			e1.printStackTrace();
			}
			verifycode = verifycode.replaceAll("[^a-z^A-Z^0-9]", "");//替换大小写及数字
			System.out.println("Verify code is :" + verifycode);
			return verifycode;
		}
		
		
		public boolean isContentAppeared(WebDriver driver,String content) {
			boolean status = false;
			try {
				driver.findElement(By.cssSelector(content));
				System.out.println(content + " is appeard!");
				status = true;
			} catch (NoSuchElementException e) {
				status = false;
				System.out.println("'" + content + "' doesn't exist!");
			}
			return status;
		}
		
		public static void setElementValue(WebElement element,String value){
			element.sendKeys(Keys.chord(Keys.CONTROL, "a"), value);//method1
		}
		

}
