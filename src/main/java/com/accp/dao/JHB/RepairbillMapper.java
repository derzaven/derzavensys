package com.accp.dao.JHB;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.accp.pojo.Repairbill;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Component("JHBRepairbillMapper")
public interface RepairbillMapper extends BaseMapper<Repairbill> {
    int insert(Repairbill indent);
    
    List<Repairbill> selectAll();
}