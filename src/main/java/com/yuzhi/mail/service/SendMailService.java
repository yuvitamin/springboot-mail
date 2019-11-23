package com.yuzhi.mail.service;

import javax.mail.MessagingException;

/**
 * @author yuzhi
 */
public interface SendMailService {
    String sendOne();

    String sendTwo() throws MessagingException;
}
