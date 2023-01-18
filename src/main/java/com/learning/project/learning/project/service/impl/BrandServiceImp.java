package com.learning.project.learning.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.learning.project.learning.project.entity.Brand;
import com.learning.project.learning.project.exception.ApiException;
import com.learning.project.learning.project.exception.ResourseNotFoundException;
import com.learning.project.learning.project.repository.BrandRepository;
import com.learning.project.learning.project.service.BrandService;

@Service
public class BrandServiceImp implements BrandService {

	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Brand create(Brand brand) {
		return brandRepository.save(brand);
	}

	@Override
	public Brand getById(Integer id) {
		return brandRepository.findById(id).orElseThrow(() -> new ResourseNotFoundException("Brand", id));
	}

	@Override
	public Brand update(Integer id, Brand updateBrand) {
		Brand brand = getById(id);
		brand.setName(updateBrand.getName()); // @Todo improve update
		return brandRepository.save(brand);
	}

	@Override
	public List<Brand> getBrands() {
		return brandRepository.findAll();
	}

	@Override 
	public List<Brand> getBrands(String name) {
//		return brandRepository.findByNameLike("%"+ name+ "%");
		return brandRepository.findByNameContaining(name);
	}

	

}
