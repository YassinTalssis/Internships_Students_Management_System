package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;



@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "profile";
	}
	
	/*@GetMapping("/profile")
	public String updateProfile(@RequestParam("firstname") String firstname,
	                            @RequestParam("lastname") String lastname,
	                            @RequestParam("email") String email,
	                            @RequestParam("avatar") MultipartFile avatar,
	                            @RequestParam("password") String password) {
		model.addAttribute("student", new User());
		//model.addAttribute("listSts", listDepartements);
		model.addAttribute("added", true);
	    return "redirect:/profile";
	}*/
}
