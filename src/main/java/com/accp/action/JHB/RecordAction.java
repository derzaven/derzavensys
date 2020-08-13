package com.accp.action.JHB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.JHB.RecordBiz;
import com.accp.pojo.Record;
import com.accp.pojo.Repairbill;

@RestController
@RequestMapping("/api/record")
public class RecordAction {
	@Autowired
	private RecordBiz rb;
	@PostMapping("/insert")
	public boolean insert(@RequestBody Repairbill indent) {
		if(rb.insert(indent.getProList()))
			return rb.insert(indent.getGoodsList());
		else
			System.out.println("项目添加异常");
		return false;
	}
	@GetMapping("/selectByOdd/{odd}")
	public List<Record> selectByOdd(@PathVariable String odd){
		return rb.selectByOdd(odd);
	}
}
