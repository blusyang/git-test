package com.design.patterns.proxy;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月27日<br>
 */
public class Proxy implements Sourceable {

	private Source source;

	public Proxy() {
		super();
		source = new Source();
	}

	@Override
	public void method() {
		System.out.println("before proxy");
		source.method();
		System.out.println("after proxy");
	}

}
