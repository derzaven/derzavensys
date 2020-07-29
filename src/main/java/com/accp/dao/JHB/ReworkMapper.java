package com.accp.dao.JHB;

import com.accp.pojo.Rework;

public interface ReworkMapper {
    int deleteByPrimaryKey(Integer rewid);

    int insert(Rework record);

    int insertSelective(Rework record);

    Rework selectByPrimaryKey(Integer rewid);

    int updateByPrimaryKeySelective(Rework record);

    int updateByPrimaryKey(Rework record);
}