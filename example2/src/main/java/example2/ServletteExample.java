package example2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletteExample extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	String name = req.getParameter("username");
	String email = req.getParameter("email");
	String ip = req.getRemoteAddr();
	
	resp.getWriter().println("<html>");
	resp.getWriter().println("<head>");
	resp.getWriter().println("<title>wtf</title>");
	resp.getWriter().println("</head>");
	resp.getWriter().println("<body>");
	resp.getWriter().println("your name is : "+ name);
	resp.getWriter().println("<br> your email is : "+email);
	resp.getWriter().println("your IP adress is : "+ip);
	
	resp.getWriter().println("</body>");
	resp.getWriter().println("</html>");
	
	}
	

}
