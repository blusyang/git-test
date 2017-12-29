package com.design.patterns.adapter;

/**
 * 功能说明: 不继承Source类，而是持有Source类的实例<br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月26日<br>
 */
public class Wrapper implements Targetable {

	Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("This is targetable method!");
	}

}
