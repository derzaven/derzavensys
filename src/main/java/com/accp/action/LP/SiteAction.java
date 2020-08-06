package com.accp.action.LP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.LP.SiteBiz;
import com.accp.pojo.Carmodel;
import com.accp.pojo.Site;

@RestController
@RequestMapping("/api/lingpeng")
public class SiteAction {
	@Autowired
	private SiteBiz siteBiz;
	
	@PostMapping("/AddSite")
	public Map<String, Object> addTree(@RequestBody Site sites) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(siteBiz.add(sites) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@DeleteMapping("/DeleteSite/{id}")
	public Map<String, Object> DeleteTree(@PathVariable("id") Integer id) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(siteBiz.delete(id) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@GetMapping("/QueryIdSite/{id}")
	public Site queryId(@PathVariable("id") Integer id) {
		return siteBiz.queryId(id);
	}
	
	
	@PutMapping("/UpdateSite")
	public Map<String, Object> UpdateTree(@RequestBody Site site) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(siteBiz.update(site) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
//		System.out.println(site.toString());
		return map;
	}
	
	
	@GetMapping("/QueryAllSite")
	public List<Site> queryAll(){
		return siteBiz.selectAll();
	}
	
	
	

	@GetMapping("/QuerySite")
	public Map<String, Object> findTree() {
		Map<String, Object> data = new HashMap<String, Object>();
		try {// 查询所有菜单
			List<Site> allMenu = siteBiz.selectAll();
			// 根节点
			List<Site> rootMenu = new ArrayList<Site>();
			for (Site nav : allMenu) {
				if (nav.getFsiteid() == 0) {// 父节点是0的，为根节点。
					rootMenu.add(nav);
				}
			}
			// 为根菜单设置子菜单，getClild是递归调用的
			for (Site nav : rootMenu) {
				/* 获取根节点下的所有子节点 使用getChild方法 */
				List<Site> childList = getChild(nav.getSiteid(), allMenu);
				nav.setChildren(childList);// 给根节点设置子节点
			}
			/**
			 * 输出构建好的菜单数据。
			 * 
			 */
			data.put("success", "true");
			data.put("list", rootMenu);
			return data;
		} catch (Exception e) {
			data.put("success", "false");
			data.put("list", new ArrayList());
			return data;
		}
	}
	//查询子菜单
	public List<Site> getChild(Integer id,List<Site> allMenu){
	    //子菜单
	    List<Site> childList = new ArrayList<Site>();
	    for (Site nav : allMenu) {
	      // 遍历所有节点，将所有菜单的父id与传过来的根节点的id比较
	      //相等说明：为该根节点的子节点。
	      if(nav.getFsiteid().equals(id)){
	        childList.add(nav);
	      }
	    }
	    //递归
	    for (Site nav : childList) {
	      nav.setChildren(getChild(nav.getSiteid(), allMenu));
	    }
	    //如果节点下没有子节点，返回一个空List（递归退出）
	    if(childList.size() == 0){
	      return new ArrayList<Site>();
	    }
	    return childList;
	  }
	
	
	
}
