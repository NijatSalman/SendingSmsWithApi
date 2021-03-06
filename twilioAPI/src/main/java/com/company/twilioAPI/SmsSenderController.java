package com.company.twilioAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/sms")
public class SmsSenderController {

    private final Service service;

    @Autowired
    public SmsSenderController(Service service) {
        this.service = service;
    }
    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest){
        service.sendSms(smsRequest);
    }
}
