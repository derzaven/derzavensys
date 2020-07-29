package com.accp.dao.JHB;

import com.accp.pojo.Rescuecar;

public interface RescuecarMapper {
    int deleteByPrimaryKey(String resno);

    int insert(Rescuecar record);

    int insertSelective(Rescuecar record);

    Rescuecar selectByPrimaryKey(String resno);

    int updateByPrimaryKeySelective(Rescuecar record);

    int updateByPrimaryKey(Rescuecar record);
}