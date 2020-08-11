package com.accp.action.LP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.LP.HandleBiz;
import com.accp.biz.LP.PermBiz;
import com.accp.biz.LP.PositionBiz;
import com.accp.biz.LP.StaffBiz;
import com.accp.pojo.Handle;
import com.accp.pojo.Perm;
import com.accp.pojo.Position;
import com.accp.pojo.Staff;

@RestController
@RequestMapping("/api/lingpeng")
public class PositionAction {
	
	@Autowired
	private PositionBiz positionBiz;
	
	@Autowired
	private StaffBiz staffBiz;
	
	@Autowired
	private PermBiz permBiz;
	
	@Autowired
	private HandleBiz handleBiz;
	
	@GetMapping("/QueryPosition")
	public List<Position> selectAll(){
		return positionBiz.selectAll();
	}
	
	@GetMapping("/QueryStaff/{id}")
	public List<Staff> selectAllByStaff(@PathVariable("id")Integer id){
		return staffBiz.selectAllByStaff(id);
	}
	
	@GetMapping("/QueryPerm/{id}")
	public List<Integer> selectAllByPrem(@PathVariable("id")Integer id){
		List<Integer> lists = new ArrayList<Integer>();
		List<Perm> list = permBiz.SelectAll(id);
		for (Perm li : list) {
			lists.add(li.getHanid());
		}
		return lists;
	}
	
	@DeleteMapping("/deletePerm/{id}")
	public Map<String, Object> delet(@RequestBody List<Integer> ids,@PathVariable("id")Integer id) {
		List<Handle> allMenu = handleBiz.selectAll();
		List<Integer> hanId = new ArrayList<Integer>();
		for (Handle handle : allMenu) {
			for (Integer ss : ids) {
				if(handle.getHanid() == ss) {
					if(handle.getFhanid() != 0) {
						hanId.add(ss);
					}
				}
			}
		}
		Map<String, Object> map = new HashMap<String, Object>();
		if(permBiz.delete(id, hanId) == 1) {
			map.put("code", "200");
			map.put("msg","ok");
		}else {
			map.put("code", "300");
			map.put("msg","no");
		}
		return map;
	}
}
