package com.medicalproj.common.dao;

import com.medicalproj.common.domain.Task;
import com.medicalproj.common.domain.TaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TaskMapper {
    int countByExample(TaskExample example);

    int deleteByExample(TaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Task record);

    int insertSelective(Task record);

    List<Task> selectByExampleWithRowbounds(TaskExample example, RowBounds rowBounds);

    List<Task> selectByExample(TaskExample example);

    Task selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByExample(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);
}