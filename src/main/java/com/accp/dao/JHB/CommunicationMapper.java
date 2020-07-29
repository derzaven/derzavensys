package com.accp.dao.JHB;

import com.accp.pojo.Communication;

public interface CommunicationMapper {
    int deleteByPrimaryKey(Integer comid);

    int insert(Communication record);

    int insertSelective(Communication record);

    Communication selectByPrimaryKey(Integer comid);

    int updateByPrimaryKeySelective(Communication record);

    int updateByPrimaryKey(Communication record);
}