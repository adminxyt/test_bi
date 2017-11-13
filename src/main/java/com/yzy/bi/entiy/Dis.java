package com.yzy.bi.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_bi_dis")
@Entity
public class Dis {
	private long id;
	private String type;
	private String value;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Dis(long id, String type, String value) {
		super();
		this.id = id;
		this.type = type;
		this.value = value;
	}

	public Dis() {
	}

}
