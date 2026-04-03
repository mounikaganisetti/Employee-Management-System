package springboot.employeecruddemo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.employeecruddemo.model.Employee;
import springboot.employeecruddemo.repositary.employeerepositary;
import springboot.employeecruddemo.service.employeeserviceimpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    employeeserviceimpl es;

    @Autowired
    employeerepositary er;

    @PostMapping("/insert")
    public Employee insertEmp(@RequestBody Employee e){
        es.addemp(e);
        return e;
    }

    @PutMapping("/update/{eid}")
    public Employee updateEmp(@RequestBody Employee e, @PathVariable int eid){
        es.updateemp(e, eid);
        return e;
    }

    @GetMapping("/get/{eid}")
    public Employee getEmp(@PathVariable int eid) {
        return er.findById(eid).orElseThrow();
    }

    @GetMapping("/all")
    public List<Employee> getAllEmp() {
        return er.findAll();
    }
    @DeleteMapping("/delete/{eid}")
    public String deleteEmp(@PathVariable int eid) {
    	   return "delete";
    	
    }
}