package com.wolf.behavioral.strategy;

/**
 * <b>εθ½</b>
 *
 * @author ζθΆ
 * @Date 2016/7/17
 */
public class FootWay implements TripMode {
	@Override
	public void toWork(People people) {
		System.out.println(people.getPrefix()+" by foot ");
	}
}
