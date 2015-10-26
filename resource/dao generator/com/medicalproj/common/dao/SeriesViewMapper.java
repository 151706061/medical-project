package com.medicalproj.common.dao;

import com.medicalproj.common.domain.SeriesView;
import com.medicalproj.common.domain.SeriesViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SeriesViewMapper {
    int countByExample(SeriesViewExample example);

    int deleteByExample(SeriesViewExample example);

    int insert(SeriesView record);

    int insertSelective(SeriesView record);

    List<SeriesView> selectByExampleWithRowbounds(SeriesViewExample example, RowBounds rowBounds);

    List<SeriesView> selectByExample(SeriesViewExample example);

    int updateByExampleSelective(@Param("record") SeriesView record, @Param("example") SeriesViewExample example);

    int updateByExample(@Param("record") SeriesView record, @Param("example") SeriesViewExample example);
}