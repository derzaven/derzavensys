package com.accp.action.JHB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.JHB.CilcarBiz;
import com.accp.pojo.Cilcar;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/cilcar")
public class CilcarAction {
	@Autowired
	private CilcarBiz cb;
	@GetMapping("/selectAll/{pageNum}/{pageSize}")
	public PageInfo<Cilcar> selectAll(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		return cb.selectAll(pageNum, pageSize);
	}
	@GetMapping("/selectByCarNum/{pageNum}/{pageSize}/{clrno}")
	public PageInfo<Cilcar> selectByCarNum(@PathVariable Integer pageNum,
			@PathVariable Integer pageSize,
			@PathVariable String clrno){
		return cb.selectByCarNum(pageNum, pageSize, clrno);
	}
}
