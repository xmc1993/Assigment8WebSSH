package acdemic.filter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class BufferedResponse extends HttpServletResponseWrapper{

	public BufferedResponse(HttpServletResponse response) {
		super(response);
		// TODO Auto-generated constructor stub
	}

}
