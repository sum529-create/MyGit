package com.koreait.mybatis1.dao;

import java.util.List;

import com.koreait.mybatis1.dto.UsersDto;

public interface UsersDao {
	
	/*
	 * Dao는 mapper와 직접 연결됩니다.
	 * Dao의 메소드명 == mapper의 id
	 */
	
	public List<UsersDto> usersList();
	
	
	
}
