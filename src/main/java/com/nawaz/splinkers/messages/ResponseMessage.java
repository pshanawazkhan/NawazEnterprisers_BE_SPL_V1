package com.nawaz.splinkers.messages;



public class ResponseMessage  {


	private String type;
	
	private String message;
	
	private String msgStatus;
	
	private boolean status;
	
	

	public ResponseMessage(String type, String message, String msgStatus, boolean status) {
	
		this.type = type;
		this.message = message;
		this.msgStatus = msgStatus;
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMsgStatus() {
		return msgStatus;
	}

	public void setMsgStatus(String msgStatus) {
		this.msgStatus = msgStatus;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
}
