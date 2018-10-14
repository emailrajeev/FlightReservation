package com.rajeev.flightReservation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rajeev.flightReservation.Repo.FlightRepogietrery;
import com.rajeev.flightReservation.entity.Flight;

@Controller
public class ReservationControl {
	@Autowired
	FlightRepogietrery repo;
	@RequestMapping("/showCompliteReservation")
	public String showCompleteReservationpublic(@RequestParam("flightId")Long flightid,ModelMap modelmap) {
		Flight flight = repo.findOne(flightid);
		modelmap.addAttribute("flight", flight);
		return "compliteReservation";
	}
	
}