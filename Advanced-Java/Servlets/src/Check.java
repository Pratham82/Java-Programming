


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Check")
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name,password;
		name =request.getParameter("name");
		password=request.getParameter("pass");
		PrintWriter pw = response.getWriter();
		
		if(name.equals("admin")&&password.equals("admin")) {
			pw.print("Correct credentials<br>");
			RequestDispatcher rd = request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
		}else {
			pw.print("Wrong credentials");
			RequestDispatcher rd = request.getRequestDispatcher("Welcome");
			rd.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
