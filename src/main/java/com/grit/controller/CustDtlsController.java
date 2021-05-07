package com.grit.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.grit.model.CustInfo;
import com.grit.sevice.CustDtlsService;

@CrossOrigin(origins="http://localhost:4200")  
@RestController
@RequestMapping(path = "/custinfo")
public class CustDtlsController {
	@Autowired
	CustDtlsService custDtlsService;
	
	@RequestMapping(value="/savecustinfo", method=RequestMethod.POST,headers="Accept=application/json")
	@ResponseBody
	public CustInfo saveCustInfo(@RequestBody HashMap customer) {
		try {
			//ObjectMapper to map the received JSON to POJO 
			ObjectMapper mapperObj = new ObjectMapper();
			CustInfo custInfo=mapperObj.convertValue(customer, CustInfo.class); 
			custInfo.setCreatedon(new Date());
			 custDtlsService.saveCustInfo(custInfo);
			 
			 return custInfo;
			//return accountcategoryService.saveAcountcategories(accountcategoryEntity);
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	@RequestMapping(value="/getCustData", method=RequestMethod.GET,headers="Accept=application/json")
	@ResponseBody
	public List<CustInfo> getCustData() {
		return custDtlsService.getCustData();
		 
	}
}
