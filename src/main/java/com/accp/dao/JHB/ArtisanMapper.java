package com.accp.dao.JHB;

import org.springframework.stereotype.Component;

import com.accp.pojo.Artisan;
@Component("JHBArtisanMapper")
public interface ArtisanMapper {
    int deleteByPrimaryKey(Integer artid);

    int insert(Artisan record);

    int insertSelective(Artisan record);

    Artisan selectByPrimaryKey(Integer artid);

    int updateByPrimaryKeySelective(Artisan record);

    int updateByPrimaryKey(Artisan record);
}