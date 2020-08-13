package com.accp.biz.JHB;

import com.accp.pojo.Checkout;
import com.github.pagehelper.PageInfo;

public interface CheckoutBiz {
	public PageInfo<Checkout> selectAll(Integer pageNum,Integer pageSize);
}
