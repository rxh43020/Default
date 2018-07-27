package com.sanyang.mydao;

import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.mybean.Air;
import com.sanyang.mymapper.AirMapper;
@Repository("dao")
public class AirDaoImp implements AirDao{
//	×¢Èë¶ÔÏó
	@Autowired
	private AirMapper airMapper;

	@Override
	public List<Air> getAll() {
	    try {
	    	List<Air> all = airMapper.getAll();
	    	
	    	return all;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void add(Air air) {
		airMapper.add(air);
		
	}

	@Override
	public Air getAirbyId(Integer aid) {
		Air airbyId = airMapper.getAirbyId(aid);
		return airbyId;
	}

	@Override
	public void updAir(Air air) {
		airMapper.updAir(air);
		
	}

}
