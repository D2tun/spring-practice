package app0.test.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import app0.test.spring.bean.TestBean;

public class Spring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TestBean tb = con.getBean("testBean", TestBean.class);
		
		System.out.println(tb.getName());
		
		con.close();
	}

}
