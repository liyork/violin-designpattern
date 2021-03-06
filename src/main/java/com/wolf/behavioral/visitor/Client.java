package com.wolf.behavioral.visitor;

/**
 * <b>εθ½</b>
 *
 * @author ζθΆ
 * @Date 2016/7/2
 */
public class Client {

	public static void main(String[] args) {

		Node assignmentNode = new AssignmentNode();
		Node variableRefNode = new VariableRefNode();
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(assignmentNode);
		objectStructure.add(variableRefNode);

		objectStructure.traversalVisit(new TypeCheckingVisitor("typeCheckingVisitor"));

		objectStructure.traversalVisit(new CodeGeneratingVisitor("codeGeneratingVisitor"));
	}
}
