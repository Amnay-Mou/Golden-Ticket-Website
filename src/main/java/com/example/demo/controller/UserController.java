package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.EntertainmentDao;
import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@Controller
public class UserController {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private EntertainmentDao entertainmentDao;
	
	@RequestMapping("/deallogin")
	public String deallogin(User user, Model m) {
		int role = userDao.checkUser(user);
		if(role==0)
			return "/adminconfigue";
		else if(role==1)
		{
			m.addAttribute("allevnts", entertainmentDao.getAllentertainment());
			return "/afterlog";}
		else {
			return "/404";}
	}
	
	@RequestMapping("/register")
	public String addUser(User u) {
		entertainmentDao.addanewUser(u);
		return "/login";
	}
	
	@RequestMapping("/allusers")
	public String backCfg() {
		return "/admin/alluserss";
	}
	
	@RequestMapping("/seealluser")
	public String getAllUsers(Model m) {
		m.addAttribute("alluser", userDao.getalluser());
		return "/admin/alluserss";
	}
	
	@RequestMapping("/deleteuser")
	public String dltUser(int id) {
		userDao.deleteusr(id);
		return "/admin/userdelete";
	}
}

