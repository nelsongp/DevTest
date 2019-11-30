package com.math.process;

import org.springframework.stereotype.Service;

import com.math.data.evaluate.IOrderData;
import com.math.data.evaluate.OrderData;
import com.math.data.validate.IValidateData;
import com.math.data.validate.ValidateData;
import com.math.pojo.ResponsePojo;

@Service
public class OrderProcess implements IOrderProcess{
	
	private IValidateData dataVal;
	private IOrderData dataOrder;
	
	public OrderProcess(
			IValidateData dataVal,
			IOrderData dataOrder) {
		this.dataVal = new ValidateData();
		this.dataOrder = new OrderData();
	}

	@Override
	public ResponsePojo getResult(String infix) {
		ResponsePojo response = new ResponsePojo();
		try {
			//Validamos si el valor introducido es valido
			if(dataVal.ValidarData(infix)) {
				response.setInfix(infix);
				response.setPostfix(dataOrder.evaluarExpresion(infix));
				response.setResult(0);
			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
			
		return null;
	}
	
}