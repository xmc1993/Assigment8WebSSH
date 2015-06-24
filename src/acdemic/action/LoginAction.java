package acdemic.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import acdemic.action.course.CourseListBean;
import acdemic.listener.OnlineCounter;
import acdemic.model.User;
import acdemic.service.UserManageService;

import com.opensymphony.xwork2.Action;

@Repository
public class LoginAction extends BaseAction implements Action{
	@Autowired
	private UserManageService userManageServiceBean;
	
	private String id;
	private String password;
	
	public String execute() throws Exception {
		
		User user=userManageServiceBean.getUser(id, password);
		
		/**如果用户不存在*/
		if(user==null)
			return "noUser";
		
		/**如果用户存在 进行人数改变*/
		
		int isLogin=1;
		//改变人数统计
		if((int)session.get("isLogin")==0){
    	OnlineCounter.reduceVistor();
    	OnlineCounter.raiseUser();
		}
		session.put("isLogin", isLogin);
		
		
		CourseListBean listCourse=new CourseListBean();
		listCourse.setCourseList(userManageServiceBean.find(id));
		
		/**如果该学生目前没有任何课程成绩*/
		if(listCourse.getCourseList().size()==0){
			session.put("user", user);
			return "noGrade";
		}
		
		
		session.put("listCourse", listCourse);
		session.put("user", user);
		boolean allPass=true;
		
		boolean[] pass=new boolean[4];
		for(int i=0;i<listCourse.getCourseList().size();i++){ //判断是否全部及格
			if(listCourse.getCourseList(i).getScore()>=60){
				pass[i]=true;
			}else{
				allPass=false;
			}
		}
		
		/**如果所有的课程都通过了*/
		if(allPass){
			return "allPass";
		}else{                               /**如果有不及格科目*/
			session.put("pass", pass);
			return "notAllPass";
		}
		
	}
	
	
	public String enterLogin(){
		int isLogin=0;
		session.put("isLogin", isLogin);
		
		return  SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
