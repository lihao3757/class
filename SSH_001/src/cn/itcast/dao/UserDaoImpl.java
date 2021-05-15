package cn.itcast.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.itcast.domain.User;


public class UserDaoImpl implements UserDao {

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		//加载配置文件
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}

}
