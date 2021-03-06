package com.wolf.structural.proxy;

/**
 * <b>εθ½</b>
 *
 * @author ζθΆ
 * @Date 2016/7/10
 */
public class ImageFactory {

	public static Image createImage(String fileName){
		return new ImageCreateProxy(fileName);
	}

	public static Image copyImage(Image image){
		return new ImageCopyProxy(image);
	}
}
