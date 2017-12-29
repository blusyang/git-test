package com.design.patterns.abstract_method;

import com.design.patterns.abstract_method.factory.Provider;
import com.design.patterns.abstract_method.factory.impl.MailFactory;
import com.design.patterns.abstract_method.factory.impl.SmsFactory;
import com.design.patterns.abstract_method.service.Sender;


/**
 * 功能说明: 抽象工厂模式（Abstract Factory）用到抽象工厂模式，创建多个工厂类，
 * 这样一旦需要增加新的功能，直接增加新的工厂类就可以了，
 * 不需要修改之前的代码<br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月19日<br>
 */
public class AbstactFactoryTest {

	/**
	 * @author yangchao
	 * @param args
	 */
	public static void main(String[] args) {
		Provider smsFactory = new SmsFactory();
		Sender sender11 = smsFactory.produce();
		sender11.send();
		
		Provider mailFactory = new MailFactory();
		Sender sender12 = mailFactory.produce();
		sender12.send();
	}

}
