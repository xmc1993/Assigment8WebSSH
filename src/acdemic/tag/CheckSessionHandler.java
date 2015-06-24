package acdemic.tag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class CheckSessionHandler extends SimpleTagSupport {
	public void doTag() throws JspException, IOException {
		
		try {
			PageContext pageContext=(PageContext)this.getJspContext();
			HttpServletRequest request=(HttpServletRequest)pageContext.getRequest();
			HttpServletResponse response=(HttpServletResponse)pageContext.getResponse();
			if(pageContext.getSession().getAttribute("isLogin")==null){
				String forward="/Assigemnt4/Login";
				request.getRequestDispatcher("/user/index.html").forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new JspException(e.getMessage());
		}
	}

}
