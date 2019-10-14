package kr.co.itcen.springcontainer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.user.UserConfig01;
import kr.co.itcen.springcontainer.user.User;

public class JavaConfigTest {
	
	public static void main(String[] args) {
		testUser01();
		testUser02();
	}
	
	// 1. Java Config Class를 명시한다. (Explicit Configuration)
	public static void testUser01() {
		ApplicationContext appCtxt = new AnnotationConfigApplicationContext(UserConfig01.class);
		
		User user = appCtxt.getBean(User.class);
		System.out.println(user);
		
		((ConfigurableApplicationContext) appCtxt).close();
	}
	
	// 2. 자동으로 Java Config Class를 Scan한다. (auto-scan)
	public static void testUser02() {
		ApplicationContext appCtxt = new AnnotationConfigApplicationContext("config.user");
		
		User user = appCtxt.getBean(User.class);
		System.out.println(user);
		
		((ConfigurableApplicationContext) appCtxt).close();
	}
	
}
