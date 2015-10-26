package com.medicalproj.common.dao;

import com.medicalproj.common.domain.AuthorizeUserView;
import com.medicalproj.common.domain.AuthorizeUserViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AuthorizeUserViewMapper {
    int countByExample(AuthorizeUserViewExample example);

    int deleteByExample(AuthorizeUserViewExample example);

    int insert(AuthorizeUserView record);

    int insertSelective(AuthorizeUserView record);

    List<AuthorizeUserView> selectByExampleWithRowbounds(AuthorizeUserViewExample example, RowBounds rowBounds);

    List<AuthorizeUserView> selectByExample(AuthorizeUserViewExample example);

    int updateByExampleSelective(@Param("record") AuthorizeUserView record, @Param("example") AuthorizeUserViewExample example);

    int updateByExample(@Param("record") AuthorizeUserView record, @Param("example") AuthorizeUserViewExample example);
}