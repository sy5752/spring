package kr.or.ddit.repository;

import kr.or.ddit.model.UserVo;

public interface UserDao {

	// ����� ���̵�� ����� ��ȸ
	UserVo getUser(String userid);

	
}
