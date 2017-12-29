package com.design.patterns.builder.service.impl;

import com.design.patterns.builder.service.Sender;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月19日<br>
 */
public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is SmsSender!");
	}

}
