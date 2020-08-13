package com.accp.action.xh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.xh.StarlevelBiz;
import com.accp.pojo.Starlevel;

@RestController
@RequestMapping("/api/starlevel")
public class StarlevelAction {
	@Autowired
	private StarlevelBiz biz;
	
	@GetMapping("selectAll")
	public List<Starlevel> selectall(){
		return biz.selectAll();
	}
}
