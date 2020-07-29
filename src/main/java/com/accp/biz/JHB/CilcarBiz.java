package com.accp.biz.JHB;

import com.accp.pojo.Cilcar;
import com.github.pagehelper.PageInfo;

public interface CilcarBiz {
	public PageInfo<Cilcar> selectAll(Integer pageNum,Integer pageSize);
}
