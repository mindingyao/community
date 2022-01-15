package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testTextMail() {
        mailClient.sendMail("1915552319@qq.com", "Test", "Welcome");
    }

    @Test
    public void testHtmlMail() {
        Context conetxt = new Context();
        conetxt.setVariable("username", "Sunday");

        String content = templateEngine.process("/mail/demo", conetxt);
        System.out.println(content);

        mailClient.sendMail("1915552319@qq.com", "HTML", content);
    }
}
