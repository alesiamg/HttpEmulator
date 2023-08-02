package ru.httpemulator.data;

import java.time.LocalDate;

public class User {
    private String login;
    private String password;
    private LocalDate date;

    public User() {
    }
    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.date = LocalDate.now();
    }
    public User(String login, String password, LocalDate date) {
        this.login = login;
        this.password = password;
        this.date = date;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public LocalDate getDate() {
        return date;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setDate(String date) {
        this.date = LocalDate.parse(date);
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
// 1 класс User, 3 поля (логин пас дата). 3 конструктора (без. логин пароль. логин пароль дата).
// в Гетмаппенк - возврат юзера, в постмаппинг - принимает тело запроса юзер и возврат юзера с датой
