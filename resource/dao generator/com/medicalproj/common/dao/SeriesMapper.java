package com.medicalproj.common.dao;

import com.medicalproj.common.domain.Series;
import com.medicalproj.common.domain.SeriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SeriesMapper {
    int countByExample(SeriesExample example);

    int deleteByExample(SeriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Series record);

    int insertSelective(Series record);

    List<Series> selectByExampleWithRowbounds(SeriesExample example, RowBounds rowBounds);

    List<Series> selectByExample(SeriesExample example);

    Series selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Series record, @Param("example") SeriesExample example);

    int updateByExample(@Param("record") Series record, @Param("example") SeriesExample example);

    int updateByPrimaryKeySelective(Series record);

    int updateByPrimaryKey(Series record);
}