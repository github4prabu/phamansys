package dedalus.phamansys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity(debug = true)
public class DrugSecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests()
		.requestMatchers("/v2/api-docs",
				"/v3/api-docs/**",
				"/swagger-resources/configuration/ui",  
				"/swagger-resources/configuration/security", 
				"/webjars/**",
				"/swagger-ui.html","/swagger-ui/**").permitAll()
		.requestMatchers("/login/**").permitAll()
        .requestMatchers("/welcome/**").permitAll()
        .requestMatchers("/addDrug").permitAll()
        .requestMatchers("/pharmacist").permitAll()
        .requestMatchers("/Customer").authenticated()
		.requestMatchers("/inventory").permitAll()
		.requestMatchers("/billing").permitAll()
		.requestMatchers("/listAllDrugs/**").permitAll().and().httpBasic();
		

		http.httpBasic();
		http.csrf().disable(); 
		http.cors();
		return http.build();
	}
}
