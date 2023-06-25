package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.MiddleEntity;
import com.example.demo.form.MiddleForm;
import com.example.demo.repository.MiddleRepository;

@Service
@Transactional
public class MiddleService {
	@Autowired
	MiddleRepository middleRepository;

	//  DBから全件取得
	public List<MiddleEntity> findAll() {
		return middleRepository.findAll();
	}

	public MiddleEntity findById(Integer id) {
		return middleRepository.getOne(id);
	}

	public void insert(MiddleForm middleForm) {
		MiddleEntity middleEntity = new MiddleEntity();
		middleEntity.setId(middleForm.getId());
		middleEntity.setName(middleForm.getName());
		middleEntity.setAge(middleForm.getAge());
		// データベースに登録する
		middleRepository.save(middleEntity);
	}

	public void update(MiddleForm middleForm) {
		MiddleEntity middleEntity = new MiddleEntity();
		middleEntity.setId(middleForm.getId());
		middleEntity.setName(middleForm.getName());
		middleEntity.setAge(middleForm.getAge());
		middleRepository.save(middleEntity);
	}

	public void delete(Integer id) {
		MiddleEntity middleEntity = findById(id);
		middleRepository.delete(middleEntity);
	}
}
