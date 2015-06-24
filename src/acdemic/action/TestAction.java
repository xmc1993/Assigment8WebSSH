package acdemic.action;

import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.Action;


@Repository
public class TestAction extends BaseAction  implements Action{

	
	public String execute() throws Exception {
		
		
		String[] data={"1_2","4_4","4_5","6_6"};
		String s="['1_2', '4_4','4_5','6_6','6_7','8_5','8_6','8_7','8_8', '10_1', '10_2']";
		
		String s1="aaaaaaaaaa,aaaaaaaaaa,aaaaaaaaaa,aaaaaaaaaa,aaaaaaaaaa,aaaaaaaaaa,aaaaaaaaaa,aaaaaaaaaa,aaaaaaaaaa,aaaaaaaaaa";
		session.put("data", s);
		session.put("seat", s1);
		return SUCCESS;
	}

}
