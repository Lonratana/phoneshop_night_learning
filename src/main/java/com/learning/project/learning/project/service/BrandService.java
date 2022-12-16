package com.learning.project.learning.project.service;
import com.learning.project.learning.project.entity.Brand;

public interface BrandService {
	Brand create(Brand brand);
	Brand getById(Integer id);
	Brand update(Integer id, Brand updateBrand);
}
