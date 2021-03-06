/* 
 * 
 * 2016 All Rights Reserved MakersWeb.
 * 
 */
package br.com.makersweb.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialUser;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;

/**
 *
 * @author Anderson O. Aristides
 * @created 20/11/2016
 *
 */
public class SimpleSocialUsersDetailService implements SocialUserDetailsService {

	private UserDetailsService userDetailsService;

	public SimpleSocialUsersDetailService(UserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	@Override
	public SocialUserDetails loadUserByUserId(String userId) throws UsernameNotFoundException {
		UserDetails userDetails = userDetailsService.loadUserByUsername(userId);
		return new SocialUser(userDetails.getUsername(), userDetails.getPassword(), userDetails.getAuthorities());
	}

}
