package mbMapper;

import java.util.List;

import mbPojo.User;

/**
 * mapper接口：相当于dao接口
 * 
 * 用户管理
 * 
 * @author Administrator
 *
 */
public interface UserMapper {

	/**
	 * 根据id查询用户的信息
	 * 抛异常可以增强系统的健壮性
	 */
	public User findUserById(int id) throws Exception;
	
	/**
	 * 添加用户的信息
	 */
	public void insertUser(User user);
	
	/**
	 * 删除用户的信息
	 */
	public void deleteUser(int id);

	/**
	 * 根据用户名查询用户的信息
	 * 抛异常可以增强系统的健壮性
	 */
	public List<User> findUserByName(String name) throws Exception;
	
	
}
