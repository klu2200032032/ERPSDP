package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.klef.jfsd.springboot.model.Parent;

public interface ParentRepository extends JpaRepository<Parent, Integer>{

	@Query("select p from Parent p where p.email=?1 and p.password=?2")
	public Parent checkparentLogin(String email,String password);

}