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
 * ������д����
 * 	1.ʵ��һ���ӿ�	������		Controller	ʹ�÷���ֵ��ת
 * 	2.			������		�̳� extends AbstractController
 * 			ModelAndView mv = new ...
 * 			mv.setViewName("....jsp") return...
 * 	3.			������		HttpRequesHandler
 * 			ǰ����һ����ֻ��һ�����ܣ���ͳ��servlet
 * 	4.			������		
 * 						
 * 
 * @author Administrator
 *
 *//*
public class FirstController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		System.out.println("����������?==============");
		
		
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
	 * ���յĲ�����֧��Vo���󵼺�ͼ	
	 * 
	 * ȱʲô��������Ҫʲô�������ÿ������ķ�������װ��servlet ��
	 * ��Ϊ�ڲ�ʹ�õ���forwardת������ض���redirect
	 * �������ŵ���ǰ���ӵ�setAttribute�У���ҳ�����ʹ��EL���ʽȡ��
	 * 
	 * ������Map��Model
	 * 
	 * ����jdbc����
	 */
		System.out.println(user);
		/**
		 * ������������ΪMap��ֵ�ķ�ʽ��������ȡ�ķ�ʽ������ʹ��
		 * ���������������£��������������ݼ��ܴ���
		 */
		model.addAttribute(user.getUsername());
		
		map.put("username", user.getUsername());
		map.put("passwd", user.getPasswd());
		map.put("email", user.getEmail());
		/**
		 * �Ƽ�ʹ��Map���ϵķ���
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


