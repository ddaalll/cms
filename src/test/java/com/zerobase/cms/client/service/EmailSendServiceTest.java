package com.zerobase.cms.client.service;

import com.zerobase.cms.client.MailgunClient;
import com.zerobase.cms.service.EmailSendService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailSendServiceTest {

    @Autowired
    private EmailSendService emailSendService;

    @Test
    public void EmailTest(){
//        mailgunClient.sendEmail(null);
        String response = emailSendService.sendEmail();
        System.out.println(response);
    }
}