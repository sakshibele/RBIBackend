package com.san.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.san.entity.RBIEntity;
import com.san.repository.RBIRepository;

@Repository
public class RBIDaoImpl implements RBIDao {

	@Autowired
	private RBIRepository rbiRepository;
	
	@Override
	public Optional<RBIEntity> getBank(String code) {
		
		return rbiRepository.findById(code);
	}

}
