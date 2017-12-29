package com.design.patterns.adapter;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月26日<br>
 */
public class TestAdapter {

	/**
	 * @author yangchao
	 * @param args
	 */
	public static void main(String[] args) {
		Targetable targetable = new Adapter();
		targetable.method1();
		targetable.method2();

		Targetable targetable2 = new Wrapper(new Source());
		targetable2.method1();
		targetable2.method2();
	}

}
