package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Supplier;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier,String> {



	

}
