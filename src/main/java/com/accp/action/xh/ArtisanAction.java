package com.accp.action.xh;

import java.util.HashMap;
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

import com.accp.biz.xh.ArtisanBiz;
import com.accp.biz.xh.GroupBiz;
import com.accp.pojo.Artisan;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/artisan")
public class ArtisanAction {
	@Autowired
	private ArtisanBiz biz;
	
	@Autowired
	private GroupBiz groupbiz;
	
	@GetMapping("{p}/{s}")
	public PageInfo<Artisan> queryAll(@PathVariable Integer p, @PathVariable Integer s){
		PageInfo<Artisan> page = biz.queryAll(p,s);
		return page;
	}
	
	@PostMapping("insert")
	public Map<String,Object> insert(Artisan artisan){
		System.out.println("進入到新增方法");
		System.out.println(artisan.toString());
		biz.save(artisan);
		Map<String,Object> message = new HashMap<String ,Object>();
		message.put("code","200");
		message.put("msg", "ok");
		return message;
	}
	
	@GetMapping("selectById/{artid}")
	public Artisan selectById(@PathVariable Integer artid) {
		return biz.getById(artid);
	}
	
	@DeleteMapping("deleteById/{artid}")
	public Map<String, Object> deleteByid(@PathVariable Integer artid) {
		
		Map<String,Object> message = new HashMap<String ,Object>();
		if(biz.removeById(artid)) {
		message.put("code","200");
		message.put("msg", "ok");
		return message;
		}else {
			message.put("code","300");
			return message;
		}
	}
	
	@PostMapping("update")
	public Map<String,Object> update(@RequestBody Artisan artisan){
		System.out.println("进入了修改方法");
		System.out.println(artisan.toString());
		Map<String,Object> message = new HashMap<String ,Object>();
		if(biz.updateById(artisan)) {
		message.put("code","200");
		message.put("msg", "ok");
		return message;
		}else {
			message.put("code","300");
			return message;
		}
	}
	
}
