package com.accp.dao.JHB;

import com.accp.pojo.Supplier;

public interface SupplierMapper {
    int deleteByPrimaryKey(Integer supid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer supid);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}