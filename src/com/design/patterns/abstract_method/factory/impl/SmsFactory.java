package com.design.patterns.abstract_method.factory.impl;

import com.design.patterns.abstract_method.factory.Provider;
import com.design.patterns.abstract_method.service.Sender;
import com.design.patterns.abstract_method.service.impl.SmsSender;


/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月19日<br>
 */
public class SmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
