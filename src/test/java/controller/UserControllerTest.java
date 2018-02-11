package controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eshopms.model.User;
import com.eshopms.service.iface.IUserService;
import com.eshopms.util.BaseController;
import com.eshopms.util.Message;
import com.eshopms.util.exception.DAOException;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:spring/spring-app.xml")
public class UserControllerTest extends BaseController{
	/** Logger that is available to subclasses */
	Logger logger = Logger.getLogger(getClass());
	@Autowired
	private IUserService userService;
		@Test
		public void usersControllerTest() {
			Integer count = userService.getModelCount().intValue();
			System.out.println(count);
			List<User> query;
			try {
				query = userService.queryByOrder(0, 15, new String[]{"UAccount","UStatus"}, User.class, new boolean[]{false,true,true});
				System.out.println(query);
			} catch (DAOException e) {
				logger.error(Message.contain(e));
			}
		}
		
	
}
