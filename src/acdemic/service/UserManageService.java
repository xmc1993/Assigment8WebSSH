package acdemic.service;
import java.util.List;


import org.springframework.stereotype.Service;

import acdemic.model.User;

@Service
public interface UserManageService {
	
	/**
	 * 返回用户
	 * @param id
	 * @param password
	 * @return
	 */
	public User getUser(String id,String password);
	/**
	 * 返回用户的成绩信息
	 * @param id
	 * @return
	 */
	public List find(String id);
}
