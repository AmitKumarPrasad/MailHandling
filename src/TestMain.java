import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class TestMain 
{		
		public static void main(String[] args) throws AddressException, MessagingException 
		{
			MonitoringMail mail = new MonitoringMail();
			mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody);
		}

}
