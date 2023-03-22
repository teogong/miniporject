package com.teogong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teogong.model.MenuVo;
import com.teogong.service.GoChonScvImpl;

@Controller("goChonController")
@RequestMapping("/gochon")
public class GoChonCtlImpl implements GoChonController {

	@Autowired
	GoChonScvImpl goChonService;

	@Autowired
	MenuVo menuVo;

	@Override
	@GetMapping("/search")
	public String viewSearch() throws Exception {
		// TODO Auto-generated method stub
		return "search";
	}

	@Override
	@PostMapping("/view")
	public String getChicken(Model model,String CKno) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("view debug1");
		menuVo = goChonService.getChichkenMenu(Integer.parseInt(CKno));
		System.out.println("view debug2");
		model.addAttribute("chichken", menuVo);
		System.out.println("view debug3");
		return "view";
	}

	@Override
	@GetMapping("/main")
	public String main() throws Exception {
		// TODO Auto-generated method stub
		return "main";
	}
	
	

}
