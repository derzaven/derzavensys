package com.accp.dao.JHB;

import com.accp.pojo.Record;

public interface RecordMapper {
    int deleteByPrimaryKey(Integer recid);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer recid);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}