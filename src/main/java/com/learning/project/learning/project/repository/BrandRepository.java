package com.learning.project.learning.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.project.learning.project.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
