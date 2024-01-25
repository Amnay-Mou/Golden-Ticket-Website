package com.example.demo.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Entertainment {
			private Integer idevent;
			private String name;
			private String phone;
			private String address;
			private String time;
			private float price;
			private String city;
			private Integer role;
			private String details;
			private String pic1;
			private String pic2;
			private String pic3;
			private String pic4;
			private String pic5;
			private String pic6;
			private String pic7;
			
			public Integer getIdevent() {
				return idevent;
			}
			public void setIdevent(Integer idevent) {
				this.idevent = idevent;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getPhone() {
				return phone;
			}
			public void setPhone(String phone) {
				this.phone = phone;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getTime() {
				return time;
			}
			public void setTime(String time) {
				this.time = time;
			}
			public float getPrice() {
				return price;
			}
			public void setPrice(float price) {
				this.price = price;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public Integer getRole() {
				return role;
			}
			public void setRole(Integer role) {
				this.role = role;
			}
			public String getDetails() {
				return details;
			}
			public void setDetails(String details) {
				this.details = details;
			}
			public String getPic1() {
				return pic1;
			}
			public void setPic1(String pic1) {
				this.pic1 = pic1;
			}
			public String getPic2() {
				return pic2;
			}
			public void setPic2(String pic2) {
				this.pic2 = pic2;
			}
			public String getPic3() {
				return pic3;
			}
			public void setPic3(String pic3) {
				this.pic3 = pic3;
			}
			public String getPic4() {
				return pic4;
			}
			public void setPic4(String pic4) {
				this.pic4 = pic4;
			}
			public String getPic5() {
				return pic5;
			}
			public void setPic5(String pic5) {
				this.pic5 = pic5;
			}
			public String getPic6() {
				return pic6;
			}
			public void setPic6(String pic6) {
				this.pic6 = pic6;
			}
			public String getPic7() {
				return pic7;
			}
			public void setPic7(String pic7) {
				this.pic7 = pic7;
			}
			@Override
			public String toString() {
				return "entertainment [idevent=" + idevent + ", name=" + name + ", phone=" + phone + ", address=" + address
						+ ", time=" + time + ", price=" + price + ", city=" + city + ", role=" + role + ", details="
						+ details + ", pic1=" + pic1 + ", pic2=" + pic2 + ", pic3=" + pic3 + ", pic4=" + pic4
						+ ", pic5=" + pic5 + ", pic6=" + pic6 + ", pic7=" + pic7 + "]";
			}
			
}
