package com.design.patterns.strategy;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月28日<br>
 */
public abstract class AbstractCalculator {

	public int[] split(String exp, String opt) {
		String[] array = exp.split(opt);
		int[] arrayInt = new int[2];
		arrayInt[0] = Integer.parseInt(array[0].trim());
		arrayInt[1] = Integer.parseInt(array[1].trim());

		return arrayInt;
	}
}
