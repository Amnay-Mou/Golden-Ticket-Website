package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Entertainment;

public class EntertainmentMapper implements RowMapper<Entertainment>{

	@Override
	public Entertainment mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Entertainment b=new Entertainment();
		b.setIdevent(rs.getInt("idevent"));
		b.setName(rs.getString("name"));
		b.setPhone(rs.getString("phone"));
		b.setAddress(rs.getString("address"));
		b.setTime(rs.getString("time"));
		b.setPrice(rs.getFloat("price"));
		b.setCity(rs.getString("city"));
		b.setRole(rs.getInt("role"));
		b.setDetails(rs.getString("details"));
		b.setPic1(rs.getString("pic1"));
		b.setPic2(rs.getString("pic2"));
		b.setPic3(rs.getString("pic3"));
		b.setPic4(rs.getString("pic4"));
		b.setPic5(rs.getString("pic5"));
		b.setPic6(rs.getString("pic6"));
		b.setPic7(rs.getString("pic7"));
		return b;
	}
}