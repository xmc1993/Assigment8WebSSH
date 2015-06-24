package acdemic.action.course;

import java.io.Serializable;
import java.util.List;

import acdemic.model.Course;

public class CourseListBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private List courseList;
	
	public List getCourseList(){
		return courseList;
	}
	
	public void setCourseList(List courseList){
		this.courseList=courseList;
	}
	
	public Course getCourseList(int index){
		return (Course) courseList.get(index);
	}
}

