package com.design.patterns.observer;

import java.util.Enumeration;
import java.util.Vector;


/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月29日<br>
 */
public abstract class AbstractSubject implements Subject{

	private Vector<Observer> vectors = new Vector<Observer>();
	
	@Override
	public void add(Observer observer) {
		vectors.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vectors.remove(observer);
	}

	@Override
	public void nofityObservers() {
		Enumeration<Observer> elements = vectors.elements();
		while(elements.hasMoreElements()){
			elements.nextElement().receive();
		}
	}
}
