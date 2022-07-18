package com.demoresttremplates.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
@Table(name ="Toys")
public class Toys {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer toysId;
	@Column(length = 25, unique = true)
	private String toysName;
	private double toysPrice;
	public Integer getToysId() {
		return toysId;
	}
	public void setToysId(Integer toysId) {
		this.toysId = toysId;
	}
	public String getToysName() {
		return toysName;
	}
	public void setToysName(String toysName) {
		this.toysName = toysName;
	}
	public double getToysPrice() {
		return toysPrice;
	}
	public void setToysPrice(double toysPrice) {
		this.toysPrice = toysPrice;
	}
	
	
	
	
	
}
