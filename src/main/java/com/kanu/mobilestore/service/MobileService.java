package com.kanu.mobilestore.service;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.kanu.mobilestore.entity.Mobile;

@Service
public interface MobileService  {
	Optional<Mobile> findById(Long mid);
}
