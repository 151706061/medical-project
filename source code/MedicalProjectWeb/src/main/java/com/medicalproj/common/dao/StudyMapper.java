package com.medicalproj.common.dao;

import com.medicalproj.common.domain.Study;
import com.medicalproj.common.domain.StudyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StudyMapper {
    int countByExample(StudyExample example);

    int deleteByExample(StudyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Study record);

    int insertSelective(Study record);

    List<Study> selectByExampleWithRowbounds(StudyExample example, RowBounds rowBounds);

    List<Study> selectByExample(StudyExample example);

    Study selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Study record, @Param("example") StudyExample example);

    int updateByExample(@Param("record") Study record, @Param("example") StudyExample example);

    int updateByPrimaryKeySelective(Study record);

    int updateByPrimaryKey(Study record);
}