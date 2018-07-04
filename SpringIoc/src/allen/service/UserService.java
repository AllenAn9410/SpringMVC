package allen.service;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import allen.dao.UserDao;
import allen.entity.User;


@Service
public class UserService implements Serializable{
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
    @Resource(name="userDao")
	public void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}
	public UserDao getUserDao(){
		return userDao;
	}
	public User login(String name,String pwd) throws NameOrPwdException{
		User user = userDao.findByName(name);
		if(user != null && pwd.equals(user.getPwd())){
			return user;
		}
		throw new NameOrPwdException("username or password is not correct");
	}
	
}
