package com.accp.action.LP;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.LP.GoodsBiz;
import com.accp.pojo.Goods;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/lingpeng")
public class GooAction {
	@Autowired
	private GoodsBiz goodsBiz;
	
	@GetMapping("/QueryGoods/{pageNum}/{pageSize}/{name}/{state}")
	private PageInfo<Goods> SelectAll(@PathVariable("pageNum") Integer pageNum,@PathVariable("pageSize") Integer pageSize,@PathVariable("name") String name,@PathVariable("state") Integer state){
		return goodsBiz.queryAll(pageNum, pageSize, name,state);
	}
	
	@GetMapping("QueryIdGoods/{id}")
	private Goods SelectId(@PathVariable("id") Integer id){
		return goodsBiz.queryId(id);
	}
	
	
	
	
	@PutMapping("/UpdateGoods")
	public Map<String, Object> UpdateOne(@RequestBody Goods good){
		Map<String, Object> map = new HashMap<String, Object>();
		if(goodsBiz.UpdateOne(good) == 1) {
			map.put("code", "200");
			map.put("msg", "ok");
		}else {
			map.put("code", "300");
			map.put("msg", "no");
		}
		return map;
	}
	
	@PostMapping("/AddGoods")
	public  Map<String, Object> AddOne(@RequestBody Goods goods){
		Map<String, Object> map = new HashMap<String, Object>();
		if(goodsBiz.add(goods) == 1) {
			map.put("code", "200");
			map.put("msg", "ok");
		}else {
			map.put("code", "300");
			map.put("msg", "no");
		}
		return map;
	}
	
}
