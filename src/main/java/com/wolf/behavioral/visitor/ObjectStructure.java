package com.wolf.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>εθ½</b>Often the object structure is responsible for iteration
 *
 * @author ζθΆ
 * @Date 2016/7/2
 */
public class ObjectStructure {

	private List<Node> list = new ArrayList<Node>();

	public void traversalVisit(NodeVisitor visitor) {
		for (Node node : list) {
			System.out.println(node.operation()+" do sth using " + visitor.getName()+"...in ObjectStructure");
			node.accept(visitor);
		}
	}

	public void add(Node element) {
		list.add(element);
	}
}
