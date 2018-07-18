package com.rajeev.flightReservation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rajeev.flightReservation.Repo.UserRepogietrery;
import com.rajeev.flightReservation.entity.User;

@Controller
public class UserController {
	@Autowired
	UserRepogietrery userRepogietrery;

	@RequestMapping("/show")
	public String showRegisterpage() {
		return "RegisterUser";
	}
	@RequestMapping(value="RegisterUser",method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		if(user.getFIRST_NAME()==null && user.getLAST_NAME()==null && user.getEMAIL()==null && user.getPASSWORD()==null) {
			return "RegisterUser";	
		}else {
			userRepogietrery.save(user);
		}
		return "login";

	}


	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("email")String email,@RequestParam("password") String password,ModelMap modelmap) {
		User user=userRepogietrery.findByEmail(email);
		if(user.getPASSWORD().equals(password)) {
			return "findFlight";
		}else {
			modelmap.addAttribute("msg","Invalid User Name And Password !!!-");
		}
		return "login";

	}

}