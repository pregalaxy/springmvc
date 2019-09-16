package com.bank.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bank.pojo.Temp;

@Mapper
public interface TempDAO {

	@Select("select * from temp  where aa = #{id}")
	public Temp selectTemp(int id);
	
	@Select("select * from temp")
	public List<Map<String,String>> selectAll();
}
