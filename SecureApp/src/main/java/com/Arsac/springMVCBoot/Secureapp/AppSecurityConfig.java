package com.Arsac.springMVCBoot.Secureapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;





@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	@Autowired
	private MyUserDetailsService userDetailsService;
    @Bean
    public AuthenticationProvider authProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        return provider;
    }


}
///did not understand completely need revisit this topic but managed to complete the code somehow
