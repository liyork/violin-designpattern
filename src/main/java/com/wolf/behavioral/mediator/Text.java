package com.wolf.behavioral.mediator;

/**
 * <b>εθ½</b>
 *
 * @author ζθΆ
 * @Date 2016/7/14
 */
public class Text extends AbstractWidget {

	private String text;

	public Text(DialogDirector dialogDirector) {
		super(dialogDirector);
	}

	public void setText(String text) {
		this.text = text;
		System.out.println("set text...");
	}

	public String getText() {
		return text;
	}
}
