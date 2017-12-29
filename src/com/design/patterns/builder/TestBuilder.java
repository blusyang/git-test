package com.design.patterns.builder;

import java.util.List;

import com.design.patterns.builder.builder.Builder;
import com.design.patterns.builder.service.Sender;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月20日<br>
 */
public class TestBuilder {

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
		List<Sender> list1 = builder.getList();
		for (Sender s : list1) {
			s.send();
		}

		builder.produceSmsSender(10);
		List<Sender> list2 = builder.getList();
		for (Sender s : list2) {
			s.send();
		}
	}
}
