package com.learning.project.learning.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.project.learning.project.entity.Brand;
import com.learning.project.learning.project.repository.BrandRepository;
import com.learning.project.learning.project.service.BrandService;
@Service
public class BrandServiceImp implements BrandService{
	
	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public Brand create(Brand brand) {
		return brandRepository.save(brand);
	}
}
