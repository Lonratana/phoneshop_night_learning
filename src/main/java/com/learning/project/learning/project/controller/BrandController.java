package com.learning.project.learning.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.project.learning.project.dto.BrandDTO;
import com.learning.project.learning.project.entity.Brand;
import com.learning.project.learning.project.mapper.BrandMapper;
import com.learning.project.learning.project.service.BrandService;
import com.learning.project.learning.project.service.util.Mapper;

@RestController
@RequestMapping("brands")
public class BrandController {

	@Autowired
	private BrandService brandService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
		Brand brand = BrandMapper.INSTANCEBrandMapper.toBrand(brandDTO);
		brand = brandService.create(brand);
		return ResponseEntity.ok(BrandMapper.INSTANCEBrandMapper.tBrandDTO(brand));
	}

	@GetMapping("{id}")
	public ResponseEntity<?> getOneBrand(@PathVariable("id") Integer BrandId) {
		Brand brand = brandService.getById(BrandId);
		return ResponseEntity.ok(BrandMapper.INSTANCEBrandMapper.tBrandDTO(brand));
	}

	@PutMapping("{id}")
	public ResponseEntity<?> update(@PathVariable("id") Integer BrandId, @RequestBody BrandDTO brandDTO) {
		Brand brand = BrandMapper.INSTANCEBrandMapper.toBrand(brandDTO);
		Brand updatedBrand = brandService.update(BrandId, brand);
		return ResponseEntity.ok(BrandMapper.INSTANCEBrandMapper.tBrandDTO(updatedBrand));
	}
}
