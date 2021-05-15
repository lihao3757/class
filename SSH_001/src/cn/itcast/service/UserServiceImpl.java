package cn.itcast.service;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

public class UserServiceImpl implements UserService {
 private UserDao userDao;
 
	public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}



}
