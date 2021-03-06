package com.design.patterns.factory_method.impl;

import com.design.patterns.factory_method.iface.Sender;


/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月19日<br>
 */
public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is MailSender!");
	}

}
