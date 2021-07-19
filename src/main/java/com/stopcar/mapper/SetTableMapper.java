package com.stopcar.mapper;

import com.stopcar.pojo.SetTable;
import com.stopcar.pojo.SetTableExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SetTableMapper {
    int countByExample(SetTableExample example);

    int deleteByExample(SetTableExample example);

    int deleteByPrimaryKey(Integer setId);

    int insert(SetTable record);

    int insertSelective(SetTable record);

    List<SetTable> selectByExample(SetTableExample example);

    SetTable selectByPrimaryKey(Integer setId);

    int updateByExampleSelective(@Param("record") SetTable record, @Param("example") SetTableExample example);

    int updateByExample(@Param("record") SetTable record, @Param("example") SetTableExample example);

    int updateByPrimaryKeySelective(SetTable record);

    int updateByPrimaryKey(SetTable record);
}