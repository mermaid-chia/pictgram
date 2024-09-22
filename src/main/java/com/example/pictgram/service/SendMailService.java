package com.example.pictgram.service;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import jakarta.mail.internet.MimeMessage;

@Service
public class SendMailService {
	@Autowired
	private JavaMailSender javaMailSender;

	public void sendMail(Context context) {

		javaMailSender.send(new MimeMessagePreparator() {

			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, StandardCharsets.UTF_8.name());
				helper.setFrom("[test@example.com]");
				helper.setTo("[test@example.com]");
				helper.setSubject("タイトル");
				helper.setText("本文");
			}
		});

	}

}
