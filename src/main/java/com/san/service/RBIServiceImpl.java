package com.san.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.san.dao.RBIDao;
import com.san.entity.RBIEntity;

@Service
public class RBIServiceImpl implements RBIService {

	@Autowired
	private RBIDao rbiDao;
	
	
	@Override
	public String getBank(String code) {
		
		StringBuilder api = new StringBuilder();
		
		Optional<RBIEntity> optional = rbiDao.getBank(code);
		
		RBIEntity entity = optional.get();
		
		api.append(entity.getIP());
		api.append("/");
		api.append(entity.getBankName());
		
		return api.toString();
	}

}
