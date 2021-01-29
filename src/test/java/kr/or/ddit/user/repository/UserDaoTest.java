package kr.or.ddit.user.repository;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.model.UserVo;
import kr.or.ddit.repository.UserDao;

// junit은 main method가 없는데 실행됨 - eclipse에 내장되어 있어서 / maven
// 스프링 환경에서 junit 코드를 실행 ==> junit코드도 스프링 빈으로 등록

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/kr/or/ddit/ioc/ioc.xml")
public class UserDaoTest {
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Test
	public void getUsertest() {
		/***Given***/
		String userid = "brown";

		/***When***/
		UserVo userVo = userDao.getUser(userid);

		/***Then***/
		assertEquals("브라운", userVo.getUsernm());
	}

}
