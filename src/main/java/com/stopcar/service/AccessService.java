package com.stopcar.service;

import com.stopcar.mapper.AccessTableMapper;
import com.stopcar.pojo.AccessTable;
import com.stopcar.pojo.AccessTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessService {

    @Autowired
    AccessTableMapper mapper;

    public int insertAcccess(AccessTable accessTable) {
        return mapper.insertSelective(accessTable);
    }

    //    通过Vip类别查找
    public List<AccessTable> findtypeAss(AccessTable accessTable) {
        AccessTableExample example = new AccessTableExample();
        example.createCriteria().andAccessTypeEqualTo(accessTable.getAccessType());
        return mapper.selectByExample(example);
    }

    public List<AccessTable> findtypeAss1(String yue) {
        AccessTableExample example = new AccessTableExample();
        example.createCriteria().andAccessTypeEqualTo(yue);
        return mapper.selectByExample(example);
    }

    //    通过车牌号,用户名,手机号模糊查找
    public List<AccessTable> findnumAss(AccessTable accessTable) {
        AccessTableExample example = new AccessTableExample();
        example.createCriteria().andAccessNumLike("%" + accessTable.getAccessNum() + "%");
//                .andAccessNameLike("%"+accessTable.getAccessName()+"%")
//                .andAccessPhoneLike("%"+accessTable.getAccessPhone()+"%");
        return mapper.selectByExample(example);
    }

    //    删除用户
    public int deleteAss(AccessTable accessTable) {
        AccessTableExample example = new AccessTableExample();
        example.createCriteria().andAccessNumEqualTo(accessTable.getAccessNum());

        return mapper.deleteByExample(example);


    }

    //    修改续费
    public int updateAss(AccessTable accessTable) {
        AccessTableExample example = new AccessTableExample();
        example.createCriteria().andAccessNumEqualTo(accessTable.getAccessNum());
        return mapper.updateByExampleSelective(accessTable, example);
    }

    //    修改信息
    public int updateAsss(AccessTable accessTable) {
        return mapper.updateByPrimaryKeySelective(accessTable);
    }

    //    查找所有
    public List<AccessTable> findAss() {
        return mapper.selectByExample(null);
    }

    public AccessTable finnumAss(AccessTable accessTable) {

        AccessTableExample example = new AccessTableExample();
        example.createCriteria().andAccessNumEqualTo(accessTable.getAccessNum());
        List<AccessTable> list = mapper.selectByExample(example);
        if (list == null || list.size() == 0) {
            return null;
        } else {
            return list.get(0);
        }


    }


}


