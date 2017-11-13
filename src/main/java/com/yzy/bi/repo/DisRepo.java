package com.yzy.bi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.yzy.bi.entiy.Dis;

public interface DisRepo extends CrudRepository<Dis, Long> {

	List<Dis> findByType(String type);

	@Query("from Dis where value like %:mx% ")
	List<Dis> findByMx(@Param("mx") String mx);
}
