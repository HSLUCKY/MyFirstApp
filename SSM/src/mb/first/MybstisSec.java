package mb.first;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mbDao.UserDao;
import mbMapper.UserMapper;
import mbPojo.User;

public class MybstisSec {

	@Test
	public void testDao() throws Exception {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		UserDao userDao = aContext.getBean(UserDao.class);

		User user = userDao.findUserById(1113);

		System.out.println(user);
		
		
	}
	
	@Test
	public void testMapper() throws Exception {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		UserMapper userMapper = aContext.getBean(UserMapper.class);
		
		List<User> users = userMapper.findUserByName("»§");
		
		for (User user : users) {
			
			System.out.println(user);
		}
		
		
	}
}
