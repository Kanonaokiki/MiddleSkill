package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MiddleEntity;

@Repository
public interface MiddleRepository extends JpaRepository<MiddleEntity, Integer> {
	List<MiddleEntity> findAll();
//	List<PrivateEntity> getOne();
}