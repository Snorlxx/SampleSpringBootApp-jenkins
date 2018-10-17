package com.verizon.sdr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.sdr.model.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer>{

}
