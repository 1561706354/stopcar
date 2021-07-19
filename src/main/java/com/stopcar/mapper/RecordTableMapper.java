package com.stopcar.mapper;

import com.stopcar.pojo.RecordTable;
import com.stopcar.pojo.RecordTableExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RecordTableMapper {
    int countByExample(RecordTableExample example);

    int sumBy();

    int deleteByExample(RecordTableExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(RecordTable record);

    int insertSelective(RecordTable record);

    List<RecordTable> selectByExample(RecordTableExample example);

    RecordTable selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") RecordTable record, @Param("example") RecordTableExample example);

    int updateByExample(@Param("record") RecordTable record, @Param("example") RecordTableExample example);

    int updateByPrimaryKeySelective(RecordTable record);

    int updateByPrimaryKey(RecordTable record);
}