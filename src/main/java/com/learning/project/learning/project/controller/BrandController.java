package com.learning.project.learning.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.project.learning.project.dto.BrandDTO;
import com.learning.project.learning.project.entity.Brand;
import com.learning.project.learning.project.service.BrandService;
import com.learning.project.learning.project.service.util.Mapper;

@RestController
@RequestMapping("brands")
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?>create(@RequestBody BrandDTO brandDTO){
		Brand brand = Mapper.toBrand(brandDTO);
		brand= brandService.create(brand);
		return ResponseEntity.ok(Mapper.toBrandDTO(brandDTO));
	}
}
