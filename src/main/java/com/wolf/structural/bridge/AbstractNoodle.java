package com.wolf.structural.bridge;

/**
 * <b>εθ½</b>
 *
 * @author ζθΆ
 * @Date 2016/6/19
 */
public abstract class AbstractNoodle implements Noodle{

	protected PepperStyle pepperStyle;

	public AbstractNoodle(PepperStyle pepperStyle) {
		this.pepperStyle = pepperStyle;
	}
}
