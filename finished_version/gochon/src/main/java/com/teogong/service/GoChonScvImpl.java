package com.teogong.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.teogong.model.EventDao;
import com.teogong.model.EventVo;
import com.teogong.model.GoChonDao;
import com.teogong.model.MenuVo;

@Service("goChonService")
public class GoChonScvImpl implements GoChonService{

	@Autowired
	GoChonDao goChonDao;
	
	@Autowired
	EventDao eventDao;
	
	Logger logger = LoggerFactory.getLogger("com.teogong.service.GoChonScvImpl");
	
	@Override
	public MenuVo getChichkenMenu(int CKno) {
		// TODO Auto-generated method stub
		MenuVo menu = goChonDao.selectChicken(CKno);
		return menu;
	}

	@Override
	public List<EventVo> listEvent() throws DataAccessException {
		// TODO Auto-generated method stub
		List<EventVo> evnetList = eventDao.selectAllEvents();
		return evnetList;
	}

	@Override
	public void addEvent(EventVo eventVo) throws DataAccessException {
		// TODO Auto-generated method stub
System.out.println("debug1");
		logger.debug("=====> addEvent: eventNo: "+ eventVo.getEvent_no());
		eventDao.insertEvent(eventVo);//this is error
		System.out.println("debug2");
	}
	
	@Override
	public EventVo viewEvent(int eventNo) {
		logger.debug("=====> viewArticle: articleNo: "+ eventNo);
		EventVo article = eventDao.selectEvent(eventNo);
		return article;
	}
	
	
	
}
