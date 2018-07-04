package allen.dao;

import org.springframework.stereotype.Repository;

import allen.entity.User;


@Repository("userDao")
public class OraUserDao implements UserDao {
	private static String USERNAME = "allen";
	private static String PWD = "allen";
	private static int ID = 001;
	public User findByName(String name){
		User user = new User();
		user.setId(ID);
		user.setUser(name);
		user.setPwd(PWD);
		return user;
	}
}
