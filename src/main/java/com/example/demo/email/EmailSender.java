package com.example.demo.email;


// interface to switch implementations

public interface EmailSender {
    void send(String to, String email);
}
