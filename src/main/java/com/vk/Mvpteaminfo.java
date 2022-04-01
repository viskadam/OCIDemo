package com.vk;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mvpteaminfo")
public class Mvpteaminfo {
	
	public Mvpteaminfo() {		
	}

	@Id
	private Long mvp_team_id;
	private String mvp_team_member;
	private String ref_architecture_selected;
	private String status;

	public Long getMvp_team_id() {
		return mvp_team_id;
	}

	public void setMvp_team_id(Long mvp_team_id) {
		this.mvp_team_id = mvp_team_id;
	}

	public String getMvp_team_member() {
		return mvp_team_member;
	}

	public void setMvp_team_member(String mvp_team_member) {
		this.mvp_team_member = mvp_team_member;
	}

	public String getRef_architecture_selected() {
		return ref_architecture_selected;
	}

	public void setRef_architecture_selected(String ref_architecture_selected) {
		this.ref_architecture_selected = ref_architecture_selected;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Mvpteaminfo [mvp_team_id=" + mvp_team_id + ", mvp_team_member=" + mvp_team_member
				+ ", ref_architecture_selected=" + ref_architecture_selected + ", status=" + status + "]";
	}

	public Mvpteaminfo(Long mvp_team_id, String mvp_team_member, String ref_architecture_selected, String status) {
		super();
		this.mvp_team_id = mvp_team_id;
		this.mvp_team_member = mvp_team_member;
		this.ref_architecture_selected = ref_architecture_selected;
		this.status = status;
	}


	
}
