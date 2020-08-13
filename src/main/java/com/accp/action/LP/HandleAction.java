package com.accp.action.LP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.LP.HandleBiz;
import com.accp.pojo.Handle;

@RestController
@RequestMapping("/api/lingpeng")
public class HandleAction {
	@Autowired
	private HandleBiz handleBiz;
	
	@GetMapping("/query")
	public List<Handle> query(){
		return handleBiz.selectAll();
	}
	
	@GetMapping("/QueryHandle")
	public Map<String, Object> findTree() {
		Map<String, Object> data = new HashMap<String, Object>();
		try {// 查询所有菜单
			List<Handle> allMenu = handleBiz.selectAll();
			// 根节点
			List<Handle> rootMenu = new ArrayList<Handle>();
			for (Handle nav : allMenu) {
				if (nav.getFhanid() == 0) {// 父节点是0的，为根节点。
					rootMenu.add(nav);
				}
			}
			// 为根菜单设置子菜单，getClild是递归调用的
			for (Handle nav : rootMenu) {
				/* 获取根节点下的所有子节点 使用getChild方法 */
				List<Handle> childList = getChild(nav.getHanid(), allMenu);
				nav.setChildrens(childList);// 给根节点设置子节点
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
	public List<Handle> getChild(Integer id,List<Handle> allMenu){
	    //子菜单
	    List<Handle> childList = new ArrayList<Handle>();
	    for (Handle nav : allMenu) {
	      // 遍历所有节点，将所有菜单的父id与传过来的根节点的id比较
	      //相等说明：为该根节点的子节点。
	      if(nav.getFhanid().equals(id)){
	        childList.add(nav);
	      }
	    }
	    //递归
	    for (Handle nav : childList) {
	      nav.setChildrens(getChild(nav.getHanid(), allMenu));
	    }
	    //如果节点下没有子节点，返回一个空List（递归退出）
	    if(childList.size() == 0){
	      return new ArrayList<Handle>();
	    }
	    return childList;
	  }

}
