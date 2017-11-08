package mbDao;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import mbPojo.User;

/**
 *  π”√SqlSessionTemplate
 * @author Administrator
 *
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	
	@Override
	public User findUserById(int id) throws Exception {
		SqlSession session = this.getSqlSession();
		
		User user = session.selectOne("sqlmapper.User.findUserById", id);
		
		return user;
	}


	@Override
	public void insertUser(User user) {
		SqlSession session = this.getSqlSession();
		
		user.setBirthday(new Date(System.currentTimeMillis()));
		user.setUsercode("1111");
		user.setUsername("ZZZZ");
		user.setUserpassword("ZZZZ");
		
		session.selectOne("insertUser", user);
	}

	@Override
	public void deleteUser(int id) {
	SqlSession session = this.getSqlSession();
		
		session.selectOne("sqlmapper.User.deleteUser", id);
	}

}
