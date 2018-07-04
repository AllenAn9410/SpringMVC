package allen.SpringMVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mvc")
public class MVCController {
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("hello");
		return "hello";
	}
	
	@RequestMapping("/loginIndex.index")
	public String loginIndex() {
		System.out.println("login index page");
		return "loginIndex";
	}
	
	@RequestMapping("/login.index")
	public String login(@RequestParam("name")String name,
			@RequestParam("password")String password,
			HttpServletRequest req) {
		System.out.println("login check name="+ name + ", password = "+ password);
		if ( Tool.isEmpty(name) || Tool.isEmpty(password)) {
			Exception e = new Exception("info is not correct");
		    req.getSession().setAttribute("err_msg",e.getMessage());
			return "loginIndex";
		}
		System.out.println("check pass");
		return "loginSuccess";
	}
}
