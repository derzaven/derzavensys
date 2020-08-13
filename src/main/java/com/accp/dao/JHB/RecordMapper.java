package com.accp.dao.JHB;

import org.springframework.stereotype.Component;

import com.accp.pojo.Record;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Component("JHBRecordMapper")
public interface RecordMapper extends BaseMapper<Record> {
    int insert(Record record);

}