package com.accp.dao.LP;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.accp.pojo.Project;
import com.accp.pojo.Supplier;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Component("LPProjectMapper")
public interface ProjectMapper extends BaseMapper<Project>{
	List<Project> selectAll();
	List<Project> selectId(List<Integer> roleList);
}