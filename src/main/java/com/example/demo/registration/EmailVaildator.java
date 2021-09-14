package com.example.demo.registration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
@AllArgsConstructor
public class EmailVaildator implements Predicate<String> {

    private EmailVaildator emailVaildator;

    @Override
    public boolean test(String s) {
        // TODO: Learn regex for email
        return true;
    }
}
