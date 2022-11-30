package com.rao.tool;

import org.testng.Reporter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.OutputType;

public class LogRecorder {

    public static int LEVEL_DEBUG = 0;
    public static int LEVEL_INFO = 1;
    public static int LEVEL_EVENT = 2;
    public static int LEVEL_WARNING = 3;
    public static int LEVEL_ERROR = 4;
    public static int s_nLogLevel = LEVEL_DEBUG;

    /**
     * 根据日志级别设置日志颜色
     * @param nLevel
     * @return
     */
    private static String GetColorByLevel(int nLevel) {
        switch (nLevel){
            case 0:
              return "Grey";
            case 1:
                return "green";
            case 2:
                return "Navy";
            case 3:
                return "Orchid";
            case 4:
                return "Red";
            default:
                return "Black";
        }

    }

    /**
     * 根据日志级别设置日志开头信息
     * @param nLevel
     * @return
     */
    private static String GetHeadLine(int nLevel){
        switch (nLevel) {
            case 0:
                return "[DEBUG]";
            case 1:
                return "[INFO]";
            case 2:
                return "[EVENT]";
            case 3:
                return "[WARNING]";
            case 4:
                return "[ERROR]";
            default:
                return "[OTHER]";

        }
    }

    /**
     * 增加日志,需要指定日志内容和日志级别
     * @param sLog
     * @param nLevel
     * @return
     */
    public static boolean AddLog(String sLog, int nLevel) {
        if (nLevel < s_nLogLevel) {
            return false;
        }

        Calendar cal = Calendar.getInstance();

        String sHour = Integer.toString(cal.get(Calendar.HOUR_OF_DAY));
        if (sHour.length() == 1) {
            sHour = 0 + sHour;
        }

        String sMinute = Integer.toString(cal.get(Calendar.MINUTE));
        if (sMinute.length() == 1) {
            sMinute = 0 + sMinute;
        }

        String sSecond = Integer.toString(cal.get(Calendar.SECOND));
        if (sSecond.length() == 1) {
            sSecond = 0 + sSecond;
        }

        String log = sHour + ":" + sMinute + ":" + sSecond + " " + GetHeadLine(nLevel) + sLog;
        Reporter.log(log);
        System.out.println(log);
        return true;

    }

    /**
     * 添加DEBUG级别的日志
     * @param slog 日志内容
     * @return
     */
    public static boolean Debug(String slog){
        return AddDebugLog(slog);
    }

    /**
     * 增加Debug级别日志
     * @param sLog
     * @return
     */
    public static boolean AddDebugLog(String sLog) {
        GetColorByLevel(0);
        return AddLog(sLog,LEVEL_DEBUG);
    }


    /**
     * 添加INFO级别的日志
     * @param slog 日志内容
     * @return
     */
    public static boolean Info(String slog){
        return AddInfoLog(slog);
    }

    /**
     * 增加Info级别日志
     * @param sLog
     * @return
     */
    public static boolean AddInfoLog(String sLog) {
        GetColorByLevel(1);
        return AddLog(sLog,LEVEL_INFO);
    }


    /**
     * 添加EVENT级别的日志
     * @param slog 日志内容
     * @return
     */
    public static boolean Event(String slog){
        return AddEventLog(slog);
    }

    /**
     * 增加Event级别日志
     * @param sLog
     * @return
     */
    public static boolean AddEventLog(String sLog) {
        GetColorByLevel(2);
        return AddLog(sLog,LEVEL_EVENT);
    }


    /**
     * 添加WARN级别的日志
     * @param slog 日志内容
     * @return
     */
    public static boolean Warn(String slog){
        return AddWarningLog(slog);
    }

    /**
     * 增加Warning级别日志
     * @param sLog
     * @return
     */
    public static boolean AddWarningLog(String sLog) {
        GetColorByLevel(3);
        return AddLog(sLog,LEVEL_WARNING);
    }

    
    /**
     * 添加ERROR级别的日志
     * @param slog 日志内容
     * @return
     */
    public static boolean Error(String slog){
        return AddErrorLog(slog);
    }

    /**
     * 增加Error级别日志
     * @param sLog
     * @return
     */
    public static boolean AddErrorLog(String sLog) {
        GetColorByLevel(4);
        return AddLog(sLog,LEVEL_ERROR);
    }


    /**
     * 异常日志,以error级别打印相关信息,以debug等级打印调用堆栈
     * @param e
     * @return
     */
    public static boolean AddExceptionLog(Exception e) {
       ByteArrayOutputStream buf = new ByteArrayOutputStream();
       e.printStackTrace(new PrintWriter(buf,true));
       String sLog = "出现:" + e.getClass().toString() + ",异常信息: " + e.getMessage();
       AddLog(sLog,LEVEL_ERROR);
       sLog = "堆栈信息: " + buf.toString();
       return AddLog(sLog,LEVEL_DEBUG);
    }

    /**
     * 指定截图目录
     */
    public static String s_sFilePath = System.getProperty("user.dir") + "\\screenshot\\";

    /**
     * 创建截图目录
     */
    private static void CreateDirectory(){
        File file = new File(s_sFilePath);
        file.mkdirs();
    }


    /**
     * 截图
     * @param driver
     */
    private void screenShot(WebDriver driver) {
        // TODO Auto-generated method stub
        CreateDirectory();
        String dir = "screenshot";
        String time = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
        String fileName = time;
        String path = "screenshot/" + fileName + ".jpg";
        String screenShotPath = "";
        WebDriver augmentedDriver = null;
        if (GlobalSettings.browserType == 1 || GlobalSettings.browserType == 3) {
            augmentedDriver = driver;
        } else if (GlobalSettings.browserType == 2) {
            augmentedDriver = new Augmenter().augment(driver);
        } else {
            Reporter.log("错误的浏览器类型");
        }

        try {
            File sourceFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
            screenShotPath =path;
            FileUtils.copyFile(sourceFile, new File(screenShotPath));
        } catch (Exception e) {
            e.printStackTrace();
            Reporter.log("截图失败");
        }

        if (!"".equals(screenShotPath)) {
            Reporter.log(screenShotPath);
            Reporter.log("<img src=\"../" + path + "\" style=\"clip:rect(10px 100px 90px 20px);"
                    + "width: 100px;\" onclick=\"op(this.src)\"/>");
            Reporter.log("<script language=\"javascript\">\r\n"
                    + " function op(c_url)"
                    + " {"
                    + "  window.open(c_url)"
                    + " }"
                    + "</script>");
        }
    }

}
