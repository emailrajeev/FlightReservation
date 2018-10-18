package com.rajeev.flightReservation.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rajeev.flightReservation.Repo.FlightRepogietrery;
import com.rajeev.flightReservation.entity.Flight;
@Controller
public class FlightController {
	@Autowired     
	FlightRepogietrery repo;
	@RequestMapping("findFlight")
	public String fingFlight(@RequestParam("from")String from,@RequestParam("to")String to,@RequestParam("depaartureDate")@DateTimeFormat(pattern="MM-dd-yyyy")Date depaartureDate,ModelMap modelmap){
		List<Flight> flight=repo.findFlight(from,to,depaartureDate);
		modelmap.addAttribute("flights", flight);   
			return "displayFlight";
	}
}
