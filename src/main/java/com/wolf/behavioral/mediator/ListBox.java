package com.wolf.behavioral.mediator;

/**
 * <b>εθ½</b>
 *
 * @author ζθΆ
 * @Date 2016/7/14
 */
public class ListBox extends AbstractWidget {

	public ListBox(DialogDirector dialogDirector) {
		super(dialogDirector);
	}

	public String getSelection() {
		return "getSelection";
	}

	public void setSelection(String selection) {
		System.out.println("setSelection"+selection);
	}
}
