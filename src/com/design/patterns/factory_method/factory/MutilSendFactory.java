package com.design.patterns.factory_method.factory;

import com.design.patterns.factory_method.iface.Sender;
import com.design.patterns.factory_method.impl.MailSender;
import com.design.patterns.factory_method.impl.SmsSender;


/**
 * 功能说明: 
 * 		多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，
 * 		如果传递的字符串出错，则不能正确创建对象，
 * 		而多个工厂方法模式是提供多个工厂方法，
 * 		分别创建对象<br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月19日<br>
 */
public class MutilSendFactory {

	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
}
