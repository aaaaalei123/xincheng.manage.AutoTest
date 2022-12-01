package com.rao.tool;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BasePage {
    protected WebDriver driver = WebDriverTool.webdriver;
    Actions actions = new Actions(driver);

    private static float timeout = 5;

    // protected BasePage(WebDriver driver) {
    //     this.driver = driver;
    // }

    public WebDriver getDriver(){
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForPageLoad() {
        getDriver().manage().timeouts().pageLoadTimeout((int)timeout,TimeUnit.SECONDS);
    }

    public void refresh(){
        driver.navigate().refresh();
        LogRecorder.Info("刷新页面");
    }

    /**
     * 进入frame（不在同一frame就无法查找元素）,自带默认超时时间
     * @param locator
     * (1/2)
     */
    public void enterFrame(By locator) {
        enterFrame(locator, timeout);
    }

    /**
     * 进入frame（不在同一frame就无法查找元素）,可以指定默认超时时间
     * @param locator 定位器
     * @param timeout 超时时间
     * (2/2)
     */
    private void enterFrame(By locator, float timeout) {
        // TODO Auto-generated method stub
        if (isElementPresent(locator)) {
            driver.switchTo().frame(getElement(locator, timeout));
        }
    }

    /**
     * 离开当前Frame,返回默认Frame
     */
    public void leaveFrame() {
        driver.switchTo().defaultContent();
        LogRecorder.Info("返回默认Frame");
    }



    /**
     * 判断元素是否存在，等待到超时时间，最长超时时间在配置文件中定义,元素需要可以显示
     * @param locator 定位器
     * @return 元素是否存在的boolean值
     * (1/2)
     * */

    public boolean isElementPresent(By locator) {
        return isElementPresent(locator,timeout);
    }

    /**
     * 判断元素是否存在,可以指定超时时间
     * @param locator 定位器
     * @param timeout 超时时间
     * @return
     * (2/2)
     */
    private boolean isElementPresent(final By locator, float timeout) {
        // TODO Auto-generated method stub
        boolean isPresent = false;
        WebDriverWait wait = new WebDriverWait(driver,(int)timeout);
        try {
            isPresent = wait.until(new ExpectedCondition<Boolean>(){
                                       public Boolean apply(WebDriver d) {
                                           try{
                                               return d.findElement(locator).isDisplayed();
                                           } catch (NoSuchElementException ex) {
                                               return false;
                                           }
                                       }
                                   }
            );
        } catch (TimeoutException e) {
            LogRecorder.Error("查找可视元素 " + locator.toString() + " 超时.");
        }
        return isPresent;
    }

    /**
     * 获取页面元素（不需要可以显示的），使用默认超时时间
     * @param locator 定位器
     * @return
     * (1/2)
     * */
    public WebElement getElement(By locator){
        return getElement(locator, timeout);
    }

    /**
     * 获取页面元素（不需要可以显示的），可以指定超时时间
     * @param locator 定位器
     * @param timeout 超时时间
     * @return
     * (2/2)
     */
    private WebElement getElement(final By locator, float timeout) {
        // TODO Auto-generated method stub
        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(driver, (int) timeout);
        try {
            element = wait.until(new ExpectedCondition<WebElement>(){
                public WebElement apply(WebDriver d){
                    try {
                        return d.findElement(locator);
                    } catch (NoSuchElementException ex) {
                        return null;
                    }
                }
            });

        } catch (TimeoutException ex) {
            LogRecorder.Error("查找元素 " + locator.toString() + " 超时");
        }
        if (null == element) {
            throw new NoSuchElementException("无法定位页面元素" + locator.toString());
        }

        return element;
    }


    /**
     * 获取控件文本信息,使用默认超时时间
     * @param locator 定位器
     * @return
     * (1/2)
     */
    public String getElementText(By locator) {
        return getElementText(locator,timeout);
    }

    /**
     * 获取控件文本信息,可以指定超时时间
     * @param locator 定位器
     * @param timeout 超时时间
     * @return
     * (2/2)
     */
    private String getElementText(By locator, float timeout) {
        // TODO Auto-generated method stub
        WebElement element = getElement(locator,timeout);
        return element.getText();
    }

    /**
     * 清除输入框内容，然后输入，自带超时时间
     * @param locator 定位器
     * @param text 输入的文本
     * @param name 控件名称
     * (1/2)
     */
    public void sendKeys(By locator, String text, String name){
        sendKeys(locator,text,timeout,name);
    }

    /**
     * 清除输入框内容，然后输入，可以指定超时时间
     * @param locator 定位器
     * @param text 输入的文本
     * @param timeout 超时时间
     * @param name 控件名称
     * (2/2)
     */
    private void sendKeys(By locator, String text, float timeout, String name) {
        // TODO Auto-generated method stub
        WebElement we = getElement(locator, timeout);
        try{
            we.clear();
        } catch (Exception e) {
            LogRecorder.Error("<" + name + ">" + locator + "无法清空");
        }
        try {
            we.sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
            LogRecorder.Error("<" + name + ">" + locator + "无法输入");
        }

        LogRecorder.Info("在" + "<" + name + ">" +  "输入" + "<" + text + ">"  + "成功");

    }

    /**
     * 点击页面元素，自带默认点击前获取元素的超时时间
     * @param locator 定位器
     * @param name 控件名称
     * (1/2)
     */
    public void click (By locator, String name){
        click(locator, timeout, name);
    }

    /**
     * 点击页面元素，可以指定点击前获取元素的超时时间
     * @param locator 定位器
     * @param timeout 超时时间
     * @param name 控件名称
     * (2/2)
     */
    private void click(By locator, float timeout, String name) {
        // TODO Auto-generated method stub
        getElement(locator, timeout).click();
        LogRecorder.Info("点击" + "<" + name + ">" + "成功");
    }

    /**
     * 选择某个选项,使用默认超时时间
     * @param locator 定位器
     * @param option 选项
     * (1/2)
     */
    public void select(By locator,String option) {
        select(locator,option,timeout);
    }

    /**
     * 选择某个选项,可以指定超时时间
     * @param locator 定位器
     * @param option 选项内容
     * @param timeout 超时时间
     * (2/2)
     */
    private void select(By locator, String option, float timeout) {
        // TODO Auto-generated method stub
        WebElement element = getElement(locator, timeout);
        Select select = new Select(element);
        select.selectByValue(option);
    }

    /**
     * 检查chkbox是否勾选
     * @param locator 定位器
     * @return
     */
    public boolean checkChkBoxStatus(By locator) {
        //label[@class='ivu-checkbox-wrapper ivu-checkbox-wrapper-checked']/span/input
        //此处根据不同的checkbox设置
        return false;
    }

    /**
     * 切换页面,无父页面
     * @param currentWindow 当前窗口
     * @return
     * (1/2)
     */
    public WebDriver switchToWindow(String currentWindow) {
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        while (it.hasNext()) {
            if (currentWindow == it.next()) {
                continue;
            }
            WebDriver window = driver.switchTo().window(it.next());
            return window;
        }
        LogRecorder.Info("没有弹出窗口");
        return driver;
    }

    /**
     * 切换页面，有父页面
     * @param parantWindow 父页面
     * @param currentWindow 当前页面
     * @return
     * (2/2)
     */
    public WebDriver switchToWindow(String parantWindow, String currentWindow) {
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        while (it.hasNext()) {
            if (currentWindow == it.next()) {
                continue;
            }
            if (parantWindow == it.next()) {
                continue;
            }
            WebDriver window = driver.switchTo().window(it.next());
            return window;
        }
        LogRecorder.Info("没有弹出窗口");
        return driver;
    }

    /**
     * 检测是否有弹出框,使用默认超时时间
     * @return
     * (1/2)
     */
    public boolean alertExists(){
        return alertExists(timeout);
    }

    /**
     * 检测是否有弹出框,可以指定超时时间
     * @param timeout
     * @return
     * (2/2)
     */
    private boolean alertExists(float timeout) {
        // TODO Auto-generated method stub
        long start = System.currentTimeMillis();
        while ((System.currentTimeMillis() -start) < timeout * 1000) {
            try {
                driver.switchTo().alert();
                return true;
            } catch (NoAlertPresentException ne) {
                LogRecorder.Info("没有检测到弹出框");
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return false;
    }

    /**
     * 获取弹出框,使用全局超时时间
     * @return
     * (1/2)
     */
    public Alert getAlert() {
        return getAlert(timeout);
    }

    /**
     * 获取弹出框,可以指定超时时间
     * @param timeout
     * @return
     * (2/2)
     */
    private Alert getAlert(float timeout) {
        // TODO Auto-generated method stub
        long start = System.currentTimeMillis();
        while ((System.currentTimeMillis() -start) < timeout * 1000) {
            try {
                Alert alert = driver.switchTo().alert();
                return alert;
            } catch (NoAlertPresentException ne) {
                LogRecorder.Info("没有检测到弹出框");
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return null;
    }

    /**
     * 点击弹出框内确认按钮,使用默认超时时间
     * @return
     * (1/2)
     */
    public boolean acceptAlert(){
        return acceptAlert(timeout);
    }

    /**
     * 点击弹出框内确认按钮,可以指定超时时间
     * @param timeout
     * @return
     * (2/2)
     */
    private boolean acceptAlert(float timeout) {
        // TODO Auto-generated method stub
        Alert alert = getAlert(timeout);
        if (alert == null) {
            return false;
        } else {
            alert.accept();
            return true;
        }
    }

    /**
     * 点击弹出框内的取消按钮,使用默认超时时间
     * @return
     * (1/2)
     */
    public boolean cancelAlert(){
        return cancelAlert(timeout);
    }

    /**
     * 点击弹出框内的取消按钮,可以指定超时时间
     * @param timeout
     * @return
     * (2/2)
     */
    private boolean cancelAlert(float timeout) {
        // TODO Auto-generated method stub
        Alert alert = getAlert(timeout);
        if (alert == null) {
            return false;
        } else {
            alert.dismiss();
            return true;
        }
    }

    /**
     * 移动到页面元素，自带默认移动前获取元素的超时时间
     * @param locator 定位器
     * @param name 控件名称
     * (1/2)
     */
    public void moveTo (By locator, String name){
        moveTo(locator, timeout, name);
    }

    /**
     * 移动到页面元素，可以指定移动前获取元素的超时时间
     * @param locator 定位器
     * @param timeout 超时时间
     * @param name 控件名称
     * (2/2)
     */
    private void moveTo(By locator, float timeout, String name) {
        // TODO Auto-generated method stub
        actions.moveToElement(getElement(locator, timeout)).perform();
        LogRecorder.Info("移动到" + "<" + name + ">" + "成功");
    }


/**
     * 获取的内容,使用默认超时时间
     * @param locator 定位器
     * @param name 控件名称
     * (1/2)
     */
    public void getText(By locator,String name) {
        getText(locator,timeout,name);
    }

    /**
     * 获取控件文本信息,可以指定超时时间
     * @param locator 定位器
     * @param timeout 超时时间
     * @param name 控件名称
     * (2/2)
     */
    private void getText(By locator, float timeout, String name) {
        // TODO Auto-generated method stub
        String Text = getElement(locator,timeout).getText();
        LogRecorder.Info("获取" + "<" + name + ">" + "的内容为" + "<" + Text + ">");
    }



    /**
     * 获取多个控件文本信息,并拼接输入到log
     * @param locator 定位器
     * @param name 控件名称
     * (2/2)
     */
    public void getTextComplex(String name, By... locator){
        String text = "";
        for (By by : locator) {
            // String text = getElement(locator[j]).getText();
            // LogRecorder.Info(name + text);
            text += getElement(by).getText();
        }
        LogRecorder.Info("获取" + "<" + name + ">" + "的内容为" + "<" + text + ">");
    
    }

}