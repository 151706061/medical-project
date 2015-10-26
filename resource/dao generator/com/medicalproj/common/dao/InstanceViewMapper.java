package com.medicalproj.common.dao;

import com.medicalproj.common.domain.InstanceView;
import com.medicalproj.common.domain.InstanceViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface InstanceViewMapper {
    int countByExample(InstanceViewExample example);

    int deleteByExample(InstanceViewExample example);

    int insert(InstanceView record);

    int insertSelective(InstanceView record);

    List<InstanceView> selectByExampleWithRowbounds(InstanceViewExample example, RowBounds rowBounds);

    List<InstanceView> selectByExample(InstanceViewExample example);

    int updateByExampleSelective(@Param("record") InstanceView record, @Param("example") InstanceViewExample example);

    int updateByExample(@Param("record") InstanceView record, @Param("example") InstanceViewExample example);
}