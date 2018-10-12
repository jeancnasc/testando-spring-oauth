package br.com.jeannascimento.spring.oauth.client.config;

import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@Configuration
@EnableOAuth2Client
public class OAuthClientConfig {
	
	private String accessTokenUri = "http://localhost:8080/spring-oauth-auth-server/oauth/token";
	private String userAuthorizationUri = "http://localhost:8080/spring-oauth-auth-server/oauth/authorize";
	

	@Bean
	public OAuth2ProtectedResourceDetails details() {
		AuthorizationCodeResourceDetails details = new AuthorizationCodeResourceDetails();
		details.setId("servidor/cliente");
		details.setClientId("webapp-client");
		details.setClientSecret("secreto");
		details.setAccessTokenUri(accessTokenUri);
		details.setUserAuthorizationUri(userAuthorizationUri);
		details.setScope(Arrays.asList("read", "write"));
		details.setAuthenticationScheme(AuthenticationScheme.header);
		return details;
	}
	
	@Bean
	public OAuth2RestTemplate clienteOAuthRestTemplate(OAuth2ClientContext clientContext) {
		return new OAuth2RestTemplate(details(), clientContext);
	}
	
	
}
