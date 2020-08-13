package com.accp.biz.LP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.LP.PositionMapper;
import com.accp.pojo.Position;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class PositionBiz {
	@Autowired
	private PositionMapper positionMapper;
	
	public List<Position> selectAll(){
		return positionMapper.SelectAll();
	}
}
