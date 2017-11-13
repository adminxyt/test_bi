package com.yzy.bi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yzy.bi.entiy.Ds;

public interface DsRepo extends JpaRepository<Ds, Long> {

	List<Ds> findByType(String type);
}
