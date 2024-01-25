package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.EntertainmentDao;

@Controller
public class HomeEntertainmentController {
	
	@Autowired
	private EntertainmentDao entertainmentDao;
	
	
	// Path To Details(movie/event/sport) ------------------------------
	@RequestMapping("/moviedetails")
	public String getBookbyId(Model m, int id) {
		m.addAttribute("numovie", entertainmentDao.getentertainment(id));
		return "/moviedtl";
	}
	
	@RequestMapping("/eventdetails")
	public String getmoviebyId(Model m, int id) {
		m.addAttribute("numevent", entertainmentDao.getentertainment(id));
		return "/eventdtls";
	}
	
	@RequestMapping("/sportdetails")
	public String geteventbyId(Model m, int id) {
		m.addAttribute("numsport", entertainmentDao.getentertainment(id));
		return "/sportdtls";
	}
	//----------------------------------------------------------------
	/*@RequestMapping("/bookdctg")
	public String getcartBook(Model m) {
		m.addAttribute("numbookcat", entertainmentDao.getbookcatgory(1));
		return "/home1";
	}
	
	@RequestMapping("/bookdctg2")
	public String getcart2Book(Model m) {
		m.addAttribute("numbookcat", entertainmentDao.getbookcatgory(2));
		return "/home1";
	}
	
	@RequestMapping("/bookdctg3")
	public String getcart3Book(Model m) {
		m.addAttribute("numbookcat", entertainmentDao.getbookcatgory(3));
		return "/home1";
	}*/
}
