package com.design.patterns.builder.builder;

import java.util.ArrayList;
import java.util.List;

import com.design.patterns.builder.service.Sender;
import com.design.patterns.builder.service.impl.MailSender;
import com.design.patterns.builder.service.impl.SmsSender;

/**
 * 功能说明: 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品
 * 集中起来进行管理，用来创建复合对象，
 * 所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式
 * 和最后的Test结合起来得到的<br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月20日<br>
 */
public class Builder {

	private List<Sender> list = new ArrayList<>();

	public List<Sender> getList() {
		return list;
	}

	public void setList(List<Sender> list) {
		this.list = list;
	}

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}
