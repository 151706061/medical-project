package com.medicalproj.common.dao;

import com.medicalproj.common.domain.Request;
import com.medicalproj.common.domain.RequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RequestMapper {
    int countByExample(RequestExample example);

    int deleteByExample(RequestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Request record);

    int insertSelective(Request record);

    List<Request> selectByExampleWithRowbounds(RequestExample example, RowBounds rowBounds);

    List<Request> selectByExample(RequestExample example);

    Request selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Request record, @Param("example") RequestExample example);

    int updateByExample(@Param("record") Request record, @Param("example") RequestExample example);

    int updateByPrimaryKeySelective(Request record);

    int updateByPrimaryKey(Request record);
}