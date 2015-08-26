package com.medicalproj.common.dao;

import com.medicalproj.common.domain.MedicalCaseResource;
import com.medicalproj.common.domain.MedicalCaseResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MedicalCaseResourceMapper {
    int countByExample(MedicalCaseResourceExample example);

    int deleteByExample(MedicalCaseResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicalCaseResource record);

    int insertSelective(MedicalCaseResource record);

    List<MedicalCaseResource> selectByExampleWithRowbounds(MedicalCaseResourceExample example, RowBounds rowBounds);

    List<MedicalCaseResource> selectByExample(MedicalCaseResourceExample example);

    MedicalCaseResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicalCaseResource record, @Param("example") MedicalCaseResourceExample example);

    int updateByExample(@Param("record") MedicalCaseResource record, @Param("example") MedicalCaseResourceExample example);

    int updateByPrimaryKeySelective(MedicalCaseResource record);

    int updateByPrimaryKey(MedicalCaseResource record);
}