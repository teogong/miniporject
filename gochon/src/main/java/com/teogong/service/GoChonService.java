package com.teogong.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.teogong.model.EventVo;
import com.teogong.model.MenuVo;

public interface GoChonService {
	public MenuVo getChichkenMenu(int CKno);
	public List<EventVo> listEvent() throws DataAccessException;
}
