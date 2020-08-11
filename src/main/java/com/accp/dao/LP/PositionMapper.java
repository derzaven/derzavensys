package com.accp.dao.LP;

import java.util.List;

import org.springframework.stereotype.Component;

import com.accp.pojo.Position;

@Component("LPPositionMapper")
public interface PositionMapper{
	List<Position> SelectAll();
}