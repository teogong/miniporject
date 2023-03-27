package com.teogong.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("eventDao")
public interface EventDao {
	public List<EventVo> selectAllEvents() throws DataAccessException;
}
