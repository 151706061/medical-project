package com.medicalproj.common.dao;

import com.medicalproj.common.domain.Instance;
import com.medicalproj.common.domain.InstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface InstanceMapper {
    int countByExample(InstanceExample example);

    int deleteByExample(InstanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Instance record);

    int insertSelective(Instance record);

    List<Instance> selectByExampleWithRowbounds(InstanceExample example, RowBounds rowBounds);

    List<Instance> selectByExample(InstanceExample example);

    Instance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Instance record, @Param("example") InstanceExample example);

    int updateByExample(@Param("record") Instance record, @Param("example") InstanceExample example);

    int updateByPrimaryKeySelective(Instance record);

    int updateByPrimaryKey(Instance record);
}