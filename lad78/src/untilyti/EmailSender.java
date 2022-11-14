/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package untilyti;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Nguyen Cam
 */
public class EmailSender {

    public void sendemail(String quenpass) {

        final String username = "camnmph26581@fpt.edu.vn";
        final String password = "0973822043";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("camnmph26581@fpt.edu.vn"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(quenpass)
            );
            message.setSubject("send mail cập nhật password");
            message.setText("mật khẩu mới là:12345678");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
