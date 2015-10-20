package com.medicalproj.common.dao;

import com.medicalproj.common.domain.DetailedStudyView;
import com.medicalproj.common.domain.DetailedStudyViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DetailedStudyViewMapper {
    int countByExample(DetailedStudyViewExample example);

    int deleteByExample(DetailedStudyViewExample example);

    int insert(DetailedStudyView record);

    int insertSelective(DetailedStudyView record);

    List<DetailedStudyView> selectByExampleWithRowbounds(DetailedStudyViewExample example, RowBounds rowBounds);

    List<DetailedStudyView> selectByExample(DetailedStudyViewExample example);

    int updateByExampleSelective(@Param("record") DetailedStudyView record, @Param("example") DetailedStudyViewExample example);

    int updateByExample(@Param("record") DetailedStudyView record, @Param("example") DetailedStudyViewExample example);
}