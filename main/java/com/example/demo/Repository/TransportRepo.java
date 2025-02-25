package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Transport;

@Repository
public interface TransportRepo extends JpaRepository<Transport,Integer>{

}
