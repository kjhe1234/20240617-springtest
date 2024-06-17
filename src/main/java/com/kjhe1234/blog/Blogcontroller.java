package com.kjhe1234.blog;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Blogcontroller {
	
	@RequestMapping(value = "/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/sample")
	public String sample() {
		return "sample1";
	}
	
	@RequestMapping(value = "/member")
	public String member() {
		return "user/member";  // 특정 폴더 내의 jsp 파일 실행
	}
	
	@RequestMapping(value = "/sample2")
	public String sample2() {
		return "sample2";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/loginOk")
	public String loginOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("memberid");
		String mpw = request.getParameter("memberpw");
		
		model.addAttribute("loginid", mid);
		model.addAttribute("loginpw", mpw);
		model.addAttribute("user","홍길동");
		
		
		return "loginOk";
	}
	
	
	
	
	
}
