package com.rajeev.flightReservation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.rajeev.flightReservation.entity.User;

public interface UserRepogietrery extends JpaRepository<User, Long> {
	@Query(nativeQuery = true, value = "SELECT * FROM USER WHERE EMAIL = ?")
	User findByEmail(String email);
}
