package com.san.dto;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RBIDto {

	private String code;
	private String bankName;
	private String IP;
}
