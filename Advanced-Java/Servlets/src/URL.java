

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class URL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		//printwriter.print("Hello world");
		int num1, num2,add;
		
		//getParameter only retrieves single value,  
		num1= Integer.parseInt(request.getParameter("no1"));
		num2= Integer.parseInt(request.getParameter("no2"));
		add= num1+num2;
		pw.print(add);
		//pw.print("Addition of two numbers: "+(num1+num2));
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
