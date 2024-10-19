package com.org.java.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.java.entity.Aws;
import com.org.java.repository.AwsRepository;
import com.org.java.service.AwsService;

@Component
public class AwsServiceImpl implements AwsService {
	
	@Autowired
	private AwsRepository awsRepository;

	@Override
	public Aws saveAwsDetails(Aws aws) {
		// TODO Auto-generated method stub
		return awsRepository.save(aws);
	}

	@Override
	public List<Aws> findAllAwsDetails() {
		List<Aws> list=awsRepository.findAll();
		return list;
	}

}
