package springboot.employeecruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.employeecruddemo.model.Employee;
import springboot.employeecruddemo.repositary.employeerepositary;
@Service
public class employeeserviceimpl implements employeeservice{
	@Autowired
		private employeerepositary er;
         

		public employeeserviceimpl(employeerepositary er) {
			super();
			this.er = er;
		}

		@Override
		public String addemp(Employee e) {
			// TODO Auto-generated method stub
			er.save(e);
			return "created";
		}

		@Override
		public List<Employee> getemployees() {
			// TODO Auto-generated method stub
			return er.findAll() ;
		}

		@Override
		public Employee updateemp(Employee e,int eid) {
			Employee emp = er.findById(eid)
			        .orElseThrow(() -> new RuntimeException("Employee not found"));
			emp.setEname(e.getEname());
			emp.setSal(e.getSal());
			er.save(emp);
			return emp;
		}

		@Override
		public String deleteemp(int eid) {
			// TODO Auto-generated method stub
		 er.deleteById(eid);
			return "deleted";
		}

	}


