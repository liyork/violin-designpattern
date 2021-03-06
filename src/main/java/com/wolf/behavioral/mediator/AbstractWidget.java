package com.wolf.behavioral.mediator;

/**
 * <b>εθ½</b>
 *
 * @author ζθΆ
 * @Date 2016/7/14
 */
public class AbstractWidget implements Widget{

	private DialogDirector dialogDirector;

	public AbstractWidget(DialogDirector dialogDirector) {
		this.dialogDirector = dialogDirector;
	}

	@Override
	public void change() {
		dialogDirector.changeRelatedWidget(this);
	}
}
