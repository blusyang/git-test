package com.design.patterns.composite;

import java.util.Vector;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月27日<br>
 */
public class TreeNodeTest {
	public static void main(String[] args) {
		TreeNode nodeA = new TreeNode("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		nodeB.addChild(nodeC);
		nodeC.setParentNode(nodeB);
		nodeA.addChild(nodeB);
		nodeB.setParentNode(nodeA);

		Vector<TreeNode> nodes = nodeA.getChildNodes();
		for (TreeNode node : nodes) {
			System.out.println(node.getParentNode().getName()+"->"+node.getName());
			Vector<TreeNode> nodes1 = node.getChildNodes();
			for (TreeNode node1 : nodes1) {
				System.out.println(node1.getParentNode().getName()+"->"+node1.getName());
			}
		}
	}

}
