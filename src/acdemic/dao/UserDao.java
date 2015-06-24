package acdemic.dao;

import javax.ejb.Remote;

import acdemic.model.User;
@Remote
public interface UserDao {

	
	public User getUser(String id,String password);
	
}
