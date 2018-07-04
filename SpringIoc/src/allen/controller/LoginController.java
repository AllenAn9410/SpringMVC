package allen.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import allen.entity.User;
import allen.service.NameOrPwdException;
import allen.service.UserService;

@Controller
@RequestMapping("/allen")
public class LoginController {
	@Resource
	private UserService userService;
	@RequestMapping("/login.form")
	public String login(HttpServletRequest req){
		System.out.println("log:login");
		req.getSession().setAttribute("message","hello");
		return "index";
	}
	
	@RequestMapping("/login-action.form")
	public String loginForm(@RequestParam("user")String name,@RequestParam("password")String passord,
			HttpServletRequest req){
		System.out.println("log:check"+name+"  , "+passord);
//		String a = null;
//		a.length();
		User user = null;
		try {
			 user = userService.login(name, passord);
		} catch (NameOrPwdException e) {
			req.getSession().setAttribute("message",e.getMessage());
			return "index";
		} catch (RuntimeException e ){
			req.getSession().setAttribute("error",e.getMessage());
			return "error";
		}
		req.getSession().setAttribute("user",user);
		return "success";
	}

}
