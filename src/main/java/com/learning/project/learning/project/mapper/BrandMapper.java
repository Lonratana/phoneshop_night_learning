package com.learning.project.learning.project.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.learning.project.learning.project.dto.BrandDTO;
import com.learning.project.learning.project.entity.Brand;

@Mapper
public interface BrandMapper {

	BrandMapper INSTANCEBrandMapper = Mappers.getMapper(BrandMapper.class);
	
	Brand toBrand(BrandDTO dto);
	
	BrandDTO tBrandDTO(Brand entity);
}
