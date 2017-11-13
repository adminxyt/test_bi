package com.yzy.bi.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_bi_map")
@Entity
public class Map {

	private long id;

	private String diqu;

	private String sheng;

	private String shi;

	private String shiyi;

	private String kezhongzhi;

	private String ss;

	public String getSs() {
		return ss;
	}

	public void setSs(String ss) {
		this.ss = ss;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDiqu() {
		return diqu;
	}

	public void setDiqu(String diqu) {
		this.diqu = diqu;
	}

	public String getSheng() {
		return sheng;
	}

	public void setSheng(String sheng) {
		this.sheng = sheng;
	}

	public String getShi() {
		return shi;
	}

	public void setShi(String shi) {
		this.shi = shi;
	}

	public String getShiyi() {
		return shiyi;
	}

	public void setShiyi(String shiyi) {
		this.shiyi = shiyi;
	}

	public String getKezhongzhi() {
		return kezhongzhi;
	}

	public void setKezhongzhi(String kezhongzhi) {
		this.kezhongzhi = kezhongzhi;
	}

	public Map(long id, String diqu, String sheng, String shi, String shiyi, String kezhongzhi, String ss) {
		super();
		this.id = id;
		this.diqu = diqu;
		this.sheng = sheng;
		this.shi = shi;
		this.shiyi = shiyi;
		this.kezhongzhi = kezhongzhi;
		this.ss = ss;
	}

	public Map() {
		super();
	}

}
