package com.rewards.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rewards.entities.Student;
import com.rewards.repositories.StudentRepository;
import com.rewards.service.StudentService;


@Service /*
			 * We mark beans with @Service to indicate that it's holding the business logic.
			 * So there's not any other specialty except using it in the service layer
			 */
@Component("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepo;
	
	@Override
	public void save() {
		Student student = new Student();
		student.setId((long) 2);
		student.setName("adithya");
		student.setPassportNumber("23");
		studentRepo.save(student);
		
	}
	

}
