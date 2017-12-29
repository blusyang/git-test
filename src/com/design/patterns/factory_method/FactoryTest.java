package com.design.patterns.factory_method;

import com.design.patterns.factory_method.exception.ServiceException;
import com.design.patterns.factory_method.factory.MutilSendFactory;
import com.design.patterns.factory_method.factory.SendFactory;
import com.design.patterns.factory_method.factory.StaticFactory;
import com.design.patterns.factory_method.iface.Sender;


/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月19日<br>
 */
public class FactoryTest {

	/**
	 * @author yangchao
	 * @param args
	 */
	public static void main(String[] args) {
		SendFactory sFactory = new SendFactory();
		try {
			Sender sender11 = sFactory.produce("mailSender");
			sender11.send();
			
			Sender sender12 = sFactory.produce("smsSender");
			sender12.send();
		} catch (ServiceException e) {
			System.out.println("错误："+e.getError_code()+e.getError_msg());
			e.printStackTrace();
		}
		
		/**
		 * 多个工厂方法模式
		 */
		MutilSendFactory msFactory = new MutilSendFactory();
		Sender sender21 =  msFactory.produceMail();
		sender21.send();
		Sender sender22 =  msFactory.produceSms();
		sender22.send();
		
		/**
		 * 静态工厂方法
		 */
		Sender sender31 =  StaticFactory.produceMail();
		sender31.send();
		Sender sender32 =  StaticFactory.produceSms();
		sender32.send();
	}

}
