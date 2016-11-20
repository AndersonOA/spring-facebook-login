/* 
 * 
 * 2016 All Rights Reserved MakersWeb.
 * 
 */
package br.com.makersweb.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.UserIdSource;

/**
 *
 * @author Anderson O. Aristides
 * @created 20/11/2016
 *
 */
public class AuthenticationUserIdExtractor implements UserIdSource {

	@Override
	public String getUserId() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		if (authentication == null) {
			throw new IllegalStateException("Unable to get a ConnectionRepository: no user signed in");
		}

		return authentication.getName();
	}

}
