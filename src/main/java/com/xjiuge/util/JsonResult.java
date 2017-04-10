package com.xjiuge.util;

import java.io.Serializable;

@SuppressWarnings("serial")
public class JsonResult<T> implements Serializable{

	private Integer code;
	private String msg;
	private T body;
	
	public JsonResult(String msg){
		this.code = 200;
		this.msg = msg;
	}
	public JsonResult(int code,String msg){
		this.code = code;
		this.msg = msg;
	}
	public JsonResult(int code,String msg,T body){
		this.code = code;
		this.msg = msg;
		this.body = body;
	}
	
	public static JsonResult success(){
		return new JsonResult(200,"操作成功");
	}
	public static JsonResult success(String msg){
		return new JsonResult(200,msg);
	}
	public static JsonResult success(Object t){
		return new JsonResult(200,"操作成功",t);
	}
	public static JsonResult error(){
		return new JsonResult(500,"操作失败");
	}
	public static JsonResult error(String msg){
		return new JsonResult(500,msg);
	}
	
	
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
	
}
