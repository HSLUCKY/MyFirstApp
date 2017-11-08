package cn.wh.controller;

import java.util.List;
import java.util.Map;

import javax.security.auth.login.LoginException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.wh.pojo.User;
import cn.wh.regexGroups.CheckGroup;

@Controller
public class SecondController {
	
	@RequestMapping(value="/keepData", method=RequestMethod.GET)
	public String keepDataGet(@Validated(CheckGroup.class) User user, BindingResult br, Map<String, String> map, Model model) throws LoginException {
		
		if (br.hasErrors()) {
			List<ObjectError> list = br.getAllErrors();
			for (ObjectError objectError : list) {
				System.out.println(objectError.getDefaultMessage());
			}
		}
		
		
		
		System.out.println("========");
		
		return "keepDataTest";
		//return "redirect:/keepDataTest";
	}
	
	/**
	 * 通过注解接收页面参数跟明确
	 * 
	 * 也可以直接声明一个对象来接收但是这样很难看出页面数据结构，难以维护。
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/keepData", method=RequestMethod.POST)
	public String keepDataPost(@ModelAttribute("user") User user) {
		return "keepDataTest";
	}
}
