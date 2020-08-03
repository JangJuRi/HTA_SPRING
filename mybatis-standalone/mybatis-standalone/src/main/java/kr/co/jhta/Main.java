package kr.co.jhta;

import java.util.List;

import kr.co.jhta.dao.UserDao;
import kr.co.jhta.vo.User;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new UserDao();
		
		/* insertUser */
//		System.out.println("새 사용자 등록하기");
//		User user1 = new User("hong3", "홍길삼", "zxcv1234", "hong3@gmail.com");
//		userDao.insertUser(user1);
//		System.out.println("새 사용자 등록이 완료되었습니다.");
		
		/* deleteAllUsers */
//		System.out.println("사용자 전체삭제");
//		userDao.deleteAllUsers();
//		System.out.println();
		
		/* deleteUserById */
//		System.out.println("사용자 아이디로 삭제");
//		userDao.deleteUserById("hong3");
//		System.out.println();
		
		/* updateUser */
//		System.out.println("사용자 정보 수정");
//		User user4 = new User("hong3", "홍길동22", "zxcv1234", "hong3@gmail.com");
//		if(userDao.getUserById(user4.getId()) != null) {
//			userDao.updateUser(user4);
//		} else {
//			System.out.println("지정된 아이디의 사용자정보가 존재하지 않습니다.");
//		}
//		System.out.println();
		
		/* getAllUsers */
//		System.out.println("모든 사용자 조회하기");
//		List<User> users1 = userDao.getAllUsers();
//		for(User user : users1) {
//			System.out.println(user.getId() +", "+ user.getName());
//		}
//		System.out.println();
		
		/* getUsersByName */
//		List<User> user3 = userDao.getUsersByName("장주리");
//		for(User user : user3) {
//			System.out.println(user.getName());
//		}
			
		/* getUserById */
//		System.out.println("특정 아이디의 사용자 조회하기");
//		User user2 = userDao.getUserById("hong3");
//		System.out.println(user2);
//		if(user2 != null) {
//			System.out.println(user2.getId() + ", " + user2.getName() + ", " + user2.getEmail());
//		} else {
//			System.out.println("지정된 아이디의 사용자정보가 존재하지 않습니다.");
//		}
//		System.out.println();
		
		/* getUserByEmail */
//		System.out.println("특정 아이디의 사용자 조회하기");
//		User user5 = userDao.getUserByEmail("hong3@gmail.com");
//		System.out.println(user5);
//		if(user5 != null) {
//			System.out.println(user5.getId() + ", " + user5.getName() + ", " + user5.getEmail());
//		} else {
//			System.out.println("지정된 아이디의 사용자정보가 존재하지 않습니다.");
//		}
//		System.out.println();
		
		/* getUsersCount */
//		System.out.println("전체 사용자 수 조회하기");
//		int usersCount = userDao.getUsersCount();
//		System.out.println("전체 사용자 수: " + usersCount);
//		System.out.println();
			
	}
}
