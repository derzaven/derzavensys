package com.accp.action.JHB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.JHB.GoodsBiz;
import com.accp.pojo.Goods;

@Component("JHBGoodsAction")
@RestController
@RequestMapping("/api/goods")
public class GoodsAction {
	@Autowired
	private GoodsBiz gb;

	@GetMapping("/selectAll")
	public List<Goods> selectAll(){
		return gb.selectAll();
	}
}
