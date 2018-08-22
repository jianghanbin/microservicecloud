package com.hanbin.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hanbin.springcloud.entities.Dept;

@Mapper
public interface DeptDao {
	public int addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
