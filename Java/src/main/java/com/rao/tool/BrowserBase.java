package com.rao.tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;

import org.testng.Assert;


/**
 * 测试脚本继承此类
 * 浏览器封装
 */
public class BrowserBase {

    //项目路径
    private String projectpath = System.getProperty("user.dir");

    protected WebDriver driver = WebDriverTool.webdriver;
    private static DesiredCapabilities caps = null;
    private FirefoxProfile firefoxprofile = null;
    public ChromeDriverService chromeService;
    public EdgeDriver edgeDriver;
    public GlobalSettings globalSettings;

    /**
     * 获取WebDriver
     *
     * @return WebDriver
     */
    public WebDriver getBrowserDriver() {
        return driver;
    }

    /**
     * 设置浏览器类型
     *
     * @param type 1=firefox 2=chrome 3=edge 4=safari(未实现)
     */
    public void setBrowserType(int type) {
        switch (type) {
            case 1://firefox:1
                // System.setProperty("webdriver.firefox.bin", GlobalSettings.firefoxPath);
                // File firebug = new File(projectpath + "\\tool\\firebug.xpi");
                // File firepath = new File(projectpath + "\\tool\\FireXPath.xpi");

                // firefoxprofile = new FirefoxProfile();

                // driver = new FirefoxDriver();
                // try {
                //     firefoxprofile.addExtension(firebug);
                //     firefoxprofile.addExtension(firepath);
                // } catch (IOException e) {
                //     e.printStackTrace();
                // }

                // driver = new FirefoxDriver(firefoxprofile);
                // LogRecorder.AddInfoLog("使用 Firefox");
                // driver.manage().window().maximize();
                // break;
            case 2: //chrome:2
                // System.setProperty("webdriver.chrome.driver", projectpath + GlobalSettings.chromeDriverPath);
                // ChromeOptions options = new ChromeOptions();
                // options.addArguments("--disable-popup-blocking"); //设置为不拦截弹出窗口，否则部分case的弹出页面打不开
                // caps = DesiredCapabilities.chrome();
                // caps.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
                // driver = new ChromeDriver(caps);
                // LogRecorder.Info("使用Chrome");
                // driver.manage().window().maximize();
                // break;
            case 3: //edge:3
                System.setProperty("webdriver.edge.driver", projectpath + "/software/msedgedriver.exe");
                LogRecorder.Info("使用 Edge");
                new WebDriverWait(driver, Duration.ofSeconds(5));
                break;
            case 4: //safari:4
                driver = new SafariDriver();
                LogRecorder.Info("使用 Safari");
                driver.manage().window().maximize();
                break;
            default:
                Assert.fail("错误的浏览器类型");
                break;
        }


    }

    /**
     * 打开链接
     *
     * @param url 页面地址
     */
    public void open(String url) {
        try {
            driver.get(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LogRecorder.Info("打开链接: " + url);
    }


    /**
     * 暂停浏览器操作
     *
     * @param time 暂停时间,单位为秒
     */
    public void pause(float time) {
        if (time <= 0) {
            return;
        }
        try {
            Thread.sleep((int) time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 退出浏览器
     */
    public void quit() {
        driver.quit();
        LogRecorder.Info("退出浏览器");
    }

    /**
     * 浏览器最大化(默认情况下初始浏览器时已经最大化浏览器)
     */
    public void maxWindow() {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        LogRecorder.Info("最大化浏览器");
    }

    /**
     * 获取日期,返回nMinutes后的日期
     * @param timeFormat 时间格式
     * @param nMinutes 延长的时间(分钟)
     * @return nMinutes后的日期
     */
    public String getCurrentTime(String timeFormat, int nMinutes) {
        String time = "";
        long current = System.currentTimeMillis();
        current += nMinutes * 60 * 1000;
        Date date = new Date(current);
        SimpleDateFormat dateFormat = new SimpleDateFormat(timeFormat);
        time = dateFormat.format(date);
        return time;
    }

}
