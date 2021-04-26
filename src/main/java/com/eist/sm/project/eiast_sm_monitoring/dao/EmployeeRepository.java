package com.eist.sm.project.eiast_sm_monitoring.dao;


import com.eist.sm.project.eiast_sm_monitoring.pojo.IncObject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<IncObject, Integer> {

//public List<IncObject> findAllByName(String name);
}
