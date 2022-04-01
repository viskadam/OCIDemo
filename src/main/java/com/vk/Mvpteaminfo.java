package com.vk;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "mvpteaminfo")

public class Mvpteaminfo {
	
	@Id
    private Long mvp_team_id;
    private String mvp_team_member;
    private Long mvpid;
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
	public Long getMvpid() {
		return mvpid;
	}
	public void setMvpid(Long mvpid) {
		this.mvpid = mvpid;
	}
	public Mvpteaminfo(Long mvp_team_id, String mvp_team_member, Long mvpid) {
		super();
		this.mvp_team_id = mvp_team_id;
		this.mvp_team_member = mvp_team_member;
		this.mvpid = mvpid;
	}
   }
