package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Supply;

@Repository
public interface SupplyRepo extends JpaRepository<Supply,Integer> {

	List<Supply> findBySupplierid(String name);

}
