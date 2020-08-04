package com.accp.action.JHB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.JHB.RepairbillBiz;

@RestController
@RequestMapping("/api/repair")
public class RepairbillAction {
	@Autowired
	private RepairbillBiz rbb;
	
	
}
