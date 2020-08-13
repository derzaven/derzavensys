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

import com.accp.biz.LP.CarModelBiz;
import com.accp.pojo.Carmodel;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/lingpeng")
public class CarModelAction {
	
	@Autowired
	private CarModelBiz carmodelBiz;
	
	@GetMapping("/QueryCarModel/{pageNum}/{pageSize}/{name}")
	public PageInfo<Carmodel> query(@PathVariable("pageNum") Integer pageNum ,@PathVariable("pageSize") Integer pageSize,@PathVariable("name") String name){
		return carmodelBiz.query(pageNum, pageSize,name);
	}
	
	@GetMapping("/QueryAllCarModel")
	public List<Carmodel> queryAll(){
		return carmodelBiz.queryAll();
	}
	
	@GetMapping("/QueryCarModelById/{pageNum}/{pageSize}/{id}")
	public PageInfo<Carmodel> queryCarBrandId(@PathVariable("pageNum") Integer pageNum ,@PathVariable("pageSize") Integer pageSize,@PathVariable("id") Integer id){
		return carmodelBiz.queryCarBrandId(pageNum, pageSize,id);
	}
	

	@GetMapping("/QueryCarModelByEngineId/{pageNum}/{pageSize}/{id}")
	public PageInfo<Carmodel> queryCarEngineId(@PathVariable("pageNum") Integer pageNum ,@PathVariable("pageSize") Integer pageSize,@PathVariable("id") Integer id){
		return carmodelBiz.queryCarEngineId(pageNum, pageSize,id);
	}
	
	
	
	@GetMapping("/QueryIdCarModel/{id}")
	public Carmodel queryId(@PathVariable("id") Integer id) {
		return carmodelBiz.queryId(id);
	}
	
	@PutMapping("/UpdateCarModel")
	public Map<String, Object> update(@RequestBody Carmodel carmodel){
		Map<String, Object> map = new HashMap<String, Object>();
		if(carmodelBiz.update(carmodel) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@DeleteMapping("/DeleteCarModel/{id}")
	public Map<String, Object> delete(@PathVariable("id") Integer id){
		Map<String, Object> map = new HashMap<String, Object>();
		if(carmodelBiz.delete(id) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@PostMapping("/AddCarModel")
	public Map<String, Object> add(@RequestBody Carmodel carmodel){
		Map<String, Object> map = new HashMap<String, Object>();
		if(carmodelBiz.add(carmodel) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
}
