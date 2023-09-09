package com.Arsac.springMVCBoot;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//// this interface file do all the database functions like adding ,deleting ,updating ,listout the data  from or to the database.
import com.Arsac.springMVCBoot.model.Alien;
public interface AlienRepo extends JpaRepository<Alien,Integer> {

	List<Alien> findByAname(String aname);
	List<Alien> findByAnameOrderByAname(String aname);

// to use method that is not in jpa repo we can the @Query annotation
	@Query("from Alien where aname= :name")
	List<Alien> find(@Param("name") String aname);
}
