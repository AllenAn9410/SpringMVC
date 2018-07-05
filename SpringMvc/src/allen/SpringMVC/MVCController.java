package allen.SpringMVC;

import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mvc")
public class MVCController {
	
	private final AtomicLong counter = new AtomicLong();
	
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
			MVCException e = new MVCException("info is not correct");
		    req.getSession().setAttribute("err_msg",e.getMessage());
			return "loginIndex";
		}
		System.out.println("check pass");
		return "loginSuccess";
	}
	
	@RequestMapping("/json")
	public UserInfo uInfo(@RequestParam("name")String name) {
		System.out.println(" in json ");
		return new UserInfo(counter.incrementAndGet(),
				name);
	}
}
