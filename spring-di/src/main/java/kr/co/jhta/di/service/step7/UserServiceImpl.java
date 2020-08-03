package kr.co.jhta.di.service.step7;

import java.util.ArrayList;
import java.util.List;

import kr.co.jhta.di.vo.User;

public class UserServiceImpl implements UserService {

	@Override
	public List<User> getAllUser() {
		List<User> users = new ArrayList<>();
		
		User user1 = new User("aaa", "이름1", "010-1111-1111", "sms");
		User user2 = new User("bbb", "이름2", "010-2222-2222", "katalk");
		User user3 = new User("ccc", "이름3", "010-3333-3333", "sms");
		User user4 = new User("ddd", "이름4", "010-4444-4444", "sms");
		User user5 = new User("eee", "이름5", "010-5555-5555", "katalk");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		return users;
	}

}
