package servletdemo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/requetedis")
public class ForwardRequste extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("requste will be forwarded to welcome page ");
		
		RequestDispatcher rd=req.getRequestDispatcher("Welcome.html");
		rd.forward(req, res);
		
	}

}
