package com.mrgd;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mrgd {
	public static void main(String[] args) throws InterruptedException {
//		Thread.sleep(3000);   //等待3秒
//		//System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver","D:/JOBSoftware/chromedriver_win32/chromedriver.exe");   // 谷歌:后边路径修改为谷歌驱动路径
//		//WebDriver webDriver = new FirefoxDriver();    火狐
//		WebDriver webDriver = new ChromeDriver();  
//		webDriver.manage().window().maximize();  //浏览器最大化
//		webDriver.manage().deleteAllCookies();   //删除所有缓存

		mrgd mrgd = new mrgd();
		
//		//与浏览器同步非常重要，必须等待浏览器加载完成
//		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		//打开目标地址
//		webDriver.get("http://testorchdbs.yufengtek.com/#/login");
		
		//输入账号
//		webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/label/input")).sendKeys("admin");
//		webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/label/input")).sendKeys("admin");
//		Thread.sleep(7000);         // 暂定，停止7秒，手动输入验证码后，点击登录
		
		
		mrgd.getVerificationCode("D:\\JOBSoftware\\image\\grand1.png");

		
//		webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[5]/span")).click();
//		Thread.sleep(2000);
    
	    
	}
	
		//将验证码页面截图保存
		public byte[] takeScreenshot(WebDriver driver) throws IOException {
			byte[] screenshot = null;
			screenshot = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.BYTES);//得到截图
			return screenshot;
		}
		
		
		//得到的图片是整个屏幕的截图，对截图进行截取，只保留验证码那一部分
		public BufferedImage createElementImage(WebDriver driver,
				WebElement webElement, int x, int y, int width, int heigth)//开始裁剪的位置和截图的宽和高
				throws IOException {
			Dimension size = webElement.getSize();
			BufferedImage originalImage = ImageIO.read(new ByteArrayInputStream(takeScreenshot(driver)));
			BufferedImage croppedImage = originalImage.getSubimage(x, y,size.getWidth() + width, size.getHeight() + heigth);//进行裁剪
			return croppedImage;
		}
		
		//tesseract读取图片，获得验证码，默认是英文，如果要使用中文包，加上instance.setLanguage("chi_sim"); 
		@SuppressWarnings("unused")
		private String getVerificationCode(String path) throws InterruptedException {
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
			
			
			File imageFile = new File(path);
			try {
				imageFile.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			WebElement element = webDriver.findElement(By.cssSelector("img[alt='code']"));
			try {
				BufferedImage image = createElementImage(webDriver, element, 700, 200,
						300, 200);//得到裁剪的图片
				ImageIO.write(image, "png", imageFile);//进行保存
			} catch (IOException e) {
				e.printStackTrace();
			}
			ITesseract instance = new Tesseract();//调用Tesseract
			URL url = ClassLoader.getSystemResource("tessdata");//获得Tesseract的文字库
			String tesspath = url.getPath().substring(1);
			instance.setDatapath(tesspath);//进行读取，默认是英文，如果要使用中文包，加上instance.setLanguage("chi_sim"); 
			String result = null;
			try {
				result = instance.doOCR(imageFile);
			} catch (TesseractException e1) {
				e1.printStackTrace();
			}
			result = result.replaceAll("[^a-z^A-Z^0-9]", "");//替换大小写及数字
			System.out.println(result);
			return result;
		}
	

	

}
