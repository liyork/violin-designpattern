package com.wolf.structural.composite;

/**
 * <b>εθ½</b>
 *
 * @author ζθΆ
 * @Date 2016/6/19
 */
public abstract class AbstractComponent implements Component {

	protected String name;
	protected Component component;

	@Override
	public void setParent(Component component) {
		this.component = component;
	}
}
