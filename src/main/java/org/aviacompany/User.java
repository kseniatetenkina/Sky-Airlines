package org.aviacompany;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    //private String login;
    @NotNull
    @Size(min = 8, message = "Пароль меньше 8 символов")
    private String password;
    @NotNull
    private String role;
    @Email
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public User()
    {

    }

    public User( String password, String role)
    {

        //this.login = login;
        this.password = password;
        this.role = role;
    }

    public void setId(long id)
    {
        this.id = id;
    }

   /* public void setLogin(String login)
    {
        this.login = login;
    }*/

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public long getId()
    {
        return id;
    }

    /*public String getLogin()
    {
        return login;
    }*/

    public String getPassword()
    {
        return password;
    }

    public String getRole()
    {
        return role;
    }
}
