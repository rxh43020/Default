package com.sanyang.myhandler;

import java.util.List;
import java.util.Map;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sanyang.mybean.Air;
import com.sanyang.mydao.AirDao;
import com.sanyang.mydao.AirDaoImp;

@Controller
public class AirHandler {
	@Autowired
	private AirDaoImp dao;
	@RequestMapping("/getAll")
	public ModelAndView name() {
		ModelAndView mv=new ModelAndView(); 
		mv.addObject("list", dao.getAll());
		mv.setViewName("Air");
		return mv;
	}
	@RequestMapping("/addair")
	public String add(@Valid Air air,BindingResult br) {
		List<ObjectError> allErrors = br.getAllErrors();
		if (allErrors.size()>0) {
			for (ObjectError objectError : allErrors) {
				System.out.println(objectError.getDefaultMessage());
			}
			return "add";
		}else {
			dao.add(air);
//			÷ÿ∂®œÚ
			return "redirect:getAll.sw";
		}
		

	}
	
	@RequestMapping("/getId")
	public ModelAndView getAirbyId(Integer aid) {
		ModelAndView mv=new ModelAndView();
		Air airbyId = dao.getAirbyId(aid);
		mv.addObject("airbyId",airbyId);
		mv.setViewName("updAir");
		return mv;
	}
	
	@RequestMapping("/updAir")
	public String updAir(Air air) {
	
		dao.updAir(air);
		
		return "redirect:getAll.sw";
	}
	
	
	

}
