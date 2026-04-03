package springboot.employeecruddemo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.employeecruddemo.model.Employee;
@Repository
public interface employeerepositary extends JpaRepository <Employee,Integer>{
	

}
