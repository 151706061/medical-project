package com.medicalproj.common.dao;

import com.medicalproj.common.domain.MedicalCaseStudy;
import com.medicalproj.common.domain.MedicalCaseStudyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MedicalCaseStudyMapper {
    int countByExample(MedicalCaseStudyExample example);

    int deleteByExample(MedicalCaseStudyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicalCaseStudy record);

    int insertSelective(MedicalCaseStudy record);

    List<MedicalCaseStudy> selectByExampleWithRowbounds(MedicalCaseStudyExample example, RowBounds rowBounds);

    List<MedicalCaseStudy> selectByExample(MedicalCaseStudyExample example);

    MedicalCaseStudy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicalCaseStudy record, @Param("example") MedicalCaseStudyExample example);

    int updateByExample(@Param("record") MedicalCaseStudy record, @Param("example") MedicalCaseStudyExample example);

    int updateByPrimaryKeySelective(MedicalCaseStudy record);

    int updateByPrimaryKey(MedicalCaseStudy record);
}