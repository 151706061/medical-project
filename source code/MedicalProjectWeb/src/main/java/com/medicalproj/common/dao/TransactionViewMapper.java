package com.medicalproj.common.dao;

import com.medicalproj.common.domain.TransactionView;
import com.medicalproj.common.domain.TransactionViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TransactionViewMapper {
    int countByExample(TransactionViewExample example);

    int deleteByExample(TransactionViewExample example);

    int insert(TransactionView record);

    int insertSelective(TransactionView record);

    List<TransactionView> selectByExampleWithRowbounds(TransactionViewExample example, RowBounds rowBounds);

    List<TransactionView> selectByExample(TransactionViewExample example);

    int updateByExampleSelective(@Param("record") TransactionView record, @Param("example") TransactionViewExample example);

    int updateByExample(@Param("record") TransactionView record, @Param("example") TransactionViewExample example);
}