

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/KBCServlet")
public class KBCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printwriter = response.getWriter();
		//String answers[]= new String [5];
		String question1 = request.getParameter("q1");
		String question2 = request.getParameter("q2");
		String question3 = request.getParameter("q3");
		String question4 = request.getParameter("q4");
		String question5 = request.getParameter("q5");
		int corr=0;
		//String answers[]= {question1,question2,question3,question4,question5};
		
		//Answers = c,a,a,c,b
		
		if(question1.equals("c")) {
			corr++;
		}
		if(question2.equals("a")) {
			corr++;
		}
		if(question3.equals("a")) {
			corr++;
		}
		if(question4.equals("c")) {
			corr++;
		}
		if(question5.equals("b")) {
			corr++;
		}
		printwriter.print("Your score: "+(corr));
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
