package com.medicalproj.common.dao;

import com.medicalproj.common.domain.PayAuthorize;
import com.medicalproj.common.domain.PayAuthorizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PayAuthorizeMapper {
    int countByExample(PayAuthorizeExample example);

    int deleteByExample(PayAuthorizeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PayAuthorize record);

    int insertSelective(PayAuthorize record);

    List<PayAuthorize> selectByExampleWithRowbounds(PayAuthorizeExample example, RowBounds rowBounds);

    List<PayAuthorize> selectByExample(PayAuthorizeExample example);

    PayAuthorize selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PayAuthorize record, @Param("example") PayAuthorizeExample example);

    int updateByExample(@Param("record") PayAuthorize record, @Param("example") PayAuthorizeExample example);

    int updateByPrimaryKeySelective(PayAuthorize record);

    int updateByPrimaryKey(PayAuthorize record);
}