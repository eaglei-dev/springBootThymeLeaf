package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.expample.demo.User.UserData;

@Controller
public class UserController {
	@GetMapping("/users")
	String users(Model model){
		model.addAttribute("userlist", getUserList());
		return "userlist";
	}
	
	private List<UserData> getUserList(){
		List<UserData> userList = new ArrayList<UserData>();
		
		userList.add(new UserData("U1Name", 20, "uone@email.com"));
		userList.add(new UserData("U2Name", 21, "utwo@email.com"));
		
		return userList;
		
	}
}
