package mbDao;

import mbPojo.User;

/**
 * dao�ӿ�
 * 
 * �û�����
 * 
 * @author Administrator
 *
 */
public interface UserDao {

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

	
	
	
}
