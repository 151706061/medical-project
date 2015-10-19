package com.medicalproj.admin.dto.view;

import java.util.List;

import com.medicalproj.common.domain.UserView;
import com.medicalproj.web.dto.view.PagerView;

public class UserListView {
	private List<UserView> users;
	private PagerView pager;
	public List<UserView> getUsers() {
		return users;
	}
	public void setUsers(List<UserView> users) {
		this.users = users;
	}
	public PagerView getPager() {
		return pager;
	}
	public void setPager(PagerView pager) {
		this.pager = pager;
	}
}
