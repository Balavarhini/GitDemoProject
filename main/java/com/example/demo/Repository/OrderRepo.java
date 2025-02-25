package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Bill;

public interface OrderRepo extends JpaRepository<Bill,Integer> {

	List<Bill> findByConsumerid(String name);

}
