package com.example.demo.dao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.example.demo.mapper.EntertainmentMapper;
import com.example.demo.model.Entertainment;
import com.example.demo.model.User;


@Component
public class EntertainmentDao {
	private JdbcTemplate jdbcTemplate;
	public EntertainmentDao() {
		DriverManagerDataSource dataSource=new  DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/goldenticket?serverTimezone=GMT");
		dataSource.setUsername("root");
		dataSource.setPassword("amnay.mou2002");
		jdbcTemplate=new JdbcTemplate(dataSource);
	}
	public List<Entertainment> getAllentertainment(){
		String sql="select * from entertainment";
		List<Entertainment> entertainments=jdbcTemplate.query(sql, new EntertainmentMapper());
		return entertainments;
	}
	
	public int addNewEntertainment(Entertainment b) {
	    String sql = "INSERT INTO entertainment ( `name`, `phone`, `address`, `time`, `price`, `city`, `role`, `details`, `pic1`, `pic2`, `pic3`, `pic4`, `pic5`, `pic6`, `pic7`) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	    Object params[] = { b.getName(), b.getPhone(), b.getAddress(), b.getTime(), b.getPrice(), b.getCity(), b.getRole(), b.getDetails(),
	    		b.getPic1(), b.getPic2(), b.getPic3(), b.getPic4(), b.getPic5(), b.getPic6(), b.getPic7()};
	    return jdbcTemplate.update(sql, params);
	}
	
	public List<Entertainment> getentertainment(int id){
		String sql="select * from entertainment where idevent="+id;
		List<Entertainment> entertainments=jdbcTemplate.query(sql, new EntertainmentMapper());
		return entertainments;
	}
	
	public List<Entertainment> getbookcatgory(int ctg){
		String sql="select * from entertainment where role="+ctg;
		List<Entertainment> entertainments=jdbcTemplate.query(sql, new EntertainmentMapper());
		return entertainments;
	}
	
	public List<Entertainment> getmovie(int ct){
		String sql="select * from entertainment where role= 1";
		List<Entertainment> entertainments=jdbcTemplate.query(sql, new EntertainmentMapper());
		return entertainments;
	}
	
	public int addanewUser(User u) {
		String sql="insert into users(Email, password, firstname, lastname, role) values(?, ?, ?, ?, 1)";
		Object params[] = {u.getEmail(), u.getPassword(), u.getFirstname(), u.getLastname()};
		return jdbcTemplate.update(sql, params);
	}
	
	public int updateid(int id, float price) {
	    String sql = "update entertainment set price = ? where idevent = ?";
	    Object params[] = {price, id};
	    return jdbcTemplate.update(sql, params);
	}
	
	public int deleteById(int id) {
		String sql="delete from entertainment where idevent=?";
		Object params[]= {id};
		return jdbcTemplate.update(sql,params);
	}
	
	public List<Entertainment> GetID(int id){
		String sql="select * from entertainment where idevent="+id;
		List<Entertainment> entertainments=jdbcTemplate.query(sql, new EntertainmentMapper());
		return entertainments;
	}
	
	public int updateEntairbyid(Entertainment b) {
	    String sql = "update entertainment set name = ?, phone = ?, address=?, time=?, city=?, price = ?, role = ?, details = ?, pic1 = ?, pic2 = ?, pic3 = ?, pic4 = ?, pic5 = ?, pic6 = ?, pic7 = ? where idevent = ?";
	    Object params[] = {b.getName(), b.getPhone(), b.getAddress(), b.getTime(), b.getPrice(), b.getCity(), b.getRole(), b.getDetails(),
	    		b.getPic1(), b.getPic2(), b.getPic3(), b.getPic4(), b.getPic5(), b.getPic6(), b.getPic7(), b.getIdevent()};
	    return jdbcTemplate.update(sql, params);
	}

}













