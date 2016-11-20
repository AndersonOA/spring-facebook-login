/* 
 * 
 * 2016 All Rights Reserved MakersWeb.
 * 
 */
package br.com.makersweb.security;

import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;
import org.springframework.social.security.provider.OAuth2AuthenticationService;

/**
 *
 * @author Anderson O. Aristides
 * @created 20/11/2016
 *
 */
public class FacebookAuthenticationService extends OAuth2AuthenticationService<Facebook> {

	public FacebookAuthenticationService(String apiKey, String appSecret) {
		super(new FacebookConnectionFactory(apiKey, appSecret));
	}

}
