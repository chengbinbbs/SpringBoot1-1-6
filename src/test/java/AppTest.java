import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.daysluck.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class AppTest {

	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Test
	public void sendMail(){
		SimpleMailMessage message = new SimpleMailMessage();
	      
       message.setFrom("chengbinbbs@126.com");//发送者.
       message.setTo("1437243814@qq.com");//接收者.
       message.setSubject("测试邮件（邮件主题）");//邮件主题.
       message.setText("这是邮件内容");//邮件内容.
       javaMailSender.send(message);//发送邮件
	}
}
