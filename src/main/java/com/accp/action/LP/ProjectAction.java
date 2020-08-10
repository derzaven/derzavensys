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
import com.accp.biz.LP.ProjectBiz;
import com.accp.pojo.Items;
import com.accp.pojo.Project;


@RestController
@RequestMapping("/api/lingpeng")
public class ProjectAction {
	@Autowired
	private ProjectBiz projectBiz;
	
	@Autowired
	private ItemsBiz itemsBiz;
	
	
	@GetMapping("/QueryProject")
	public List<Project> select(){
		return projectBiz.selectAll();
	}
	
	@GetMapping("/QueryByNameProject/{name}")
	public List<Project> select(@PathVariable("name") String name){
		return projectBiz.selectName(name);
	}
	
	
	@PostMapping("/AddByProject")
	public Map<String, Object> addSupperlier(@RequestBody Project project) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(projectBiz.add(project) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@DeleteMapping("/DeleteProject/{id}")
	public Map<String, Object> DeleteSupperlier(@PathVariable("id") Integer id) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(projectBiz.Delete(id) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@PutMapping("/UpdateProject")
	public Map<String, Object> UpdateSupperlier(@RequestBody Project project) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(projectBiz.Update(project) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@GetMapping("/QueryByIdProject/{id}")
	public Project selectByIdSupplier(@PathVariable("id") Integer id){
		return projectBiz.selectById(id);
	}
	
	
	
	
	
	private List<Integer> siteid = new ArrayList<Integer>();
	
	@GetMapping("/QueryItemsSupplier/{id}")
	public List<Project> selectBySite(@PathVariable("id") Integer id){
		siteid = new ArrayList<Integer>();
		List<Items> list = itemsBiz.selectId(id);
		siteid.add(id);
		for (Items site : list) {
			if(site.getList().size() != 0) {
				digui(site.getItemsid());
				siteid.add(site.getItemsid());
			}else {
				siteid.add(site.getItemsid());
			}
		}
		return projectBiz.selectId(siteid);
	}
	
	public List<Integer> digui(Integer id) {
		List<Integer> ids = new ArrayList<Integer>();
		List<Items> list = itemsBiz.selectId(id);
		for (Items site : list) {
			if(site.getList().size() != 0) {
				digui(site.getItemsid());
				ids.add(site.getItemsid());
			}else {
				ids.add(site.getItemsid());
			}
		}
		for (Integer s : ids) {
			siteid.add(s);
		}
		return ids;
	}
	
}
