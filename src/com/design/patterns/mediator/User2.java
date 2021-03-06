package com.design.patterns.mediator;


/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月29日<br>
 */
public class User2 extends User {

	/**
	 * @param mediator
	 */
	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("User2 exe");
	}

}
