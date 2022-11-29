package com.rao.tool;

import java.io.*;
import java.util.Properties;

public class ParseProperties {
    private Properties pro = new Properties();

    /**
     *属性文件地址,用于读写
     */
    private static String propath = System.getProperty("user.dir") + "/conf/prop.properties";
    String value = null;

    /**
     * 不指定属性文件时候,使用默认的属性文件
     * (1/2)
     */
    public ParseProperties(){
        this.loadProperties(propath);
    }

    /**
     * 指定属性文件的地址的时候,使用指定的属性文件地址
     * @param propertiespath
     */
    public ParseProperties(String propertiespath) {
        this.loadProperties(propertiespath);
    }

    /**
     * 加载属性文件,使用默认属性文件地址
     * (1/2)
     */
    private void loadProperties(){
        loadProperties(propath);
    }

    /**
     * 加载属性文件,可以指定属性文件地址
     * @param propertiespath
     * (2/2)
     */
    private void loadProperties(String propertiespath) {
        try {
            InputStream in = new FileInputStream(propertiespath);
            pro.load(in);
        } catch (FileNotFoundException fe) {
            System.out.println("属性文件不存在");
            fe.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据属性文件的keyname获取value
     * @param keyname
     * @return
     */
    public String getValue(String keyname) {
        value = pro.getProperty(keyname).trim();
        try {
            value = new String(value.getBytes("UTF-8"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return value;
    }

    /**
     * 写入属性文件,使用默认属性文件路径
     * @param keyname
     * @param keyvalue
     * (1/2)
     */
    public void setProperty(String keyname, String keyvalue){
        setProperty(keyname,keyvalue,propath);
    }

    /**
     * 写入属性文件,必须指定属性文件路径,如果该文件不存在则自动创建
     * @param keyname
     * @param keyvalue
     * @param proppath
     * (2/2)
     */
    public static void setProperty(String keyname, String keyvalue, String proppath) {
        try {
            Properties prop = new Properties();
            File file =new File(proppath);
            if (file.exists()) {
                FileInputStream in = new FileInputStream(proppath);
                prop.load(in);
                OutputStream out = new FileOutputStream(proppath);
                prop.setProperty(keyname,keyvalue);
                prop.store(out,"Update '" + keyname + "' value");
                in.close();
                out.close();
            } else {
                OutputStream out = new FileOutputStream(proppath);
                prop.setProperty(keyname, keyvalue);
                prop.store(out, "Update '" + keyname + "' value");
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        // ParseProperties test = new ParseProperties(System.getProperty("user.dir") + "/conf/prop.properties");
        // System.out.println(test.getValue("BaseUrl"));
        setProperty("name","woood","d:\\test.properties");
    }
}

