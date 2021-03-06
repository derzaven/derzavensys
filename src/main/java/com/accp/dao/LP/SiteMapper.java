package com.accp.dao.LP;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.accp.pojo.Site;

@Component("LPSiteMapper")
public interface SiteMapper {
	  List<Site> selectAll();
	  List<Site> queryId(@Param("id") Integer id);
	  Integer add(@Param("site") Site site);
	  Integer delete(@Param("id") Integer id);
	  Site SelectId(@Param("id") Integer id);
	  Integer update(@Param("site") Site site);
}