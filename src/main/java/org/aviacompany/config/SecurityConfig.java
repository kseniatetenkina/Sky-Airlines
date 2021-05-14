package org.aviacompany.config;

import org.aviacompany.auth.AuthProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@ComponentScan("org.aviacompany")

public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private AuthProviderImpl authProvider;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/resources/**").permitAll()
                .antMatchers("/login", "/reg", "/addUser").anonymous() //URL, которые доступны только неавтризованным пользователям
                .antMatchers( "/main", "/currentUser").hasAuthority("ROLE_USER")
                .antMatchers("/admin", "/list", "/currentUser").hasAuthority("ROLE_ADMIN").anyRequest().authenticated()
                .and().csrf().disable()
                .formLogin()
                .loginPage("/login") // где у нас форма - на этом хендлере
                .loginProcessingUrl("/login/process") //Url, на который у нас посылаются данные пользователя для обработки, его будет обрабатывать спринг
                .usernameParameter("email") // по дефолту username в спринге - username, поэтому мы указываем, что у нас email
                .failureUrl("/login")
                .defaultSuccessUrl("/default", true)
                .and().logout().permitAll(); //
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.authenticationProvider(authProvider);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
