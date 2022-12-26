package com.driver;

import java.util.Date;

public class Mail {
    public Date date;
    public String sender;
    public String massage;

    Mail(Date date, String sender, String massage) {

        this.date = date;
        this.massage = massage;
        this.sender = sender;
    }

    public Date getDate() {
        return date;
    }

    public String getMassage() {
        return massage;
    }

    public String getSender() {
        return sender;
    }
}
