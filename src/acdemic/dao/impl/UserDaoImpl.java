package acdemic.dao.impl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import acdemic.dao.BaseDao;
import acdemic.dao.UserDao;
import acdemic.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private BaseDao baseDaoImpl;

	
	public User getUser(String id, String password) {
		String hql="from User u where u.id=? and u.password=?";
		Query query=baseDaoImpl.getSession().createQuery(hql);
		query.setString(0, id);
		query.setString(1, password);
		List list=query.list();
		if(list.size()!=0){
			User user=(User)list.get(0);
			return user;
		}
		return null;
	}
	
}










