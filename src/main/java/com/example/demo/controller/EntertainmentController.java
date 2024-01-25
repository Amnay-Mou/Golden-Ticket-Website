package com.example.demo.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EntertainmentDao;
import com.example.demo.model.Entertainment;

@Controller
public class EntertainmentController {
	
	@Autowired
	private EntertainmentDao entertainmentDao;
	
	@RequestMapping("/homeadmin")
	public String getAllBook(Model m) {
		m.addAttribute("allentert", entertainmentDao.getAllentertainment());
		return "/admin/homeadmin";
	}
	
	@RequestMapping("/allhome")
	public String HOME(Model m) {
		m.addAttribute("all", entertainmentDao.getAllentertainment());
		return "main";
	}
	
	@RequestMapping("/allmovies")
	public String AllMovie(Model m) {
		m.addAttribute("allmovie", entertainmentDao.getAllentertainment());
		return "allmovie";
	}
	
	@RequestMapping("/allevents")
	public String AllEvent(Model m) {
		m.addAttribute("allevent", entertainmentDao.getAllentertainment());
		return "events";
	}
	
	@RequestMapping("/allsports")
	public String AllSport(Model m) {
		m.addAttribute("allsprt", entertainmentDao.getAllentertainment());
		return "sports";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/addnewbk")
	public String AddBooks(Entertainment b) {
		return "/admin/addentertainment";
	}
	
	//------------------------Movie----------------
	@RequestMapping("/movieticket")
	public String movie(Model m, int id) {
		m.addAttribute("numtkts", entertainmentDao.getentertainment(id));
		return "movieticket";
	}
	
	@RequestMapping("/movieseat")
	public String movieseat(Model m, int id) {
		m.addAttribute("numseat", entertainmentDao.getentertainment(id));
		return "movieseat";
	}
	
	@RequestMapping("/movietkt")
	public String movietkt(Model m, int id) {
		m.addAttribute("numtkt", entertainmentDao.getentertainment(id));
		return "movietktcheck";
	}
	
	//------------------------Sport----------------
	
	@RequestMapping("/sporttkt")
	public String Sptkt(Model m, int id) {
		m.addAttribute("numSptkt", entertainmentDao.getentertainment(id));
		return "sportstkt";
	}
	
	@RequestMapping("/sporttktfinal")
	public String SptktFn(Model m, int id) {
		m.addAttribute("numSptktFn", entertainmentDao.getentertainment(id));
		return "sportscheckout";
	}
	
	//------------------------Event----------------
	@RequestMapping("/eventcheck")
	public String Evcheck(Model m, int id) {
		m.addAttribute("numEvtkt", entertainmentDao.getentertainment(id));
		return "eventkt";
	}
	
	
	@RequestMapping("/eventtkt")
	public String tktevent(Model m, int id) {
		m.addAttribute("numEvtkts", entertainmentDao.getentertainment(id));
		return "eventcheckout";
	}
	//----------------------------------------------------------------
	@RequestMapping("/addnewbook")
	public String AddBook(Entertainment b) {
		entertainmentDao.addNewEntertainment(b);
		return "/adminconfigue";
	}
	
	@RequestMapping("/registepage")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/admin/delete")
	public String dlt(int id) {
		entertainmentDao.deleteById(id);
		return "/admin/delete";
	}
	
	@RequestMapping("/admin/update")
	public String upd(int id, float price) {
		entertainmentDao.updateid(id, price);
		return "/admin/homead";
	}
	
	/*@RequestMapping("/getid")
	public String getBookById(int id) {
		return "/bookdetails";
	}*/
	
	@RequestMapping("/pgaboutws")
	public String aboutWebsite() {
		return "about";
	}
	
	@RequestMapping("/getidd")
	public String GetIDs(Model m,int id) {
		m.addAttribute("numevent", entertainmentDao.getentertainment(id));
		//--------------------------------------------
		entertainmentDao.GetID(id);
		return "/admin/update2";
	}
	
	@RequestMapping("/updt")
	public String UpdateeBook(Entertainment b) {
		//--------------------------------------------
		entertainmentDao.updateEntairbyid(b);
		return "/admin/homeadmin";
	}
	
	//ADD
	/*@RequestMapping("/getmovieid")
	public String getmovieById(int id) {
		return "/moviedtl";
	}
	
	@RequestMapping("/geteventeid")
	public String geteventById(int id) {
		return "/eventdtls";
	}
	
	@RequestMapping("/getsportid")
	public String getsportById(int id) {
		return "/sportdtls";
	}*/
	
	/*@RequestMapping("/movieseats")
	public String getSeat() {
		return "/movieseat";
	}
	
	@RequestMapping("/tktcheck")
	public String getTktCheck() {
		return "/movietktcheck";
	}*/
}
