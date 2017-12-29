package com.design.patterns.adapter;

/**
 * 功能说明: 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口Targetable，
 * 通过Adapter类，将Source的功能扩展到Targetable里,即继承Source实现Targetable<br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月26日<br>
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("This is targetable method!");
	}

}
