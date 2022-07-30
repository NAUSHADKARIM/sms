package com.sms.stud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sms.stud1.studententity;
import com.sms.stud2.studentrepo;
@SpringBootApplication
public class SmsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SmsApplication.class, args);
		studentrepo studentrepo = context.getBean(studentrepo.class);
		studententity s = new studententity();
		s.setName("aamir");
		s.setCity("mumbai");
		s.setProfile("celebirity");
		studententity pri =  studentrepo.save(s);
				
		System.out.println(pri);		
	}

}