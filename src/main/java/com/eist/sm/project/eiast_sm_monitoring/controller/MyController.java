package com.eist.sm.project.eiast_sm_monitoring.controller;

import com.eist.sm.project.eiast_sm_monitoring.parser.Parser;
import com.eist.sm.project.eiast_sm_monitoring.pojo.IncObject;
import com.eist.sm.project.eiast_sm_monitoring.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private Service service;

    @Autowired
    Parser parser;

    @GetMapping("/")
    public String showAllEmployees(Model model) {
        List<IncObject> allEmployees = service.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }

    @PostMapping("/addEmployee")//GET
    public String addNewEmployee() {
        List<IncObject> allEmployees = parser.parseXLS();
        service.saveAllIncidents(allEmployees);
        return "redirect:/";
    }

//    @PostMapping("/saveEmployee")//POST
//    public String saveEmployee(@ModelAttribute("employee") IncObject employee) {
//        service.saveEmployee(employee);
//        return "redirect:/";
//    }
//
//    @GetMapping("/updateInfo")//POST
//    public String updateEmployee(@RequestParam("empId") int id, Model model) {
//        IncObject employee = service.getEmployee(id);
//        model.addAttribute("employee", employee);
//        return "employee-info";
//    }
//
//    @PostMapping("/deleteEmployee")//POST
//    public String deleteEmployee(@RequestParam("empId") int id) {
//        service.deleteEmployee(id);
//        return "redirect:/";
//    }
}
