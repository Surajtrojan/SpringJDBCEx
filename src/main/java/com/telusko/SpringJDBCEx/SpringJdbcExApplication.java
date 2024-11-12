package com.telusko.SpringJDBCEx;

import com.telusko.SpringJDBCEx.model.Student;
import com.telusko.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(SpringJdbcExApplication.class, args);
		//System.out.println("Done..");

		Student s = context.getBean(Student.class);
		s.setRollNo(29);
		s.setName("Suraj");
		s.setMarks(92);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);

		List<Student> students  = service.getStudents();
		System.out.println(students);


	}

}
