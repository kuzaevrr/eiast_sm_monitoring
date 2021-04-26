package com.eist.sm.project.eiast_sm_monitoring.service;

import com.eist.sm.project.eiast_sm_monitoring.dao.EmployeeRepository;
import com.eist.sm.project.eiast_sm_monitoring.pojo.IncObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements com.eist.sm.project.eiast_sm_monitoring.service.Service {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void saveAllIncidents(List<IncObject> incObjects) {
        for(IncObject incObject: incObjects){
            employeeRepository.save(incObject);
        }
    }

    @Override
    public List<IncObject> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(IncObject employee) {
        employeeRepository.save(employee);
    }

    @Override
    public IncObject getEmployee(int id) {
        IncObject employee = null;
        Optional<IncObject> emp = employeeRepository.findById(id);
        if (emp.isPresent()) {
            employee = emp.get();
        }
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

//    @Override
//    public List<IncObject> findAllByName(String name) {
//        return employeeRepository.findAllByName(name);
//    }
}
