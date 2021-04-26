package com.eist.sm.project.eiast_sm_monitoring.service;


import com.eist.sm.project.eiast_sm_monitoring.pojo.IncObject;

import java.util.List;

public interface Service {

     void saveAllIncidents(List<IncObject> incObjects);
     List<IncObject> getAllEmployees();
     void saveEmployee(IncObject employee);
     IncObject getEmployee(int id);
     void deleteEmployee(int id);
//     List<IncObject> findAllByName(String name);
}
