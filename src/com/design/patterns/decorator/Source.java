package com.design.patterns.decorator;


/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月27日<br>
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");  
	}

}
