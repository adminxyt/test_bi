package com.yzy.bi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yzy.bi.entiy.Map;

public interface MapRepo extends JpaRepository<Map, Long> {

	@Query("from Map where ss like %:ss%")
	List<Map> findByLikeSs(@Param("ss") String ss);

	List<Map> findBySs(String ss);
}
