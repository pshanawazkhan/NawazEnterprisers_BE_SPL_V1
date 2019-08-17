package com.nawaz.splinkers.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nawaz.splinkers.entityObjects.Splinkers;

@JsonFormat
public class SplinkerError extends Splinkers{
	
	
	String msg;
	
	boolean status;
	
	public SplinkerError() {
	
	}

	public SplinkerError(String msg, boolean status) {
		super(msg,status);
		this.msg = msg;
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
