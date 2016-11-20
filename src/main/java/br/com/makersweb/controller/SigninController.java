/* 
 * 
 * 2016 All Rights Reserved MakersWeb.
 * 
 */
package br.com.makersweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Anderson O. Aristides
 * @created 20/11/2016
 *
 */
@Controller
public class SigninController {
	
	@RequestMapping(value="/signin", method=RequestMethod.GET)
	public String signin() {
		return "signin/signin";
	}

}
