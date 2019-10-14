package kr.co.itcen.springcontainer.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.UserConfig01;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {UserConfig01.class})
public class UserTest {
	
	@Autowired
	private User user;
	
	@Autowired
	private Friend friend;
	
	// Test는 Thread에 의해 병렬로 처리된다.
	@Test
	public void testUserNull() {
		assertNotNull(user); // assert(user != null); 와 동일한 코드
	}
	
	@Test
	public void testFriendNull() {
		assertNotNull(friend); //
	}
	
	@Test
	public void testFriendDooly() {
		assertEquals(friend.getName(), "둘리");
	}
}
