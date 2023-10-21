package com.zerobase.cms.service;

import com.zerobase.cms.client.MailgunClient;
import com.zerobase.cms.client.mailgun.SendMailForm;
import feign.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public String sendEmail() {
        SendMailForm form = SendMailForm.builder()
                .from("hbkt1857@gmail.com")
                .to("hbkt1867@gmail.com")
                .subject("Test email from zero base")
                .text("My Text").build();

        return mailgunClient.sendEmail(form).getBody();
    }
}
