package com.accp.action.LP;

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

import com.accp.biz.LP.CarBrandBiz;
import com.accp.pojo.Carbrand;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/lingpeng")
public class CarBrandAction {
	
	@Autowired
	private CarBrandBiz carbrandBiz;
	
	@GetMapping("/QueryCarBrand/{pageNum}/{pageSize}/{name}")
	public PageInfo<Carbrand> query(@PathVariable("pageNum") Integer pageNum ,@PathVariable("pageSize") Integer pageSize,@PathVariable("name") String name){
		return carbrandBiz.query(pageNum, pageSize,name);
	}
	
	@GetMapping("/QueryIdCarBrand/{id}")
	public Carbrand queryId(@PathVariable("id") Integer id) {
		return carbrandBiz.queryId(id);
	}
	
	@GetMapping("/QueryAllCarBrand")
	public List<Carbrand> queryAll() {
		return carbrandBiz.queryAll();
	}
	
	@PutMapping("/UpdateCarBrand")
	public Map<String, Object> update(@RequestBody Carbrand carbrand){
		Map<String, Object> map = new HashMap<String, Object>();
		if(carbrandBiz.update(carbrand) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@DeleteMapping("/DeleteCarBrand/{id}")
	public Map<String, Object> delete(@PathVariable("id") Integer id){
		Map<String, Object> map = new HashMap<String, Object>();
		if(carbrandBiz.delete(id) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@PostMapping("/AddCarBrand")
	public Map<String, Object> add(@RequestBody Carbrand carbrand){
		Map<String, Object> map = new HashMap<String, Object>();
		if(carbrandBiz.queryName(carbrand.getCbdname()).size() == 0) {
			if(carbrandBiz.add(carbrand) == 1) {
				map.put("code", "200");
				map.put("msg","ok");
			}else {
				map.put("code", "300");
				map.put("msg","no");
			}
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
}
