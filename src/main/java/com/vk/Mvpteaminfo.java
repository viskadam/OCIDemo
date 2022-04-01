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
	private String mvpname;

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

	public String getMvpid() {
		return mvpname;
	}

	public void setMvpid(String mvpname) {
		this.mvpname = mvpname;
	}

	public Mvpteaminfo(Long mvp_team_id, String mvp_team_member, String mvpname) {
		super();
		this.mvp_team_id = mvp_team_id;
		this.mvp_team_member = mvp_team_member;
		this.mvpname = mvpname;
	}
}
