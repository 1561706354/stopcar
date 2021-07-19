package com.stopcar.service;

import com.stopcar.mapper.RecordTableMapper;
import com.stopcar.pojo.AccessTable;
import com.stopcar.pojo.RecordTable;
import com.stopcar.pojo.RecordTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class RecordService {
    @Autowired
    RecordTableMapper mapper;

    //添加
    public int insertRed(RecordTable recordTable) {
        return mapper.insertSelective(recordTable);
    }

    //查找所有记录
    public List<RecordTable> findRed() {
        return mapper.selectByExample(null);
    }

    //通过车牌，会员类别模糊查找
    public List<RecordTable> findnumRed(RecordTable recordTable) {
        RecordTableExample example = new RecordTableExample();
        example.createCriteria().andRecordNumLike("%" + recordTable.getRecordNum() + "%")
                .andAccessTypeLike("%" + recordTable.getAccessType() + "%");
        return mapper.selectByExample(example);
    }

    //修改
//    public int  updateRed(RecordTable recordTable){
//        RecordTableExample example=new RecordTableExample();
//        example.createCriteria().andRecordNumEqualTo(recordTable.getRecordNum()).andRecordStartEqualTo(recordTable.getRecordStart());
//
//        return mapper.updateByExampleSelective(recordTable,example);
//    }
    public int updateRed(RecordTable recordTable) {
        return mapper.updateByPrimaryKeySelective(recordTable);
    }

    //    查找通过车牌，停车状态一起查找
    public RecordTable findnsRed(RecordTable recordTable) {
        RecordTableExample example = new RecordTableExample();
        example.createCriteria().andRecordNumEqualTo(recordTable.getRecordNum()).andRecordStartEqualTo(recordTable.getRecordStart());
        List<RecordTable> recordTables = mapper.selectByExample(example);
        if (recordTables == null || recordTables.size() == 0) {
            return null;
        } else {
            return recordTables.get(0);
        }
    }

    public int sumRed() {


        return mapper.sumBy();

    }


}
