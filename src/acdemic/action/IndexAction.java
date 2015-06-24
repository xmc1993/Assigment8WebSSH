package acdemic.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import acdemic.service.UserManageService;

import com.opensymphony.xwork2.Action;

@Repository
public class IndexAction implements Action{
	@Autowired
	private UserManageService UserManageServiceBean;
	
	public String execute() throws Exception {
		return SUCCESS;
	}

}
