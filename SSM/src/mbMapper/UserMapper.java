package mbMapper;

import java.util.List;

import mbPojo.User;

/**
 * mapper�ӿڣ��൱��dao�ӿ�
 * 
 * �û�����
 * 
 * @author Administrator
 *
 */
public interface UserMapper {

	/**
	 * ����id��ѯ�û�����Ϣ
	 * ���쳣������ǿϵͳ�Ľ�׳��
	 */
	public User findUserById(int id) throws Exception;
	
	/**
	 * ����û�����Ϣ
	 */
	public void insertUser(User user);
	
	/**
	 * ɾ���û�����Ϣ
	 */
	public void deleteUser(int id);

	/**
	 * �����û�����ѯ�û�����Ϣ
	 * ���쳣������ǿϵͳ�Ľ�׳��
	 */
	public List<User> findUserByName(String name) throws Exception;
	
	
}
