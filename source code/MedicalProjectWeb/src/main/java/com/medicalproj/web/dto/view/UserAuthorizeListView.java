package com.medicalproj.web.dto.view;

import java.util.List;

public class UserAuthorizeListView {
	private List<AuthorizeUserView> users;
	private PagerView pager;
	public List<AuthorizeUserView> getUsers() {
		return users;
	}
	public void setUsers(List<AuthorizeUserView> users) {
		this.users = users;
	}
	public PagerView getPager() {
		return pager;
	}
	public void setPager(PagerView pager) {
		this.pager = pager;
	}
}
