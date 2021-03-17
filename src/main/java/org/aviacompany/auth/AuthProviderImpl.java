package org.aviacompany.auth;

import org.aviacompany.Users;
import org.aviacompany.UsersDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class AuthProviderImpl implements AuthenticationProvider {
    @Autowired
    private UsersDaoImpl usersDao;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException{
        System.out.println("Мы в методе авторизации");
        String email = authentication.getName();
        Users user = usersDao.getUserByMail( email);
        System.out.println("логин пользователя = " + user.getLogin());
        if(user == null){

            throw new UsernameNotFoundException("User not found");
        }
        String password = authentication.getCredentials().toString();
        System.out.println("Password = " + password);
        if(!password.equals(user.getPassword())){
            throw new BadCredentialsException("Bad credentials");
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        return new UsernamePasswordAuthenticationToken(user,null,authorities);
    }
    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }


}
