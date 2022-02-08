

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Uservalidation")
public class Uservalidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public Uservalidation() {
        super();
        // TODO Auto-generated constructor stub
    }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		response.getWriter().append("Served at: ").append(request.getContextPath());
    		String username=request.getParameter("uname");
    		String password=request.getParameter("password");
    		
    		RequestDispatcher rd=null;
    		if(username.equalsIgnoreCase("Rohit") && password.equals("Rohit@123"))
    		{
    		rd=request.getRequestDispatcher("info.jsp");
    		rd.forward(request, response);
    		
    		}else 
    		{
    		
    		
    			
    			PrintWriter out=response.getWriter();
    			out.println("Invalid Creadintial");
    			rd=request.getRequestDispatcher("loginform");
    			rd.include(request, response);
    			
    		}
    	}

    	}




	