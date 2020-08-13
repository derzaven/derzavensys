package com.accp.biz.JHB;

import com.accp.pojo.Rework;

public interface ReworkBiz {
	public int countByOdd(String odd);
	public boolean insert(Rework rework);
}
