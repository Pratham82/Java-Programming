

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServ")
public class CalcServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printwriter = response.getWriter();
		//printwriter.print("Hello world");
		int num1, num2;
		
		//getParameter only retrieves single value,  
		num1= Integer.parseInt(request.getParameter("num-1"));
		num2= Integer.parseInt(request.getParameter("num-2"));
		
		printwriter.print("Addition of two numbers: "+(num1+num2));
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
