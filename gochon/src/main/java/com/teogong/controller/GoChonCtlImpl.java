package com.teogong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teogong.model.EventVo;
import com.teogong.model.MenuVo;
import com.teogong.service.GoChonScvImpl;

@Controller("goChonController")
@RequestMapping("/gochon")
public class GoChonCtlImpl implements GoChonController {

	@Autowired
	GoChonScvImpl goChonService;

	@Autowired
	MenuVo menuVo;
	
	List<EventVo> eventboardlist;

	@Override //테스트 검색창 
	@GetMapping("/search")
	public String viewSearch() throws Exception {
		// TODO Auto-generated method stub
		return "search";
	}

	@Override //테스트 검색확인창 
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

	@Override  // 메인화면 
	@GetMapping({"/main","/"})
	public String main() throws Exception {
		// TODO Auto-generated method stub
		return "main";
	}

//	@Override
//	@GetMapping("/listevent")
//	public String getEventList(Model model) throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("view debug1");
//		eventboardlist = goChonService.listEvent();
//		System.out.println("view debug2");
//		model.addAttribute("dataList",eventboardlist);
//		System.out.println("view debug3");
//		return "eventlist";
//	}
	
	@Override
	@GetMapping("/listevent")
	public String getEventList(Model model) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("view debug1");
		eventboardlist = goChonService.listEvent();
		System.out.println("view debug2");
		model.addAttribute("dataList",eventboardlist);
		System.out.println("view debug3");
		return "eventlist";
	}
	
	

}
