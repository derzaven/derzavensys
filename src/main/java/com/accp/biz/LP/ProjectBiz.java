package com.accp.biz.LP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.LP.ProjectMapper;
import com.accp.pojo.Project;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ProjectBiz extends ServiceImpl<ProjectMapper, Project>{
	@Autowired
	private ProjectMapper projectMapper;
	
	public List<Project> selectAll(){
		return projectMapper.selectAll();
	}
	public List<Project> selectId(List<Integer> list){
		return projectMapper.selectId(list);
	}
	
	public List<Project> selectName(String name){
		QueryWrapper<Project> qw = Wrappers.query();
		qw.like("proname", name);
		return super.getBaseMapper().selectList(qw);
	}
	
	public Integer add(Project entity) {
		return super.getBaseMapper().insert(entity);
	}
	public int Delete(Integer id) {
		return super.getBaseMapper().deleteById(id);
	}
	
	public Integer Update(Project entity) {
		return super.getBaseMapper().updateById(entity);
	}
	public Project selectById(Integer id) {
		// TODO Auto-generated method stub
		return super.getBaseMapper().selectById(id);
	}
}
