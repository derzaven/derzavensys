package com.accp.dao.JHB;

import org.springframework.stereotype.Component;

import com.accp.pojo.Starlevel;
@Component("JHBStarlevelMapper")
public interface StarlevelMapper {
    int deleteByPrimaryKey(Integer lvid);

    int insert(Starlevel record);

    int insertSelective(Starlevel record);

    Starlevel selectByPrimaryKey(Integer lvid);

    int updateByPrimaryKeySelective(Starlevel record);

    int updateByPrimaryKey(Starlevel record);
}