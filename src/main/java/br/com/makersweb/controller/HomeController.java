/* 
 * 
 * 2016 All Rights Reserved MakersWeb.
 * 
 */
package br.com.makersweb.controller;

import java.security.Principal;

import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.makersweb.repository.IAccountRepository;

/**
 *
 * @author Anderson O. Aristides
 * @created 20/11/2016
 *
 */
@Controller
public class HomeController {

	private final Provider<ConnectionRepository> connectionRepositoryProvider;
	private final IAccountRepository accountRepository;
	
	@Autowired
	public HomeController(Provider<ConnectionRepository> connectionRepositoryProvider, IAccountRepository accountRepository) {
		this.connectionRepositoryProvider = connectionRepositoryProvider;
		this.accountRepository = accountRepository;
	}
	
	@RequestMapping("/")
	public String home(Principal currentUser, Model model) {
		model.addAttribute("connectionsToProviders", getConnectionRepository().findAllConnections());
		model.addAttribute(accountRepository.findAccountByUserName(currentUser.getName()));
		return "home";
	}
	
	private ConnectionRepository getConnectionRepository() {
		return connectionRepositoryProvider.get();
	}

}
