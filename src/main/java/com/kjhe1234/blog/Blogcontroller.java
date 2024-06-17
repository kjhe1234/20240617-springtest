package com.kjhe1234.blog;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kjhe1234.blog.dto.MemberDto;

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
	public String member(Model model) {
		
		model.addAttribute("mname","이순신");
		
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
	public String loginOk(@RequestParam("memberid") String mid,@RequestParam("memberpw") String mpw, Model model) {
		
//		String mid = request.getParameter("memberid");
//		String mpw = request.getParameter("memberpw");
		
		model.addAttribute("loginid", mid);
		model.addAttribute("loginpw", mpw);
		model.addAttribute("user","홍길동");
				
		return "loginOk";
	}
	
	
//	@RequestMapping(value = "/loginOk")
//	public ModelAndView loginOk(HttpServletRequest request, ModelAndView mv) {
//		
//		String mid = request.getParameter("memberid");
//		String mpw = request.getParameter("memberpw");
		
//		model.addAttribute("loginid", mid);
//		model.addAttribute("loginpw", mpw);
//		model.addAttribute("user","홍길동");
		
//		mv.addObject("loginid", mid);
//		mv.addObject("loginpw", mpw);
//		mv.addObject("user", "홍길동");
//		
//		mv.setViewName("loginOk");
//		
//		return mv;
//	}
	
	@RequestMapping(value = "/join")
	public String joun() {
		return "join";
	}
	
	@RequestMapping(value = "/joinOk")
	public String jounOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("memberid");
		String mpw = request.getParameter("memberpw");
		String mname = request.getParameter("membername");
		String mage = request.getParameter("memberage");
		String memail = request.getParameter("memberemail");
		
		MemberDto memberDto = new MemberDto(mid, mpw, mname, mage, memail);
		
		
//		model.addAttribute("mid", mid);
//		model.addAttribute("mpw", mpw);
//		model.addAttribute("mname", mname);
//		model.addAttribute("mage", mage);
//		model.addAttribute("memail", memail);
			
		model.addAttribute("mdto", memberDto);
		
		return "joinOk";
	}
	
	
	
}
