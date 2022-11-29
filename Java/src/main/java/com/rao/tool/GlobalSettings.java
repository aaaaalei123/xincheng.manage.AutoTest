package com.rao.tool;

import java.util.Locale;
import java.util.ResourceBundle;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class GlobalSettings {

    //获取配置文件
    public static ParseProperties prop =new ParseProperties(System.getProperty("user.dir")+"\\conf\\prop.properties");

    //浏览器类型,将读到的文件转化为整形
    public static int browserType = Integer.parseInt(prop.getValue("BrowserType"));

    //访问地址
    public static String baseUrl = prop.getValue("http://xincheng.manage.kukeduo.net/Admin/ShopLogin.aspx");

    //Microsoft Edge浏览器类型
    public static String edgeDriverType = prop.getValue("webdriver.edge.driver");

    //谷歌浏览器驱动地址
    public static String chromeDriverPath = prop.getValue("ChromeDriverPath");

    //火狐浏览器路径
    public static String firefoxPath =prop.getValue("FirefoxPath");

    //iMC用户名
    // public static String adminUserName = prop.getValue("adminUserName");

    //iMC密码
    // public static String adminPassword = prop.getValue("adminPassword");

    //查找元素的超时时间
    public static String timeout = prop.getValue("Timeout");

    //ChromeDriver浏览器
	//public static WebDriver webdriver = new ChromeDriver();
	
	//Edge浏览器
	public static WebDriver webdriver = new EdgeDriver();

    /**
     * 语言
     */
    public static String language = prop.getValue("language");

    public static ResourceBundle rb = getResourceBundle(language);

    public static ResourceBundle getResourceBundle(String language){
        if(language.equals("CN")){
            Locale locale1 = new Locale("zh","CN");
            return ResourceBundle.getBundle("myres_zh_CN",locale1);
        }else{
            Locale locale2 = new Locale("en","US");
            return ResourceBundle.getBundle("myres_en_US",locale2);
        }
    }
}
