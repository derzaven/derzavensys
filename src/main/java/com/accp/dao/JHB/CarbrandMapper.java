package com.accp.dao.JHB;

import com.accp.pojo.Carbrand;

public interface CarbrandMapper {
    int deleteByPrimaryKey(Integer cbdid);

    int insert(Carbrand record);

    int insertSelective(Carbrand record);

    Carbrand selectByPrimaryKey(Integer cbdid);

    int updateByPrimaryKeySelective(Carbrand record);

    int updateByPrimaryKey(Carbrand record);
}