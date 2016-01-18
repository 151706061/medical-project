package com.medicalproj.common.dao;

import com.medicalproj.common.domain.TaskView;
import com.medicalproj.common.domain.TaskViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TaskViewMapper {
    int countByExample(TaskViewExample example);

    int deleteByExample(TaskViewExample example);

    int insert(TaskView record);

    int insertSelective(TaskView record);

    List<TaskView> selectByExampleWithRowbounds(TaskViewExample example, RowBounds rowBounds);

    List<TaskView> selectByExample(TaskViewExample example);

    int updateByExampleSelective(@Param("record") TaskView record, @Param("example") TaskViewExample example);

    int updateByExample(@Param("record") TaskView record, @Param("example") TaskViewExample example);
}