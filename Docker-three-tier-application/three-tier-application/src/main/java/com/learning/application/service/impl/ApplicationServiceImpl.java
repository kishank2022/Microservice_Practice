package com.learning.application.service.impl;

import org.springframework.stereotype.Service;

import com.learning.application.entity.Name;
import com.learning.application.repository.NameRepository;
import com.learning.application.service.ApplicationService;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	private NameRepository name_repository;
	
	public ApplicationServiceImpl(NameRepository name_repository) {
		super();
		this.name_repository = name_repository;
	}

	@Override
	public String saveName(String name) {
		if(name.isEmpty() || name == null) {
			return "Enter valid name";
		}
		Name name_1 = new Name(name);
		name_1 = this.name_repository.save(name_1);
		return name_1.toString();
	}

}
