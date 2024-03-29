package servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/requetedis1")
public class ForwardRequste1 extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String email = req.getParameter("email");
		String pass = req.getParameter("passcode");
		String email1 = "abc@gmail.com";
		String pass1 = "111";
	
		if(email.equals(email1)&&pass.equals(pass1))
		{
				//RequestDispatcher rd = req.getRequestDispatcher("");
				RequestDispatcher rd= req.getRequestDispatcher("Welcomeback1.html");
				rd.forward(req, res);
		}
		else 
		{
			PrintWriter pw= res.getWriter();
			pw.print("invalid creadtials");
			
			RequestDispatcher rd=req.getRequestDispatcher("Welcomeback.html");
			rd.include(req, res);
			res.setContentType("text/html");
		}
	}
}
