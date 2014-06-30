package main;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Suarez {
    public void sendMail() {
        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("haxajlutet@gmail.com", "h@ckerp@nd@slav"));
        email.setSSLOnConnect(true);
        try {
            email.setFrom("haxajlutet@gmail.com");
            email.setSubject("Suarez Jorka :P");
            email.setMsg("http://d3dsacqprgcsqh.cloudfront.net/photo/azbW3zq_460sa_v1.gif  :-)");
            email.addTo("martj@mail.bg");
            email.send();
        } catch (EmailException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // public static void main(String[] args) {
    // Suarez test = new Suarez();
    // test.sendMail();
    // }
}
