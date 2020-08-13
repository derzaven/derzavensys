package com.accp.dao.JHB;

import org.springframework.stereotype.Component;

import com.accp.pojo.Checkout;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Component("JHBCheckoutMapper")
public interface CheckoutMapper extends BaseMapper<Checkout> {
	
}
