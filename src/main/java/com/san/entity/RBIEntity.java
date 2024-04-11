package com.san.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RBIDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RBIEntity {

	@Id
	private String code;
	private String bankName;
	private String IP;
}