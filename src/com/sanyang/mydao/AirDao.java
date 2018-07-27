package com.sanyang.mydao;

import java.util.List;

import com.sanyang.mybean.Air;

public interface AirDao {
	public List<Air> getAll();
	public void add(Air air);
	public Air getAirbyId(Integer aid);
	public void updAir(Air air);
}
