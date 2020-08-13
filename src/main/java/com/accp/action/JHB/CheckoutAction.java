package com.accp.action.JHB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.JHB.CheckoutBiz;
import com.accp.biz.JHB.impl.CheckoutBIzImpl;
import com.accp.pojo.Checkout;
import com.github.pagehelper.PageInfo;

@Component("JHBCheckoutAction")
@RestController
@RequestMapping("/api/check")
public class CheckoutAction {
	@Autowired
	private CheckoutBiz cb;
	@Autowired
	private CheckoutBIzImpl cbi;
	@PostMapping("/insert")
	public boolean insert(@RequestBody Checkout record) {
		return cbi.save(record);
	}
	@GetMapping("/selectAll/{pageNum}/{pageSize}")
	public PageInfo<Checkout> selectAll(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		return cb.selectAll(pageNum, pageSize);
	}
}