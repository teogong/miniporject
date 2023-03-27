package com.teogong.model;

import org.springframework.stereotype.Component;

@Component("eventVo")
public class EventVo {
	private int event_no;
	private String event_title;
	private String event_contents;
	private String event_write_date;
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
	public String getEvent_contents() {
		return event_contents;
	}
	public void setEvent_contents(String event_contents) {
		this.event_contents = event_contents;
	}
	public String getEvent_write_date() {
		return event_write_date;
	}
	public void setEvent_write_date(String event_write_date) {
		this.event_write_date = event_write_date;
	}
	public String getEvent_write_id() {
		return event_write_id;
	}
	public void setEvent_write_id(String event_write_id) {
		this.event_write_id = event_write_id;
	}
	
	
}
