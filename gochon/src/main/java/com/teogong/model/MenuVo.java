package com.teogong.model;

import org.springframework.stereotype.Component;

@Component("menuVo")
public class MenuVo {
	private int chichken_no; //치킨 고유번호 
	private String chicken_name; // 치킨 이름
	private int price; // 치킨 가격 
	private String update_day; // 치킨 업데이트 날짜 
	private String origin; // 치킨 원산지 
	public int getChichken_no() {
		return chichken_no;
	}
	public void setChichken_no(int chichken_no) {
		this.chichken_no = chichken_no;
	}
	public String getChicken_name() {
		return chicken_name;
	}
	public void setChicken_name(String chicken_name) {
		this.chicken_name = chicken_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUpdate_day() {
		return update_day;
	}
	public void setUpdate_day(String update_day) {
		this.update_day = update_day;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
}
