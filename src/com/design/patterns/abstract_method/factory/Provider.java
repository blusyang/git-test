package com.design.patterns.abstract_method.factory;

import com.design.patterns.abstract_method.service.Sender;


/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月19日<br>
 */
public interface Provider {
	
	public Sender produce();
}
