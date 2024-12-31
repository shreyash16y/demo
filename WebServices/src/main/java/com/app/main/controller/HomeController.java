package com.app.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.main.model.Student;

@RestController
public class HomeController 
{
	 @GetMapping("/getData")
     public String m1()
     {
		 return "Hello World";
     }
	 
	 @GetMapping("/save")
	 public Student saveData()
	 {
		Student s=new Student();
		s.setRollno(01);
		s.setName("ABC");
		s.setAddr("pune");
		return s;
	 }
	 
	 @PostMapping("/get")
	 public List<Student> list(@RequestBody List<Student> list)
	 {
		for(Student stu:list)
		{
			System.out.println(stu.getRollno());
		    System.out.println(stu.getName());
		    System.out.println(stu.getAddr());
		}
		return list;
	 }
	 
}
