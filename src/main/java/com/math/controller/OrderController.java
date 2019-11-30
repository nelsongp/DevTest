package com.math.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.math.data.evaluate.OrderData;
import com.math.data.validate.ValidateData;
import com.math.pojo.ResponsePojo;
import com.math.process.IOrderProcess;
import com.math.process.OrderProcess;

@RestController
public class OrderController {
	private IOrderProcess process;
	
	public OrderController(IOrderProcess process) {
		this.process = new OrderProcess(new ValidateData(), new OrderData());
	}
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponsePojo orderValues(@RequestBody String exp) {		
		return process.getResult(exp);
	}
}
