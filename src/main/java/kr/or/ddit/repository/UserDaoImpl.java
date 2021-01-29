package kr.or.ddit.repository;

import org.springframework.stereotype.Repository;

import kr.or.ddit.model.UserVo;


// <bean id="" class=""></bean>
//	@Repositorty���� ���ٸ� ������ ���� ������ ������ �� �̸�����
// class �̸����� ù���ڸ� �ҹ��ڷ� �� ������ ������ ���� �̸����� �����ȴ�.
// UserDaoImpl ==> userDaoImpl

// UserDao / UserDaoImpl ==> @Resource(name="userDaoImpl")
// UserDaoI / UserDao ==> @Resource(name="userDao")

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public UserVo getUser(String userid) {
		// ������ �����ͺ��̽����� ��ȸ�� �ؾ��ϳ�, ���� �ʱ�ܰ�� ������ �Ϸ���� ����
		// ���� Ȯ���Ϸ��� �ϴ� ����� ������ �����̳ʿ� ������ ���߱� ����
		// new �����ڸ� ���� ������ vo��ü�� ��ȯ
		
		// UserVo user = new UserVo("brown", "����");
		return new UserVo("brown", "����");
	}
	
}
