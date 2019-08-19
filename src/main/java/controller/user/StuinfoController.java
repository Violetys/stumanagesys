package controller.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.Stu;
import service.UserService;

@Controller
@RequestMapping("/user")
public class StuinfoController {

	@Autowired
	private HttpSession session;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/info")
	public String index() {
		int stu_id = (int) session.getAttribute("stu_id");
		Stu stu=userService.getStuById(stu_id);
		session.setAttribute("stu", stu);
		return "user/Userinfo";
	}
	
	@RequestMapping("/changepwd")
	public String changepwd() {
		int stu_id = (int) session.getAttribute("stu_id");
		String stu_pwd = (String) session.getAttribute("stu_pwd");
		boolean stu=userService.changepwd(stu_id,stu_pwd);
		session.setAttribute("stu", stu);
		return "user/Userinfo";
	}
	
}
