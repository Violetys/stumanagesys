package controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.Stu;
import mapper.StuMapper;
import service.UserService;

@Controller
@RequestMapping("/user")
public class SloginController {

	@Autowired
	private UserService userService;
	@Autowired
	private HttpSession session;

	@RequestMapping("/")
	public String index() {
		return "user/userLogin";
	}  

	@RequestMapping("/login")
	public String login(Stu stu) {
		if(userService.loginCheck(stu.getStu_id(), stu.getStu_pwd())) {			
			session.setAttribute("stu_id", stu.getStu_id());
			return "redirect:/user/main";
		}
		else {
			return "redirect:/user/";
		}
	}

	@RequestMapping("/main")
	public String qw() {
		return "user/main";
	}

}
