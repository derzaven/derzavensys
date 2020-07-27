package com.accp.dao.JHB;

import com.accp.pojo.Position;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer posid);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer posid);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
}