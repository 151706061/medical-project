package com.medicalproj.common.util;

import com.medicalproj.web.dto.view.PagerView;

public class PagerHelper {

	public static PagerView getPager(Integer page, Integer pageSize, Integer totalCount) {
		PagerView pager = new PagerView();
		pager.setPage(page);
		pager.setPageSize(pageSize);
		pager.setTotalCount(totalCount);
		int totalPage = (int)Math.ceil(((double)totalCount/pageSize));
		pager.setTotalPage(totalPage);
		return pager;
	}

	public static int getStart(Integer page, Integer pageSize) {
		return (page - 1)*pageSize;
	}

}
