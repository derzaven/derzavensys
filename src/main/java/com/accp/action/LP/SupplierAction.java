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

import com.accp.biz.LP.GoodsBiz;
import com.accp.biz.LP.SiteBiz;
import com.accp.biz.LP.SupplierBiz;
import com.accp.pojo.Site;
import com.accp.pojo.Supplier;
import com.github.pagehelper.PageInfo;


@RestController
@RequestMapping("/api/lingpeng")
public class SupplierAction {
	@Autowired
	private SupplierBiz supplierBiz;
	
	@Autowired
	private SiteBiz siteBiz;
	
	
	@GetMapping("/QuerySupplier")
	public List<Supplier> select(){
		return supplierBiz.selectAll();
	}
	
	@GetMapping("/QueryByNameSupplier/{name}")
	public List<Supplier> select(@PathVariable("name") String name){
		return supplierBiz.selectName(name);
	}
	
	
	@PostMapping("/AddBySupplier")
	public Map<String, Object> addSupperlier(@RequestBody Supplier supplier) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(supplierBiz.add(supplier) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@DeleteMapping("/DeleteSupplier/{id}")
	public Map<String, Object> DeleteSupperlier(@PathVariable("id") Integer id) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(supplierBiz.Delete(id) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@PutMapping("/UpdateSupplier")
	public Map<String, Object> UpdateSupperlier(@RequestBody Supplier supplier) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(supplierBiz.Update(supplier) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
	
	@GetMapping("/QueryByIdSupplier/{id}")
	public Supplier selectByIdSupplier(@PathVariable("id") Integer id){
		return supplierBiz.selectById(id);
	}
	
	
	
	
	
	private List<Integer> siteid = new ArrayList<Integer>();
	
	@GetMapping("/QuerySiteSupplier/{id}")
	public List<Supplier> selectBySite(@PathVariable("id") Integer id){
		siteid = new ArrayList<Integer>();
		List<Site> list = siteBiz.selectId(id);
		siteid.add(id);
		for (Site site : list) {
			if(site.getChildren().size() != 0) {
				digui(site.getSiteid());
				siteid.add(site.getSiteid());
			}else {
				siteid.add(site.getSiteid());
			}
		}
		return supplierBiz.selectId(siteid);
	}
	
	public List<Integer> digui(Integer id) {
		List<Integer> ids = new ArrayList<Integer>();
		List<Site> list = siteBiz.selectId(id);
		for (Site site : list) {
			if(site.getChildren().size() != 0) {
				digui(site.getSiteid());
				ids.add(site.getSiteid());
			}else {
				ids.add(site.getSiteid());
			}
		}
		for (Integer s : ids) {
			siteid.add(s);
		}
		return ids;
	}
	
}
