package com.design.patterns.facade;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月27日<br>
 */
public class FacadeTest {

	/**
	 * @author yangchao
	 * @param args
	 */
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}

}
