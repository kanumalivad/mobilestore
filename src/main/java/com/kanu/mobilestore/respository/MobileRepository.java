package com.kanu.mobilestore.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kanu.mobilestore.entity.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Long>{
	Optional<Mobile> findById(Long id);
}
