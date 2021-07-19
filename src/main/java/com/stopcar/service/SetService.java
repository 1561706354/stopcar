package com.stopcar.service;

import com.stopcar.mapper.SetTableMapper;
import com.stopcar.pojo.SetTable;
import com.stopcar.pojo.SetTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Service
public class SetService {

    @Autowired
    SetTableMapper mapper;

    public int updateSet(SetTable setTable) {
        return mapper.updateByPrimaryKeySelective(setTable);
    }

    public SetTable selectSet(SetTable setTable) {
        SetTableExample setTableExample = new SetTableExample();
        SetTableExample.Criteria criteria = setTableExample.createCriteria();
        criteria.andSetIdEqualTo(setTable.getSetId()).andSetPwdEqualTo(setTable.getSetPwd());
        List<SetTable> setTableList = mapper.selectByExample(setTableExample);
        if (setTableList == null || setTableList.size() == 0) {
            return null;
        } else {
            return setTableList.get(0);

        }
    }

    public List<SetTable> findSet() {
        return mapper.selectByExample(null);
    }


}
