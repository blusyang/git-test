package com.design.patterns.mediator;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月29日<br>
 */
public abstract class User {

	private Mediator mediator;

	public User(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public abstract void work();
}
