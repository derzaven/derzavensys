package com.accp.action.JHB;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component("JHBUtilAction")
@RestController
@RequestMapping("/api/util")
public class UtilAction {
	@GetMapping("/getIndent")
	public String getIndent() {
		Random random = new Random();
	    DecimalFormat df = new DecimalFormat("000");
	    String indent = new SimpleDateFormat("yyyyMMddHHmmss")
	                .format(new Date()) + df.format(random.nextInt(1000));
	    return indent;
	}
}
