package com.accp.dao.JHB;

import com.accp.pojo.Repairbill;

public interface RepairbillMapper {
    int deleteByPrimaryKey(String odd);

    int insert(Repairbill record);

    int insertSelective(Repairbill record);

    Repairbill selectByPrimaryKey(String odd);

    int updateByPrimaryKeySelective(Repairbill record);

    int updateByPrimaryKey(Repairbill record);
}