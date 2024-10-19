package com.org.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.java.entity.Aws;

@Repository
public interface AwsRepository extends JpaRepository<Aws, Integer>{

}
