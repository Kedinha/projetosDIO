package projeto.ked_spring_security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

// @SuppressWarnings("unused")
@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfiguration {

  // @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests()
        .requestMatchers("/").permitAll()
        .requestMatchers(HttpMethod.POST, "/login").permitAll()
        .requestMatchers("/managers").hasAnyRole("MANAGERS")
        .requestMatchers("/users").hasAnyRole("USERS", "MANAGERS")
        .anyRequest().authenticated().and().httpBasic();
  }

  // @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
        .withUser("user")
        .password("{noop}user123")
        .roles("USERS")
        .and()
        .withUser("admin")
        .password("{noop}master123")
        .roles("MANAGERS");
  }
}
