package com.rajeev.flightReservation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.rajeev.flightReservation.entity.User;


public interface UserRepogietrery extends JpaRepository<User, Long> {
	@Query(value="select user(email) from user where email=?",nativeQuery = true)
	User findByEmail(String email);
}
