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
    protected void configure(HttpSecurity http) throws Exception{


        http.authorizeRequests()
                .antMatchers( "/login").anonymous()  // это url, который доступен неавторизованным пользователям
                .antMatchers("/window").authenticated()  // доступна только авторизованным пользователям
                .and().csrf().disable()  // доп шифрование, поэтому выкл
                .formLogin()
                .loginPage("/login")  // отвечает за форму регистрации
                .loginProcessingUrl("/login/process")  // url на который посылается данные пользовтеля
                .usernameParameter("email") // указываем, что будет емайл
                .failureUrl("/login")
                .defaultSuccessUrl("/main", true)
                .and().logout();  //пользователь может выйти
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
