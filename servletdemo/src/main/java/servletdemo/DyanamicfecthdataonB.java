package servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Fecthdata1")
public class DyanamicfecthdataonB extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		/* getwrieter method is a servlerresponce interce we can creat a objects */
		PrintWriter pw=res.getWriter();
		
		pw.print("<h1> Hello Jayesh </h1>");
		
	}

}
