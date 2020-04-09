

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Common
 */
@WebServlet("/Common")
public class Common extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Common() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String key = request.getParameter("action");
		int no1,no2,num1,num2,div,mul;
		
		if(key.equals("division")) {
			no1= Integer.parseInt(request.getParameter("no1"));
			no2= Integer.parseInt(request.getParameter("no2"));
			div= no1/no2;
			
			pw.print("Division: "+ div);
		}else if(key.equals("multiply")) {
			num1= Integer.parseInt(request.getParameter("num1"));
			num2= Integer.parseInt(request.getParameter("num2"));
			mul=num1*num2;
			pw.print("Multiply: "+mul);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
