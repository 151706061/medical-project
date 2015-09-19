package com.medicalproj.common.dao;

import com.medicalproj.common.domain.StudyView;
import com.medicalproj.common.domain.StudyViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StudyViewMapper {
    int countByExample(StudyViewExample example);

    int deleteByExample(StudyViewExample example);

    int insert(StudyView record);

    int insertSelective(StudyView record);

    List<StudyView> selectByExampleWithRowbounds(StudyViewExample example, RowBounds rowBounds);

    List<StudyView> selectByExample(StudyViewExample example);

    int updateByExampleSelective(@Param("record") StudyView record, @Param("example") StudyViewExample example);

    int updateByExample(@Param("record") StudyView record, @Param("example") StudyViewExample example);
}