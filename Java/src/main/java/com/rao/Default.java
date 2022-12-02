package com.rao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.tool.BasePage;
import com.rao.tool.LogRecorder;
import com.rao.tool.WebDriverTool;

//首页
public class Default {
    public void pageRun() throws Exception {
        WebDriver webdriver = WebDriverTool.webdriver;
        BasePage basePage = new BasePage();

        LogRecorder.Info("进入首页");

        //店铺logo
        basePage.click(By.id("imgLogo"), "店铺logo");
        webdriver.navigate().back();


        /**
         * 
         * 查看交易概况
         * 
         * */        
        basePage.getText(By.xpath("(//span[@id='Today'])[1]"), "今日销售金额");
        basePage.getText(By.xpath("(//span[@id='TodayOrdersCount'])[1]"), "今日支付订单");
        basePage.getText(By.xpath("(//span[@id='TodayMemberCount'])[1]"), "今日新增会员");
        basePage.getText(By.xpath("(//span[@id='lblOrderCount'])[1]"), "订单总数");
        basePage.getText(By.xpath("(//span[@id='MemberCount'])[1]"), "会员总数");


        /**
         * 
         * 点击待办事项
         * 
         * */
        //待办事项-待发货
        basePage.click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='待发货'])[1]/preceding::span[1]"), "待发货");
        webdriver.navigate().back();

        //待办事项-待自提
        basePage.click(By.xpath("(//span[@id='lblPendignSelfLiftingCount'])[1]"), "待自提");
        webdriver.navigate().back();

        //待办事项-待审核退款
        basePage.click(By.xpath("(//span[@id='lblPendRefundCount'])[1]"), "待审核退款");
        webdriver.navigate().back();


        /**
         * 
         * 查看门店销售排行榜
         * 
         * */
        //往下滚动页面到门店销售排行榜
       basePage.moveTo(By.cssSelector("div[class='flex function_ent']"), "门店销售排行榜");

        //门店销售排行榜
        //查看昨天No.1的门店
        basePage.getTextComplex("昨天No.1的门店和销售额",By.cssSelector("li:nth-child(1) div:nth-child(2)"),By.xpath("(//div)[42]"));

        //查看前天
        basePage.click(By.xpath("(//input[@id='Button2'])[1]"), "门店前天销售额");
        Thread.sleep(1000);
        basePage.getTextComplex("前天No.1的门店和销售额",By.cssSelector("li:nth-child(1) div:nth-child(2)"),By.xpath("(//div)[42]"));

        //查看近7天
        basePage.click(By.xpath("(//input[@id='Button3'])[1]"), "门店近7天销售额");
        Thread.sleep(1000);
        basePage.getTextComplex("门店近7天销售额",By.cssSelector("li:nth-child(1) div:nth-child(2)"),By.xpath("(//div)[42]"));
        
        //查看近30天
        basePage.click(By.xpath("(//input[@id='Button4'])[1]"), "门店近30天销售额");
        Thread.sleep(1000);
        basePage.getTextComplex("门店近30天销售额",By.cssSelector("li:nth-child(1) div:nth-child(2)"),By.xpath("(//div)[42]"));

        
        /**
         * 
         * 查看访问人数和转化率
         * 
         ***/
        basePage.getTextComplex("昨天的数据", By.xpath("(//label[contains(text(),'访问人数：')])[1]"),By.xpath("(//label[contains(text(),'下单人数：')])[1]"),By.xpath("(//label[contains(text(),'支付人数：')])[1]"));
        basePage.getTextComplex("昨天的访问-支付转化率", By.xpath("//div[@class='chart chart1']//em[1]"));
        basePage.getTextComplex("昨天的访问-下单转化率", By.xpath("//div[@class='chart chart2']//em[1]"));
        basePage.getTextComplex("昨天的下单-支付转化率", By.xpath("//div[@class='chart chart3']//em[1]"));

        basePage.click(By.xpath("(//input[@id='Button2'])[2]"), "前天的转化率");
        Thread.sleep(1000);
        basePage.getTextComplex("前天的数据", By.xpath("(//label[contains(text(),'访问人数：')])[1]"),By.xpath("(//label[contains(text(),'下单人数：')])[1]"),By.xpath("(//label[contains(text(),'支付人数：')])[1]"));
        basePage.getTextComplex("前天的访问-支付转化率", By.xpath("//div[@class='chart chart1']//em[1]"));
        basePage.getTextComplex("前天的访问-下单转化率", By.xpath("//div[@class='chart chart2']//em[1]"));
        basePage.getTextComplex("前天的下单-支付转化率", By.xpath("//div[@class='chart chart3']//em[1]"));

        basePage.click(By.xpath("(//input[@id='Button3'])[2]"), "近7天的转化率");
        Thread.sleep(1000);
        basePage.getTextComplex("近7天的数据", By.xpath("(//label[contains(text(),'访问人数：')])[1]"),By.xpath("(//label[contains(text(),'下单人数：')])[1]"),By.xpath("(//label[contains(text(),'支付人数：')])[1]"));
        basePage.getTextComplex("近7天的访问-支付转化率", By.xpath("//div[@class='chart chart1']//em[1]"));
        basePage.getTextComplex("近7天的访问-下单转化率", By.xpath("//div[@class='chart chart2']//em[1]"));
        basePage.getTextComplex("近7天的下单-支付转化率", By.xpath("//div[@class='chart chart3']//em[1]"));

        basePage.click(By.xpath("(//input[@id='Button4'])[2]"), "近30天的转化率");
        Thread.sleep(1000);
        basePage.getTextComplex("近30天的数据", By.xpath("(//label[contains(text(),'访问人数：')])[1]"),By.xpath("(//label[contains(text(),'下单人数：')])[1]"),By.xpath("(//label[contains(text(),'支付人数：')])[1]"));
        basePage.getTextComplex("近30天的访问-支付转化率", By.xpath("//div[@class='chart chart1']//em[1]"));
        basePage.getTextComplex("近30天的访问-下单转化率", By.xpath("//div[@class='chart chart2']//em[1]"));
        basePage.getTextComplex("近30天的下单-支付转化率", By.xpath("//div[@class='chart chart3']//em[1]"));

    }
}
