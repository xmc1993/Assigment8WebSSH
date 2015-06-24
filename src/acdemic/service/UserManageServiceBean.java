package acdemic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acdemic.dao.AcdemicDao;
import acdemic.dao.UserDao;
import acdemic.model.User;

@Service
public class UserManageServiceBean implements UserManageService{
	@Autowired
	private UserDao userDaoImpl;
	@Autowired
	private AcdemicDao acdemicDaoImpl;
	

	public User getUser(String id, String password) {
		return userDaoImpl.getUser(id, password);
	}

	
	public List find(String id) {
		return acdemicDaoImpl.find(id);
	}

}
