package com.medicalproj.common.dao;

import com.medicalproj.common.domain.NotificationView;
import com.medicalproj.common.domain.NotificationViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NotificationViewMapper {
    int countByExample(NotificationViewExample example);

    int deleteByExample(NotificationViewExample example);

    int insert(NotificationView record);

    int insertSelective(NotificationView record);

    List<NotificationView> selectByExampleWithRowbounds(NotificationViewExample example, RowBounds rowBounds);

    List<NotificationView> selectByExample(NotificationViewExample example);

    int updateByExampleSelective(@Param("record") NotificationView record, @Param("example") NotificationViewExample example);

    int updateByExample(@Param("record") NotificationView record, @Param("example") NotificationViewExample example);
}