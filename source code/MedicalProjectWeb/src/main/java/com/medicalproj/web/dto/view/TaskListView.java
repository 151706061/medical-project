package com.medicalproj.web.dto.view;

import java.util.List;

import com.medicalproj.common.domain.TaskView;

public class TaskListView {
	private List<TaskView> tasks;
	private PagerView pager;
	public List<TaskView> getTasks() {
		return tasks;
	}
	public void setTasks(List<TaskView> tasks) {
		this.tasks = tasks;
	}
	public PagerView getPager() {
		return pager;
	}
	public void setPager(PagerView pager) {
		this.pager = pager;
	}
}
