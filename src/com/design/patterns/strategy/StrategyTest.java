package com.design.patterns.strategy;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月28日<br>
 */
public class StrategyTest {

	/**
	 * @author yangchao
	 * @param args
	 */
	public static void main(String[] args) {
		String exp = "2 + 8";
		ICalculator cal = new Plus();
		System.out.println(cal.calculate(exp));
		
		String exp1 = "8-2";
		ICalculator cal1 = new Minus();
		System.out.println(cal1.calculate(exp1));
		
		String exp2 = "8*2";
		ICalculator cal2 = new Multiply();
		System.out.println(cal2.calculate(exp2));
	}

}
