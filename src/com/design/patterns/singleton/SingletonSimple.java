package com.design.patterns.singleton;


/**
 * 功能说明: 最简单的单例模式
 * 			可以满足基本要求，但是，像这样毫无线程安全保护的类，
 * 			如果我们把它放入多线程的环境下，肯定就会出现问题了<br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月19日<br>
 */
public class SingletonSimple {
	
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */ 
	private static SingletonSimple instance = null;
	
	/* 私有构造方法，防止被实例化 */  
	private SingletonSimple(){
		
	}
	
	 /* 静态工程方法，创建实例 */  
	public static SingletonSimple getInstance(){
		if(instance == null){
			instance = new SingletonSimple();
		}
		
		return instance;
	}
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve(){
		return instance;
	}
}
