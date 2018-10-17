package com.verizon.sdr.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="states")
public class State {
	@Id	
	private Long stateCode;
	private String stateName;
	private String Capital;
	public Long getStateCode() {
		return stateCode;
	}
	public void setStateCode(Long stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCapital() {
		return Capital;
	}
	public void setCapital(String capital) {
		Capital = capital;
	}
	
	
	
}
