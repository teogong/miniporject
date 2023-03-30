package com.teogong.model;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("goChonDao")
public interface GoChonDao {
	public MenuVo selectChicken(int CKno) throws DataAccessException;
}