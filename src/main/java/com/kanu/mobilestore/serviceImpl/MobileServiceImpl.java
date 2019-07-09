package com.kanu.mobilestore.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.kanu.mobilestore.entity.Mobile;
import com.kanu.mobilestore.service.MobileService;

public class MobileServiceImpl implements MobileService{
	
	@Autowired
	MobileService mobile_service;
	
	@Override
	public Optional<Mobile> findById(Long mid) {
		return mobile_service.findById(mid);
	}
}
