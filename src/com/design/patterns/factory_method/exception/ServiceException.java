package com.design.patterns.factory_method.exception;


/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月19日<br>
 */
public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private String error_code;
	private String error_msg;
	
	public ServiceException(String error_code,String error_msg){
		this.error_code = error_code;
		this.error_msg = error_msg;
	}
	
	public ServiceException(String error_msg){
		this.error_msg = error_msg;
	}

	
	public String getError_code() {
		return error_code;
	}

	
	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	
	public String getError_msg() {
		return error_msg;
	}

	
	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}
	
}
