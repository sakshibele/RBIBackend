package com.san.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.san.dto.RBIDto;
import com.san.service.RBIService;
import com.san.vos.ApiVo;


@CrossOrigin
@RestController
@RequestMapping(value = "rbi")
public class RBIController {

	@Autowired
	private RBIService rbiService;
	
	@GetMapping(value = "getbank/{code}")
	public ApiVo getApi(@PathVariable String code)
	{
		ApiVo apivo = new ApiVo();
		apivo.setApi(rbiService.getBank(code));
		return apivo;
	}
}
