package com.teogong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teogong.model.GoChonDao;
import com.teogong.model.MenuVo;

@Service("goChonService")
public class GoChonScvImpl implements GoChonService{

	@Autowired
	GoChonDao goChonDao;
	
	@Override
	public MenuVo getChichkenMenu(int CKno) {
		// TODO Auto-generated method stub
		MenuVo menu = goChonDao.selectChicken(CKno);
		return menu;
	}
	
}
