package com.design.patterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月20日<br>
 */
public class Prototype implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	String string;  
    SerializableObject obj;  
    
	/**
	 * @param string
	 * @param obj
	 */
	public Prototype(String string, SerializableObject obj) {
		super();
		this.string = string;
		this.obj = obj;
	}

	/**
	 * 浅复制
	 */
	public Object clone() throws CloneNotSupportedException {
		Prototype pro = (Prototype)super.clone();
		return pro;
	}

	/**
	 * 深复制
	 * 要实现深复制，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象
	 * @author yangchao
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
	
	class SerializableObject implements Serializable {  
	    private static final long serialVersionUID = 1L;  
	}

	
	public String getString() {
		return string;
	}

	
	public void setString(String string) {
		this.string = string;
	}

	
	public SerializableObject getObj() {
		return obj;
	}

	
	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}  
}
