package ru.httpemulator.data;

import java.time.LocalDate;

public class ResultPostRS {
    private String login;
    private LocalDate date;

    public ResultPostRS() {
    }

    public ResultPostRS(String login) {
        this.login = login;
        this.date = LocalDate.now();
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setDate(String date) {
        this.date = LocalDate.parse(date);
    }
}

