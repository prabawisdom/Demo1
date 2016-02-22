package demopackage;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;


public class Mailing 
{
	public static void main(String[] args) 
	{

		final String username = "prabawisdom@gmail.com";
		final String password = "prabachakkara";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		//props.put("mail.debug", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
	    Session session = Session.getInstance(props,
				new javax.mail.Authenticator() 
		{
			protected PasswordAuthentication getPasswordAuthentication()
{
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("prabawisdom@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("prabakaran@zadoinfotech.com"));
			//message.addRecipients(Message.RecipientType.CC,InternetAddress.parse("mak@zado-tech.com,gopi@zado-tech.com,vinothkumar@zado-tech.com,prabakaran@zado-tech.com,abinaya@zado-tech.com,prateep@zado-tech.com,sabiya@zado-tech.com"));
			message.setSubject("Sample testing for mailing");
			
			message.setText("PFA");

			MimeBodyPart messageBodyPart = new MimeBodyPart();

			Multipart multipart = new MimeMultipart();

			messageBodyPart = new MimeBodyPart();
			String file = "D:/file1.xlsx";
			String fileName = "Sample File";
			DataSource source = new FileDataSource(file);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(fileName);
			multipart.addBodyPart(messageBodyPart);

			message.setContent(multipart);

			System.out.println("Sending");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
