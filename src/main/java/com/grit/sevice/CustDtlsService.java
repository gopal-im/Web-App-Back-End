package com.grit.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grit.model.CustInfo;
import com.grit.repository.CustInfoRepository;

@Service
public class CustDtlsService {
@Autowired
CustInfoRepository custInfoRepository;
public CustInfo saveCustInfo(CustInfo custinfo) {
	
	return custInfoRepository.save(custinfo);
}
public List<CustInfo> getCustData() {
	
	return (List<CustInfo>) custInfoRepository.findAll();
}	
}
