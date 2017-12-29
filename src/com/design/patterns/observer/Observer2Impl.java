package com.design.patterns.observer;


/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月29日<br>
 */
public class Observer2Impl implements Observer {

	@Override
	public void receive() {
		System.out.println("Observer2 has received the message!");
	}

}
