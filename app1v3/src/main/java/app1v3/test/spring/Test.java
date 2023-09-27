package app1v3.test.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app1v3.test.spring.Interface.Music;
import app1v3.test.spring.config.SpringConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(SpringConfig.class);

		Computer comp = con.getBean("computer", Computer.class);
		
		System.out.println(comp.toString());
		con.close();
	}

}
