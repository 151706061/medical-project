package com.medicalproj.common.dao;

import com.medicalproj.common.domain.MedicalCaseView;
import com.medicalproj.common.domain.MedicalCaseViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MedicalCaseViewMapper {
    int countByExample(MedicalCaseViewExample example);

    int deleteByExample(MedicalCaseViewExample example);

    int insert(MedicalCaseView record);

    int insertSelective(MedicalCaseView record);

    List<MedicalCaseView> selectByExampleWithRowbounds(MedicalCaseViewExample example, RowBounds rowBounds);

    List<MedicalCaseView> selectByExample(MedicalCaseViewExample example);

    int updateByExampleSelective(@Param("record") MedicalCaseView record, @Param("example") MedicalCaseViewExample example);

    int updateByExample(@Param("record") MedicalCaseView record, @Param("example") MedicalCaseViewExample example);
}