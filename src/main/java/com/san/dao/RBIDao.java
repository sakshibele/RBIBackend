package com.san.dao;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.san.entity.RBIEntity;


public interface RBIDao {

	Optional<RBIEntity> getBank(String code);

}
