package com.yuzhi.mail.service.impl;

import com.yuzhi.mail.service.SendMailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @author yuzhi
 */
@Service
public class SendMailServiceImpl implements SendMailService {
    @Resource
    JavaMailSender javaMailSender;

    @Override
    public String sendOne(){
        //建立邮件消息对象
        SimpleMailMessage mainMessage = new SimpleMailMessage();
        //邮件发送方
        mainMessage.setFrom("1066073104@qq.com");
        //邮件接收方
        mainMessage.setTo("yuzhiluck@163.com");
        //发送的标题
        mainMessage.setSubject("爱吃东坡肉");
        //发送的内容
        mainMessage.setText("10块一斤");
        javaMailSender.send(mainMessage);
        return "success";
    }

    @Override
    public String sendTwo() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
        mimeMessageHelper.setFrom("yuzhiluck@163.com");
        mimeMessageHelper.setTo("1066073104@qq.com");
        mimeMessageHelper.setSubject("爱吃东坡肉");
        mimeMessageHelper.setText("10块一斤");
        javaMailSender.send(mimeMessage);
        return "success";
    }
}
