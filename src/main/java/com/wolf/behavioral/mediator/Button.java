package com.wolf.behavioral.mediator;

/**
 * <b>εθ½</b>
 *
 * @author ζθΆ
 * @Date 2016/7/14
 */
public class Button extends AbstractWidget {


	public Button(DialogDirector dialogDirector) {
		super(dialogDirector);
	}

	public void grayTheColor(){
		System.out.println("make color gray");
	}
}
