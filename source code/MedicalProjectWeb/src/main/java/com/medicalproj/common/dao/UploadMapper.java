package com.medicalproj.common.dao;

import com.medicalproj.common.domain.Upload;
import com.medicalproj.common.domain.UploadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UploadMapper {
    int countByExample(UploadExample example);

    int deleteByExample(UploadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Upload record);

    int insertSelective(Upload record);

    List<Upload> selectByExampleWithRowbounds(UploadExample example, RowBounds rowBounds);

    List<Upload> selectByExample(UploadExample example);

    Upload selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Upload record, @Param("example") UploadExample example);

    int updateByExample(@Param("record") Upload record, @Param("example") UploadExample example);

    int updateByPrimaryKeySelective(Upload record);

    int updateByPrimaryKey(Upload record);
}