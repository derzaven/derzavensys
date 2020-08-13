package com.accp.dao.JHB;

import org.springframework.stereotype.Component;

import com.accp.pojo.Rework;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Component("JHBReworkMapper")
public interface ReworkMapper extends BaseMapper<Rework> {
    int insert(Rework rework);
}