package com.accp.biz.JHB.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.biz.JHB.GoodsBiz;
import com.accp.dao.JHB.GoodsMapper;
import com.accp.pojo.Goods;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class GoodsBizImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsBiz {
	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public List<Goods> selectAll() {
		List<Goods> fList=new ArrayList<Goods>();
		for (Goods goods : goodsMapper.selectAll()) {
			List<Goods> sList=new ArrayList<Goods>();
			if(fList.size()==0) {
				Goods father=new Goods();
				father.setGoodsid(goods.getGoodsid());
				father.setGoodstype(goods.getGoodstype());
				sList.add(goods);
				father.setGoodsList(sList);
				fList.add(father);
			} else {
				boolean boo=true;
				for (Goods f : fList) {
					//如果父集合存在就存入
					if(f.getGoodstype().equals(goods.getGoodstype())) {
						boo=false;
						sList=f.getGoodsList();
						sList.add(goods);
						f.setGoodsList(sList);
					}
				}
				if(boo) {
					Goods father=new Goods();
					father.setGoodsid(goods.getGoodsid());
					father.setGoodstype(goods.getGoodstype());
					sList.add(goods);
					father.setGoodsList(sList);
					fList.add(father);
				}
			}
		}
		return fList;
	}
	
}
