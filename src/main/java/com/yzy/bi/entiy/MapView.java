package com.yzy.bi.entiy;

import java.util.List;

public class MapView {

	private String ss;

	private List<Sk> list;

	public String getSs() {
		return ss;
	}

	public void setSs(String ss) {
		this.ss = ss;
	}

	public List<Sk> getList() {
		return list;
	}

	public void setList(List<Sk> list) {
		this.list = list;
	}

	public MapView(String ss, List<Sk> list) {
		super();
		this.ss = ss;
		this.list = list;
	}

	public MapView() {
		super();
	}

	public MapView(String ss) {
		super();
		this.ss = ss;
	}

}
