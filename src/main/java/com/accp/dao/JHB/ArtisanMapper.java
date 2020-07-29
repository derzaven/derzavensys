package com.accp.dao.JHB;

import com.accp.pojo.Artisan;

public interface ArtisanMapper {
    int deleteByPrimaryKey(Integer artid);

    int insert(Artisan record);

    int insertSelective(Artisan record);

    Artisan selectByPrimaryKey(Integer artid);

    int updateByPrimaryKeySelective(Artisan record);

    int updateByPrimaryKey(Artisan record);
}