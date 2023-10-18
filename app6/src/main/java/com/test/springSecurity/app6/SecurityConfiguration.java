package com.test.springSecurity.app6;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.JdbcUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebSecurity
public class SecurityConfiguration implements WebMvcConfigurer {

	@Autowired
	private DataSource dataSourse;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity https) throws Exception {
		https.authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests.requestMatchers("/admin")
				.hasRole("admin").requestMatchers("/user").hasAnyRole("user", "admin").requestMatchers("/").permitAll()
				.anyRequest().authenticated()).formLogin((form) -> form.loginPage("/login").permitAll())
				.logout((logout) -> logout.permitAll());
		return https.build();
	}

	@Bean
	public JdbcUserDetailsManagerConfigurer<AuthenticationManagerBuilder> jdbcUserDetailsManagerConfigurer(
			AuthenticationManagerBuilder amb) throws Exception {
		return amb.jdbcAuthentication().dataSource(this.dataSourse);
	}

}
