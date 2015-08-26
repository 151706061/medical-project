package com.medicalproj.common.dao;

import com.medicalproj.common.domain.MedicalCase;
import com.medicalproj.common.domain.MedicalCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MedicalCaseMapper {
    int countByExample(MedicalCaseExample example);

    int deleteByExample(MedicalCaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicalCase record);

    int insertSelective(MedicalCase record);

    List<MedicalCase> selectByExampleWithRowbounds(MedicalCaseExample example, RowBounds rowBounds);

    List<MedicalCase> selectByExample(MedicalCaseExample example);

    MedicalCase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicalCase record, @Param("example") MedicalCaseExample example);

    int updateByExample(@Param("record") MedicalCase record, @Param("example") MedicalCaseExample example);

    int updateByPrimaryKeySelective(MedicalCase record);

    int updateByPrimaryKey(MedicalCase record);
}