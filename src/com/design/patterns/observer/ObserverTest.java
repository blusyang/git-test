package com.design.patterns.observer;


/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月29日<br>
 */
public class ObserverTest {

	/**
	 * @author yangchao
	 * @param args
	 */
	public static void main(String[] args) {
		Subject subject = new MySubject();
		subject.add(new Observer1Impl());
		subject.add(new Observer2Impl());
		subject.operation();
	}

}
