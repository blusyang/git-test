package com.design.patterns.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月27日<br>
 */
public class TreeNode {

	private String name;
	private TreeNode parentNode;
	private Vector<TreeNode> childNodes = new Vector<TreeNode>();

	public TreeNode(String name) {
		this.name = name;
	}

	public void addChild(TreeNode treeNode) {
		childNodes.add(treeNode);
	}

	public void removeChild(TreeNode treeNode) {
		childNodes.remove(treeNode);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParentNode() {
		return parentNode;
	}

	public void setParentNode(TreeNode parentNode) {
		this.parentNode = parentNode;
	}

	public Vector<TreeNode> getChildNodes() {
		return childNodes;
	}

	public void setChildNodes(Vector<TreeNode> childNodes) {
		this.childNodes = childNodes;
	}
	
	public Enumeration<TreeNode> getChildren(){  
        return childNodes.elements();  
    }  
}
