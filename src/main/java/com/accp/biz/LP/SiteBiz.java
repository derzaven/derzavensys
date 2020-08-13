package com.accp.biz.LP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.LP.SiteMapper;
import com.accp.pojo.Site;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class SiteBiz {
	
	@Autowired
	private SiteMapper siteMapper;
	
	public List<Site> selectAll(){
		return siteMapper.selectAll();
	}
	
	public List<Site> selectId(Integer id){
		return siteMapper.queryId(id);
	}
	
	public int add(Site site) {
		return siteMapper.add(site);
	}
	
	public int delete(Integer id) {
		return siteMapper.delete(id);
	}
	public Site queryId(Integer id){
		return siteMapper.SelectId(id);
	}

	public int update(Site site) {
		return siteMapper.update(site);
	}
	
	
}
