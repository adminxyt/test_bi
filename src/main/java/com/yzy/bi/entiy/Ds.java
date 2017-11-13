package com.yzy.bi.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_bi_ds")
@Entity
public class Ds {
	private long id;
	private String type;
	private String value1;
	private String value2;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public Ds(long id, String type, String value1, String value2) {
		super();
		this.id = id;
		this.type = type;
		this.value1 = value1;
		this.value2 = value2;
	}

	public Ds() {
		super();
	}

}
