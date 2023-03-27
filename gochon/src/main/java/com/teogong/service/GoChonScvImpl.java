package com.teogong.service;

import java.util.List;

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
	
}
