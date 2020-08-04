package com.accp.dao.JHB;

import org.springframework.stereotype.Component;

import com.accp.pojo.Project;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Component("JHBProjectMapper")
public interface ProjectMapper extends BaseMapper<Project> {
    
}