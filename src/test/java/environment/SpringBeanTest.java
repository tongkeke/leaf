package environment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.Bean;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:spring/spring-app.xml")
public class SpringBeanTest {
	@Autowired
	private Bean bean;
	@Test
	public void springBean(){
		String money = bean.getMoney();
		System.out.println("money :　"+money);
	}
	
	
}
