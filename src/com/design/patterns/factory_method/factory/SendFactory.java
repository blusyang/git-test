package com.design.patterns.factory_method.factory;

import com.design.patterns.factory_method.exception.ServiceException;
import com.design.patterns.factory_method.iface.Sender;
import com.design.patterns.factory_method.impl.MailSender;
import com.design.patterns.factory_method.impl.SmsSender;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月19日<br>
 */
public class SendFactory {

	/**
	 * 工厂方法
	 * @author yangchao
	 * @param name
	 * @return
	 * @throws ServiceException
	 */
	public Sender produce(String name) throws ServiceException {
		if ("mailSender".equals(name)) {
			return new MailSender();
		} else if ("smsSender".equals(name)) {
			return new SmsSender();
		} else {
			throw new ServiceException("0001","无法实例化...");
		}
	}
}
