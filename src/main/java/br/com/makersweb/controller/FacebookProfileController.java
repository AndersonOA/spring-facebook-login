/* 
 * 
 * 2016 All Rights Reserved MakersWeb.
 * 
 */
package br.com.makersweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Anderson O. Aristides
 * @created 20/11/2016
 *
 */
@Controller
public class FacebookProfileController {
	
	@Autowired
	private ConnectionRepository connectionRepository;
	
	@RequestMapping(value="/facebook", method=RequestMethod.GET)
	public String home(Model model) {
		Connection<Facebook> connection = connectionRepository.findPrimaryConnection(Facebook.class);
		if (connection == null) {
			return "redirect:/connect/facebook";
		}
		model.addAttribute("profile", connection.getApi().userOperations().getUserProfile());
		return "facebook/profile";
	}

}
