package com.accp.dao.LP;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Perm;

public interface PermMapper {
	List<Perm> selectAll(@Param("id") Integer id);
	
	int deleteById(@Param("id")Integer id,@Param("hanId")List<Integer> hanId);
}