package com.accp.action.JHB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.JHB.StaffBiz;
import com.accp.biz.JHB.impl.StaffBizImpl;
import com.accp.pojo.Staff;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/staff")
public class StaffAction {
	@Autowired
	private StaffBiz sbz;
	@Autowired
	private StaffBizImpl sbzImpl;
	@GetMapping("/selectAll/{pageNum}/{pageSize}")
	public PageInfo<Staff> selectAll(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		System.out.println(pageNum);
		return sbz.selectAll(pageNum, pageSize);
	}
	@PostMapping("/insert")
	public boolean insert(@RequestBody Staff sta) {
		return sbz.insert(sta);
	}
	@GetMapping("/getStaId")
	public String getStaId() {
		String staId=sbz.selectMaxId();
		Integer newId=Integer.parseInt(staId.substring(2))+1;
		return staId.substring(0, 2)+newId;
	}
	@GetMapping("/selectWaiter")
	public List<Staff> selectWaiter() {
		return sbz.selectWaiter();
	}
}
