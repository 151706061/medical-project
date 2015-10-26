package com.medicalproj.common.dao;

import com.medicalproj.common.domain.QualificationApplication;
import com.medicalproj.common.domain.QualificationApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface QualificationApplicationMapper {
    int countByExample(QualificationApplicationExample example);

    int deleteByExample(QualificationApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QualificationApplication record);

    int insertSelective(QualificationApplication record);

    List<QualificationApplication> selectByExampleWithRowbounds(QualificationApplicationExample example, RowBounds rowBounds);

    List<QualificationApplication> selectByExample(QualificationApplicationExample example);

    QualificationApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QualificationApplication record, @Param("example") QualificationApplicationExample example);

    int updateByExample(@Param("record") QualificationApplication record, @Param("example") QualificationApplicationExample example);

    int updateByPrimaryKeySelective(QualificationApplication record);

    int updateByPrimaryKey(QualificationApplication record);
}