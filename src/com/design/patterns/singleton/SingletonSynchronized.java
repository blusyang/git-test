package com.design.patterns.singleton;


/**
 * 功能说明: 使用synchronized关键字，可以解决线程安全问题，
 * 		在第一次创建对象的时候需要加锁，但是程序有可能发生错误<br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月19日<br>
 */
public class SingletonSynchronized {
	
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */ 
	private static SingletonSynchronized instance = null;
	
	/* 私有构造方法，防止被实例化 */  
	private SingletonSynchronized(){
		
	}
	
	 /* 静态工程方法，创建实例 */  
	public static SingletonSynchronized getInstance(){
		if(instance == null){
			synchronized (instance) {
				if(instance == null){
					instance = new SingletonSynchronized();
				}
			}
		}
		
		return instance;
	}
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve(){
		return instance;
	}
}
