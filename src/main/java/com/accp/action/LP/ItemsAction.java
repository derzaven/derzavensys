package com.accp.action.LP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.LP.ItemsBiz;
import com.accp.pojo.Items;

@RestController
@RequestMapping("/api/lingpeng")
public class ItemsAction {
	@Autowired
	private ItemsBiz itemsBiz;
	
	@PostMapping("/AddItems")
	public Map<String, Object> addTree(@RequestBody Items items) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(itemsBiz.add(items) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@DeleteMapping("/DeleteItems/{id}")
	public Map<String, Object> DeleteTree(@PathVariable("id") Integer id) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(itemsBiz.delete(id) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@GetMapping("/QueryIdItems/{id}")
	public Items queryId(@PathVariable("id") Integer id) {
		return itemsBiz.queryId(id);
	}
	
	
	@PutMapping("/UpdateItems")
	public Map<String, Object> UpdateTree(@RequestBody Items items) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(itemsBiz.update(items) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
//		System.out.println(site.toString());
		return map;
	}
	
	
	@GetMapping("/QueryAllItems")
	public List<Items> queryAll(){
		return itemsBiz.selectAll();
	}
	
	
	

	@GetMapping("/QueryItems")
	public Map<String, Object> findTree() {
		Map<String, Object> data = new HashMap<String, Object>();
		try {// 查询所有菜单
			List<Items> allMenu = itemsBiz.selectAll();
			// 根节点
			List<Items> rootMenu = new ArrayList<Items>();
			for (Items nav : allMenu) {
				if (nav.getFitemsid() == 0) {// 父节点是0的，为根节点。
					rootMenu.add(nav);
				}
			}
			// 为根菜单设置子菜单，getClild是递归调用的
			for (Items nav : rootMenu) {
				/* 获取根节点下的所有子节点 使用getChild方法 */
				List<Items> childList = getChild(nav.getItemsid(), allMenu);
				nav.setList(childList);// 给根节点设置子节点
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
	public List<Items> getChild(Integer id,List<Items> allMenu){
	    //子菜单
	    List<Items> childList = new ArrayList<Items>();
	    for (Items nav : allMenu) {
	      // 遍历所有节点，将所有菜单的父id与传过来的根节点的id比较
	      //相等说明：为该根节点的子节点。
	      if(nav.getFitemsid().equals(id)){
	        childList.add(nav);
	      }
	    }
	    //递归
	    for (Items nav : childList) {
	      nav.setList(getChild(nav.getItemsid(), allMenu));
	    }
	    //如果节点下没有子节点，返回一个空List（递归退出）
	    if(childList.size() == 0){
	      return new ArrayList<Items>();
	    }
	    return childList;
	  }
	
	
	
}
