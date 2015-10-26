package com.medicalproj.common.dao;

import com.medicalproj.common.domain.UploadFile;
import com.medicalproj.common.domain.UploadFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UploadFileMapper {
    int countByExample(UploadFileExample example);

    int deleteByExample(UploadFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadFile record);

    int insertSelective(UploadFile record);

    List<UploadFile> selectByExampleWithRowbounds(UploadFileExample example, RowBounds rowBounds);

    List<UploadFile> selectByExample(UploadFileExample example);

    UploadFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadFile record, @Param("example") UploadFileExample example);

    int updateByExample(@Param("record") UploadFile record, @Param("example") UploadFileExample example);

    int updateByPrimaryKeySelective(UploadFile record);

    int updateByPrimaryKey(UploadFile record);
}