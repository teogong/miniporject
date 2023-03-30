package com.teogong.model;

import org.springframework.stereotype.Component;

@Component("eventVo")
public class EventVo {
	private int event_no;
	private String event_title;
	private String event_img;
	private String event_contents;
	private String event_write_date_s;
	private String event_write_date_e;
	private String event_situation;
	private String event_write_id;
	
	public int getEvent_no() {
		return event_no;
	}
	public void setEvent_no(int event_no) {
		this.event_no = event_no;
	}
	public String getEvent_title() {
		return event_title;
	}
	public void setEvent_title(String event_title) {
		this.event_title = event_title;
	}
	public String getEvent_img() {
		return event_img;
	}
	public void setEvent_img(String event_img) {
		this.event_img = event_img;
	}
	public String getEvent_contents() {
		return event_contents;
	}
	public void setEvent_contents(String event_contents) {
		this.event_contents = event_contents;
	}
	public String getEvent_write_date_s() {
		return event_write_date_s;
	}
	public void setEvent_write_date_s(String event_write_date_s) {
		this.event_write_date_s = event_write_date_s;
	}
	public String getEvent_write_date_e() {
		return event_write_date_e;
	}
	public void setEvent_write_date_e(String event_write_date_e) {
		this.event_write_date_e = event_write_date_e;
	}
	public String getEvent_situation() {
		return event_situation;
	}
	public void setEvent_situation(String event_situation) {
		this.event_situation = event_situation;
	}
	public String getEvent_write_id() {
		return event_write_id;
	}
	public void setEvent_write_id(String event_write_id) {
		this.event_write_id = event_write_id;
	}
	
	
	
}
