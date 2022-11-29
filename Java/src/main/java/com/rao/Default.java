package com.rao;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rao.tool.WebDriverTool;

//首页
public class Default {
    public void pageRun() throws Exception {
        WebDriver webdriver = WebDriverTool.webdriver;
		Actions actions = new Actions(webdriver);

        new WebDriverWait(webdriver, Duration.ofSeconds(3));

        //待办事项-待发货
        webdriver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='待发货'])[1]/preceding::span[1]")).click();
        Thread.sleep(2000);
        //返回上一个页面
        webdriver.navigate().back();
        new WebDriverWait(webdriver, Duration.ofSeconds(2));


        //待办事项-待自提
        webdriver.findElement(By.xpath("(//span[@id='lblPendignSelfLiftingCount'])[1]")).click();
        Thread.sleep(2000);
        //返回上一个页面
        webdriver.navigate().back();
        new WebDriverWait(webdriver, Duration.ofSeconds(2));


        //待办事项-待审核退款
        webdriver.findElement(By.xpath("(//span[@id='lblPendRefundCount'])[1]")).click();
        Thread.sleep(2000);
        //返回上一个页面
        webdriver.navigate().back();
        new WebDriverWait(webdriver, Duration.ofSeconds(2));
        

        //往下滚动页面到门店销售排行榜
        Thread.sleep(1000);
        actions.moveToElement(webdriver.findElement(By.cssSelector("div[class='flex function_ent']"))).perform();

        //门店销售排行榜
        //查看前天
        Thread.sleep(2000);
        webdriver.findElement(By.xpath("(//input[@id='Button2'])[1]")).click();

  
    }
}
