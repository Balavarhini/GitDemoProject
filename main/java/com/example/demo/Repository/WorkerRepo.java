package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Worker;

@Repository
public interface WorkerRepo extends JpaRepository<Worker,String> {

}
