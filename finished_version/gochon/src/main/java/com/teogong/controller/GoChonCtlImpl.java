package com.teogong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teogong.model.EventVo;
import com.teogong.model.MenuVo;
import com.teogong.service.GoChonService;

@Controller("goChonController")
@RequestMapping("/gochon")
public class GoChonCtlImpl implements GoChonController {

	@Autowired
	GoChonService goChonService;

	@Autowired
	MenuVo menuVo;
	
	@Autowired
	EventVo eventVo;
	
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
	
	@Override
	@GetMapping("/add")
	public String writeEvent() throws Exception {
		// TODO Auto-generated method stub
		return "eventwrtie";
	}
	
	@Override
	@PostMapping(value="/addevent")
	public String addEvent(String title, String img, String content, String date_s, String date_e) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("view debug1");
		eventVo.setEvent_title(title);
		System.out.println("view debug2");
		eventVo.setEvent_img(img);
		System.out.println("view debug3");
		eventVo.setEvent_contents(content);
		System.out.println("view debug4");
		eventVo.setEvent_write_date_s(date_s);
		System.out.println("view debug5");
		eventVo.setEvent_write_date_e(date_e);
		System.out.println("view debug6");
		eventVo.setEvent_situation("1");
		System.out.println("view debug7");
		eventVo.setEvent_write_id("운영자");
		System.out.println("view debug8");
		
		goChonService.addEvent(eventVo);//this is error
		System.out.println("view debug9");
		
		return "redirect:listevent";
	}
	
	@Override
	@RequestMapping(value = "/view",method = RequestMethod.GET)
	public ModelAndView viewEvent(String eventNo) throws Exception {
		// TODO Auto-generated method stub
		eventVo = goChonService.viewEvent(Integer.parseInt(eventNo));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventview");
		mv.addObject("article",eventVo);

		return mv;
	}
	
	
	@Override
	@GetMapping("/beer")
	public String beer() throws Exception {
		// TODO Auto-generated method stub
		return "beer";

	}

	@Override
	@GetMapping("/beer1")
	public String beer1() throws Exception {
		// TODO Auto-generated method stub
		return "beer1";
	}

	@Override
	@GetMapping("/bscr")
	public String bscr() throws Exception {
		// TODO Auto-generated method stub
		return "bscr";
	}
	@Override
	@GetMapping("/bscr1")
	public String bscr1() throws Exception {
		// TODO Auto-generated method stub
		return "bscr1";
	}
	@Override
	@GetMapping("/bso")
	public String bso() throws Exception {
		// TODO Auto-generated method stub
		return "bso";
	}

	@Override
	@GetMapping("/bssoonsal")
	public String bssoonsal() throws Exception {
		// TODO Auto-generated method stub
		return "bssoonsal";
	}
	@Override
	@GetMapping("/bssoonsal1")
	public String bssoonsal1() throws Exception {
		// TODO Auto-generated method stub
		return "bssoonsal1";
	}
	
//	@GetMapping("/{num}")
//	public String bk(Model model,@PathVariable("num") int CKno) throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("view debug1");
//		menuVo = goChonService.getChichkenMenu(CKno);
//		System.out.println("view debug2");
//		model.addAttribute("chichken", menuVo);
//		System.out.println("view debug3");
//		return "bk";
//	}

	@Override
	@GetMapping("/bk")
	public String bk() throws Exception {
		// TODO Auto-generated method stub
		return "bk";
	}

	@Override
	@GetMapping("/bk1")
	public String bk1() throws Exception {
		// TODO Auto-generated method stub
		return "bk1";
	}
	@Override
	@GetMapping("/kc")
	public String kc() throws Exception {
		// TODO Auto-generated method stub
		return "kc";
	}

	@Override
	@GetMapping("/kco")
	public String kco() throws Exception {
		// TODO Auto-generated method stub
		return "kco";
	}
	@Override
	@GetMapping("/cf")
	public String cf() throws Exception {
		// TODO Auto-generated method stub
		return "cf";
	}
	@Override
	@GetMapping("/fcs")
	public String fcs() throws Exception {
		// TODO Auto-generated method stub
		return "fcs";
	}
	@Override
	@GetMapping("/cf1")
	public String cf1() throws Exception {
		// TODO Auto-generated method stub
		return "cf1";
	}

	
}
