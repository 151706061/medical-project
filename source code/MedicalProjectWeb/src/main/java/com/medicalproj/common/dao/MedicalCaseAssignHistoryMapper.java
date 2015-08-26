package com.medicalproj.common.dao;

import com.medicalproj.common.domain.MedicalCaseAssignHistory;
import com.medicalproj.common.domain.MedicalCaseAssignHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MedicalCaseAssignHistoryMapper {
    int countByExample(MedicalCaseAssignHistoryExample example);

    int deleteByExample(MedicalCaseAssignHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicalCaseAssignHistory record);

    int insertSelective(MedicalCaseAssignHistory record);

    List<MedicalCaseAssignHistory> selectByExampleWithRowbounds(MedicalCaseAssignHistoryExample example, RowBounds rowBounds);

    List<MedicalCaseAssignHistory> selectByExample(MedicalCaseAssignHistoryExample example);

    MedicalCaseAssignHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicalCaseAssignHistory record, @Param("example") MedicalCaseAssignHistoryExample example);

    int updateByExample(@Param("record") MedicalCaseAssignHistory record, @Param("example") MedicalCaseAssignHistoryExample example);

    int updateByPrimaryKeySelective(MedicalCaseAssignHistory record);

    int updateByPrimaryKey(MedicalCaseAssignHistory record);
}