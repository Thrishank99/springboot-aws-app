package com.org.java.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.java.entity.Aws;

@Service
public interface AwsService {

	Aws saveAwsDetails(Aws aws);

	List<Aws> findAllAwsDetails();

}
