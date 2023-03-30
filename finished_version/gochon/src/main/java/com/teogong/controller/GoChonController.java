package com.teogong.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface GoChonController {
	public String viewSearch() throws Exception;
	public String getChicken(Model model,@RequestParam(value="CKno") String ckno) throws Exception;
	public String main() throws Exception;
	
	public String getEventList(Model model) throws Exception;
	public String writeEvent() throws Exception;
	public String addEvent(@RequestParam(value="i_title") String title,
			@RequestParam(value="i_img") String img,
			@RequestParam(value="i_content") String content,
			@RequestParam(value="i_write_date_s") String date_s,
			@RequestParam(value="i_write_date_e") String date_e) throws Exception;
	public ModelAndView viewEvent(@RequestParam(value="no") String eventNo) throws Exception;
	
	public String bscr() throws Exception;
	public String bscr1() throws Exception;
	public String bso() throws Exception;
	public String bssoonsal() throws Exception;
	public String bssoonsal1() throws Exception;
	
	public String bk() throws Exception;
	public String bk1() throws Exception;
	public String kc() throws Exception;
	public String kco() throws Exception;
	public String cf() throws Exception;
	public String cf1() throws Exception;
	public String fcs() throws Exception;
	public String beer() throws Exception;
	public String beer1() throws Exception;

}

