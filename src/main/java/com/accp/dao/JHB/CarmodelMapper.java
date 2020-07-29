package com.accp.dao.JHB;

import com.accp.pojo.Carmodel;

public interface CarmodelMapper {
    int deleteByPrimaryKey(Integer cmlid);

    int insert(Carmodel record);

    int insertSelective(Carmodel record);

    Carmodel selectByPrimaryKey(Integer cmlid);

    int updateByPrimaryKeySelective(Carmodel record);

    int updateByPrimaryKey(Carmodel record);
}