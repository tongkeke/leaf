package controller;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.eshopms.model.User;
import com.eshopms.service.iface.IUserService;
import com.eshopms.util.BaseController;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:spring/spring-app.xml")
public class UserControllerTest extends BaseController{
	@Autowired
	private IUserService userService;
		@Test
		public void usersControllerTest() {
			Integer count = userService.getModelCount().intValue();
			System.out.println(count);
			List<User> query = userService.queryByOrder(0, 15, new String[]{"UStatus"}, User.class, true);
			System.out.println(query);
		}
		
	
}
