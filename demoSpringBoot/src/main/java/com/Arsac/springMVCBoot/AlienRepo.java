package com.Arsac.springMVCBoot;
import org.springframework.data.jpa.repository.JpaRepository;
//// this interface file do all the database functions like adding ,deleting ,updating ,listout the data  from or to the database.
import com.Arsac.springMVCBoot.model.Alien;
public interface AlienRepo extends JpaRepository<Alien,Integer> {

}
