package com.learning.project.learning.project.service.util;
import com.learning.project.learning.project.dto.BrandDTO;
import com.learning.project.learning.project.entity.Brand;


public class Mapper {
	
	public static Brand toBrand(BrandDTO dto) {
	Brand brand = new Brand();
//	brand.setId(dto.getId());
	brand.setName(dto.getName());
	return brand;
	}
	
	
	public static BrandDTO toBrandDTO(Brand brand) {
	BrandDTO brandDTO2 = new BrandDTO();
	brandDTO2.setName(brand.getName());
	return brandDTO2;
	}
}
