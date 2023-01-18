package com.learning.project.learning.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.project.learning.project.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{
  //List<Brand> findByName(String name);
//	List<Brand> findByNameLike(String name);
	List<Brand> findByNameContaining(String name);
}
