package com.rajeev.flightReservation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rajeev.flightReservation.Repo.FlightRepogietrery;
import com.rajeev.flightReservation.dto.ReservationRequest;
import com.rajeev.flightReservation.entity.Flight;
import com.rajeev.flightReservation.entity.Reservtion;
import com.rajeev.flightReservation.service.ReservationService;

@Controller
public class ReservationControl {
	@Autowired
	FlightRepogietrery repo;
	@Autowired
	ReservationService resSer;
	
	@RequestMapping("/showCompliteReservation")
	public String showCompleteReservationpublic(@RequestParam("flightId")Long flightid,ModelMap modelmap) {
		Flight flight = repo.findOne(flightid);
		modelmap.addAttribute("flight", flight);
		return "compliteReservation";
	}
	@RequestMapping(value="/compliteReservation",method=RequestMethod.POST)
	public String CompleteReservation(ReservationRequest request,ModelMap modelmap) {
		Reservtion reservation=resSer.bookFlight(request);
		modelmap.addAttribute("msg", "Reservation Create Sucessfuly and id is: "+reservation.getId());
		return "ReservationConfarmation";
	}
}