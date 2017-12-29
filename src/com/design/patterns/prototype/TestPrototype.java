package com.design.patterns.prototype;

import java.io.IOException;


/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月20日<br>
 */
public class TestPrototype {

	/**
	 * @author yangchao
	 * @param args
	 * @throws CloneNotSupportedException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Prototype prototype = new Prototype("hello",null);
		Prototype prototype2 = (Prototype)prototype.clone();
		prototype2.string = "modify1";
		System.out.println(prototype.getString());
		
		Prototype prototype3 = (Prototype)prototype.deepClone();
		prototype3.string = "modify2";
		System.out.println(prototype.getString());
	}

}
