package com.accp.action.JHB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.JHB.ReworkBiz;
import com.accp.pojo.Rework;

@Component("JHBReworkAction")
@RestController
@RequestMapping("/api/rework")
public class ReworkAction {
	@Autowired
	private ReworkBiz rb;
	@GetMapping("/countRework/{odd}")
	public int countRework(@PathVariable String odd) {
		return rb.countByOdd(odd);
	}
	@PostMapping("/insert")
	public boolean insert(@RequestBody Rework rework) {
		System.out.println(rework);
		return rb.insert(rework);
	}
}
