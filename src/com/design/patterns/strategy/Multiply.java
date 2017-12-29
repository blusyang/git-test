package com.design.patterns.strategy;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月28日<br>
 */
public class Multiply extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int[] arrayInt = split(exp, "\\*");
		return arrayInt[0] * arrayInt[1];
	}

}
