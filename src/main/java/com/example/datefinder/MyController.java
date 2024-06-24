package com.example.datefinder;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

@RestController
public class MyController {
    @GetMapping("/")
    public String displayDate(){
        LocalDate dateObj = LocalDate.now();
        LocalDate newDateObj = dateObj.plusDays(100);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedStr = newDateObj.format(format1);
        return formattedStr;
    }
}
