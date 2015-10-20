package com.medicalproj.common.dao;

import com.medicalproj.common.domain.QualificationApplicationView;
import com.medicalproj.common.domain.QualificationApplicationViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface QualificationApplicationViewMapper {
    int countByExample(QualificationApplicationViewExample example);

    int deleteByExample(QualificationApplicationViewExample example);

    int insert(QualificationApplicationView record);

    int insertSelective(QualificationApplicationView record);

    List<QualificationApplicationView> selectByExampleWithRowbounds(QualificationApplicationViewExample example, RowBounds rowBounds);

    List<QualificationApplicationView> selectByExample(QualificationApplicationViewExample example);

    int updateByExampleSelective(@Param("record") QualificationApplicationView record, @Param("example") QualificationApplicationViewExample example);

    int updateByExample(@Param("record") QualificationApplicationView record, @Param("example") QualificationApplicationViewExample example);
}