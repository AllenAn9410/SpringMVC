package allen.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController{
//	public ModelAndView handleRequest(HttpServletRequest req,
//			HttpServletResponse resp) throws Exception {
//		System.out.println("Accept the request");
//		ModelAndView mv =new ModelAndView("hello") ;
//		return mv;
//	}
	@RequestMapping("/hello.form")
	public String excute(){
		System.out.println("执行helloController");
		return "hello";
	}
}
