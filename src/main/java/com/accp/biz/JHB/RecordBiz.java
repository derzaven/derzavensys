package com.accp.biz.JHB;

import java.util.List;

import com.accp.pojo.Record;

public interface RecordBiz {
	public boolean insert(List<Record> record);
	public List<Record> selectByOdd(String odd);
}
