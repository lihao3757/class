package cn.itcast.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	
	
 public String  save(){
	 //调用service
	 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	 UserService userService = (UserService)context.getBean("userService");
	 userService.save(user);
	 return SUCCESS;
 }
 //封装页面的数据
 private User user = new User();
@Override
public User getModel() {
	// TODO Auto-generated method stub
	return user;
}
}
