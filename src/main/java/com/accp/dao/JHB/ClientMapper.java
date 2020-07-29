package com.accp.dao.JHB;

import com.accp.pojo.Client;

public interface ClientMapper {
    int deleteByPrimaryKey(Integer clid);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(Integer clid);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);
}