package com.vk;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mvpinfo")
public class MvpInfo {

	public MvpInfo() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mvp_id;
	private String mvp_name;
	private String mvp_lead;
	private Date mvp_start_date;
	private Date mvp_end_date;

	public Long getMvp_id() {
		return mvp_id;
	}

	public void setMvp_id(Long mvp_id) {
		this.mvp_id = mvp_id;
	}

	public String getMvp_name() {
		return mvp_name;
	}

	public void setMvp_name(String mvp_name) {
		this.mvp_name = mvp_name;
	}

	public String getMvp_lead() {
		return mvp_lead;
	}

	public void setMvp_lead(String mvp_lead) {
		this.mvp_lead = mvp_lead;
	}

	public Date getMvp_start_date() {
		return mvp_start_date;
	}

	public void setMvp_start_date(Date mvp_start_date) {
		this.mvp_start_date = mvp_start_date;
	}

	public Date getMvp_end_date() {
		return mvp_end_date;
	}

	public void setMvp_end_date(Date mvp_end_date) {
		this.mvp_end_date = mvp_end_date;
	}

	@Override
	public String toString() {
		return "MvpInfo [mvp_id=" + mvp_id + ", mvp_name=" + mvp_name + ", mvp_lead=" + mvp_lead + ", mvp_start_date="
				+ mvp_start_date + ", mvp_end_date=" + mvp_end_date + "]";
	}

}
