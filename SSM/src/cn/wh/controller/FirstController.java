package cn.wh.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wh.pojo.User;

/*import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

*//**
 * 控制器写法：
 * 	1.实现一个接口	不常用		Controller	使用返回值跳转
 * 	2.			不常用		继承 extends AbstractController
 * 			ModelAndView mv = new ...
 * 			mv.setViewName("....jsp") return...
 * 	3.			不常用		HttpRequesHandler
 * 			前三种一个类只有一个功能：传统的servlet
 * 	4.			必须用		
 * 						
 * 
 * @author Administrator
 *
 *//*
public class FirstController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		System.out.println("到这里了吗?==============");
		
		
		return new ModelAndView("/WEB-INF/jsp/SayHello.jsp");
	}
	
}
*/
@Controller
public class FirstController {
	
	@RequestMapping("/sayHello")
//	public String sayHello(String username, String passwd) {
//		System.out.println("username=" + username + "passwd=" + passwd);
	public String sayHello(User user, BindingResult br,Map<String, String> map, Model model) {
	/**
	 * 接收的参数还支持Vo对象导航图	
	 * 
	 * 缺什么参数向框架要什么参数，该控制器的方法被封装到servlet 中
	 * 因为内部使用的是forward转向而非重定向redirect
	 * 参数被放到当前连接的setAttribute中，在页面可以使用EL表达式取出
	 * 
	 * 参数有Map和Model
	 * 
	 * 允许jdbc操作
	 */
		System.out.println(user);
		/**
		 * 这种用类型作为Map键值的方式，靠类型取的方式不建议使用
		 * 但是在特殊的情况下，可以用来做数据加密传递
		 */
		model.addAttribute(user.getUsername());
		
		map.put("username", user.getUsername());
		map.put("passwd", user.getPasswd());
		map.put("email", user.getEmail());
		/**
		 * 推荐使用Map集合的方法
		 */
		model.addAttribute("user", user);
		
		List<User> users = new ArrayList<User>();
		users.add(user);
		users.add(user);
		users.add(user);
		users.add(user);
		
		model.addAttribute("users", users);
		
		return "SayHello";
//		return "/WEB-INF/jsp/SayHello.jsp";
	}
	
}


