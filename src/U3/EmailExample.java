package U3;

import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
public class EmailExample {
    public static void main(String[] args) {
        final String username = "albertleongng@gmail.com";
        final String password= "nGtIger19882022";
        //final char[] password=passwordStr.toCharArray();
        String to  ="ngcasio22@gmail.com";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "imap.gmail.com");
        props.put("mail.smtp.port", "587");

        System.out.println("Get Session Object");
        Session session = Session.getInstance(
                props, new javax.mail.Authenticator(){
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
                        return new javax.mail.PasswordAuthentication(username,password);
                    }
                });
        try{
        System.out.println("Compose Message");
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("albertleongng@gmail.com"));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        message.setSubject("E-mail from COMPS311");
        message.setText("Yeah! I can send e-mail using Java!");
        System.out.println("Ready to Send Email");
        Transport.send(message);
        System.out.println("Email Sent Successfully");
         }
        catch(MessagingException e){ System.out.println(e); }
    }
}

