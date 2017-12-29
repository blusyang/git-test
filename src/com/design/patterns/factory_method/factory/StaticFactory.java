package com.design.patterns.factory_method.factory;

import com.design.patterns.factory_method.iface.Sender;
import com.design.patterns.factory_method.impl.MailSender;
import com.design.patterns.factory_method.impl.SmsSender;


/**
 * 功能说明: 静态工厂模式<br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月19日<br>
 */
public class StaticFactory {
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}
}
