package com.stopcar.mapper;

import com.stopcar.pojo.AccessTable;
import com.stopcar.pojo.AccessTableExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AccessTableMapper {
    int countByExample(AccessTableExample example);

    int deleteByExample(AccessTableExample example);

    int deleteByPrimaryKey(Integer accessId);

    int insert(AccessTable record);

    int insertSelective(AccessTable record);

    List<AccessTable> selectByExample(AccessTableExample example);

    AccessTable selectByPrimaryKey(Integer accessId);

    int updateByExampleSelective(@Param("record") AccessTable record, @Param("example") AccessTableExample example);

    int updateByExample(@Param("record") AccessTable record, @Param("example") AccessTableExample example);

    int updateByPrimaryKeySelective(AccessTable record);

    int updateByPrimaryKey(AccessTable record);
}