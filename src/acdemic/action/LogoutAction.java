package acdemic.action;

import org.apache.struts2.dispatcher.SessionMap;

import acdemic.listener.OnlineCounter;

import com.opensymphony.xwork2.Action;

public class  LogoutAction extends BaseAction implements Action{
	
	public String execute() throws Exception {
		
		
		if(session!=null){
			session.remove("user");
			session.remove("listCourse");
			int isLogin=0;
			session.put("isLogin",isLogin);
		}
		//改变用户和有课人数
    	OnlineCounter.reduceUser();
    	OnlineCounter.raiseVistor();
		
		return SUCCESS;
	}

}
