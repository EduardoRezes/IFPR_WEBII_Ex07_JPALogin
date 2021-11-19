package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		List<User> users = new ArrayList<>();

		String login = req.getParameter("login");
		String password = req.getParameter("password");
		
		User user1 = new User();
		user1.login = "admin";
		user1.password = "admin";
		users.add(user1);
		
		for (User user : users) {
			if(login.equals(user.login)) {			
				if(password.equals(user.password)) {
					
					HttpSession session = req.getSession();
					
					session.setAttribute("usuario", "admin");
					session.setAttribute("auth", true);
					session.setMaxInactiveInterval(5);
					
					resp.sendRedirect("/program/segura");
				}else {
				resp.sendRedirect("/program/index.jsp?msg=Something wrong");
				}
			}else {
			
			resp.sendRedirect("/program/index.jsp?msg=Something wrong");
			}
		}
	}
}
