package kr.ac.hansung.whefe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.hansung.whefe.service.Cafe_infoService;

@Controller
public class ManagementController {
	
	@Autowired
	private Cafe_infoService cafe_infoService;
	
	@RequestMapping(value="/management/coupon")
	public String couponManagement() {
		return "couponManagement";
	}
	
	@RequestMapping(value="/management/order")
	public String orderManagement() {
		return "orderManagement";
	}
}
