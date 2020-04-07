

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/go")
public class MyServlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printwriter = response.getWriter();
		//printwriter.print("Hello world");
		String name, pass,document,gender,hobbies[]= new String[3];
		
		//getParameter only retrieves single value,  
		name= request.getParameter("useranme");
		pass =request.getParameter("pass");
		document=request.getParameter("docs");
		gender= request.getParameter("gender");
		hobbies=request.getParameterValues("hobbies");
		
		printwriter.print("<b>Hi "+name+"</b><br>");
		printwriter.print("<b>Your password is"+pass+"</b><br>");
		printwriter.print("Document: "+document+"<br>");
		printwriter.print("Gender: "+gender+"<br>");
		printwriter.print("Hobbies: ");
		for (String hb: hobbies){
			printwriter.println(hb);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

