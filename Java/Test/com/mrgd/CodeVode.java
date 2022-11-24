package com.mrgd;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class CodeVode {

		
	
				//截取整个屏幕，并保存到相应的文件夹
				//type： 表示截图的文件类型，可以填写png，jpg等
				//path： 表示文件保存路径，需要给路径加上后缀

				public void robotSnapshot(String type,String path) {
					try{
						BufferedImage img = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));  
				        ImageIO.write(img, type, new File(path));
					}catch(Exception e){
						e.printStackTrace();
						System.out.println("Snapshot has problem");
					}
				}

				
				
				//裁剪屏幕图片
				/*  
		  			x1 ： 选择区域左上角的x坐标
					y1 ： 选择区域左上角的y坐标
					width ： 选择区域的宽度
					height ： 选择区域的高度
					sourcePath ： 源图片路径
					descpath ： 裁切后图片的保存路径
				 */
				public void cut(int x1, int y1, int width, int height,String sourcePath, String descpath) {
			 
					FileInputStream is = null;
					ImageInputStream iis = null;
					
					try {
						is = new FileInputStream(sourcePath);
						String fileSuffix = sourcePath.substring(sourcePath
								.lastIndexOf(".") + 1);
						Iterator<ImageReader> it = ImageIO
								.getImageReadersByFormatName(fileSuffix);
						ImageReader reader = it.next();
						iis = ImageIO.createImageInputStream(is);
						reader.setInput(iis, true);
						ImageReadParam param = reader.getDefaultReadParam();
						Rectangle rect = new Rectangle(x1, y1, width, height);
						param.setSourceRegion(rect);
						BufferedImage bi = reader.read(0, param);
						ImageIO.write(bi, fileSuffix, new File(descpath));
					} catch (Exception ex) {
						ex.printStackTrace();
					} finally {
						if (is != null) {
							try {
								is.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
							is = null;
						}
						if (iis != null) {
							try {
								iis.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
							iis = null;
						}
					}
				}
}
