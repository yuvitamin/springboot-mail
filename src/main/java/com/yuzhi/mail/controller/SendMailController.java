package com.yuzhi.mail.controller;

import com.yuzhi.mail.service.SendMailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.mail.MessagingException;

/**
 * @author yuzhi
 */
@RestController
public class SendMailController {
    @Resource
    private SendMailService sendMailService;
    /**
     * QQ邮箱：简单邮件的发送
     * @return
     */
    @GetMapping("/send/one")
    public String sendOne(){

        return sendMailService.sendOne();
    }

    /**
     * 163邮箱：复杂邮件的发送
     * @return
     * @throws MessagingException
     */
    @GetMapping("/send/two")
    public String sendTwo() throws MessagingException {
        return sendMailService.sendTwo();
    }
}
