//Projeto PetShop

package com.marcos.petshop.resurces.exceptions;

import java.io.Serializable;

public class StandartError implements Serializable {


	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	
	public StandartError() {
		
		
	}

	public StandartError(Integer status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
