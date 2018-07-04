package allen.dao;

import allen.entity.User;

public interface UserDao {
	public User findByName(String name);
	//public User find();
	//public User delete();
	//public void update();
}
