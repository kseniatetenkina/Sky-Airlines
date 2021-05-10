package org.aviacompany;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "users")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String login;
    @NotNull
    @Size(min = 8, message = "Minimum 8 symbols")
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Email
    private String email;
    @Column(name = "money")
    private int money;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public User() {

    }

    public User(long id, @NotNull String login, @NotNull String password, @Email String email, Role role, int money) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
        this.email = email;
        this.money = money;
    }

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public User(String login, String password, String email, Role role, int money) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.role = role;
        this.money = money;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}