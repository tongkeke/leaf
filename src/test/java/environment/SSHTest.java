package environment;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eshopms.model.User;
import com.eshopms.service.basic.IBasicService;
import com.eshopms.service.iface.IUserService;
import com.eshopms.util.GenericClass;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:spring/spring-app.xml")
public class SSHTest<T> {
	@Autowired
	private IUserService iUserService;
	
	@Test
	public void SSH(){
		User u2 = iUserService.get(2);
		User user2 = new User();
		user2.setUName("hello, SSH-basic");
		iUserService.save(user2);
	}
}
