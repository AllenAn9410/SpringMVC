package test;

import java.applet.AppletContext;
import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Properties;
import java.util.Scanner;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.Controller;

import com.cs.esp.org.json.JSONObject;

import allen.entity.User;
import allen.service.NameOrPwdException;
import allen.service.TranslateCCCcode;
import allen.service.UserService;






public class testHandlerMapping {
	@Test
	public void testHandlerMapping(){
		String cfg = "spring-mvc.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
		HandlerMapping hm = ac.getBean("handlerMapping",HandlerMapping.class);
		Properties map = ac.getBean("urlMappings",Properties.class);
		System.out.println(hm);
		//System.out.println(map);
	}
	@Test
	public void testHelloController(){
		String cfg = "spring-mvc.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
		Controller hc = ac.getBean("helloController",Controller.class);
		System.out.println(hc);
	}
	@Test
	public void testViewResolver(){
		String cfg = "spring-mvc.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
		ViewResolver vr = ac.getBean("jspViewResolver",ViewResolver.class);
		System.out.println(vr);
	}
	@Test
	public void testUserService() throws NameOrPwdException{
		String cfg = "spring-mvc.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
		System.out.println(ac);
		UserService us = ac.getBean("userService",UserService.class);
		User user = us.login("allen", "allen");
		System.out.println(user);
	}
	@Test
	public void testTranslateController(){
		String cfg = "spring-mvc.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(cfg);
		TranslateCCCcode tc = ac.getBean("translateCCCcode",TranslateCCCcode.class);
		String aaa = tc.ZHCN;
		System.out.println(aaa);
		
	
	}
	@Test
	public void testPath(){
//		InputStream inputStream = this.getClass().getResourceAsStream("/allen/service/ccc.json");
//		Scanner scanner = new Scanner(inputStream, "UTF-8");
//        String text = scanner.useDelimiter("\\A").next();
//		System.out.println(text);
//		File file = new File(path);
//		if (!file.exists()) {
//			//CONST.log.debug("ccc.json is not exist");
//			System.out.println("ccc.json is not exist");
//		}else{
//			System.out.println("yes");
//		}
	}
}
