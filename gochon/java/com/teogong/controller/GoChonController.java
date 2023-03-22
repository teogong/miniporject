package com.teogong.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

public interface GoChonController {
	public String viewSearch() throws Exception;
	public String getChicken(Model model,@RequestParam(value="CKno") String ckno) throws Exception;
	public String main() throws Exception;
}

