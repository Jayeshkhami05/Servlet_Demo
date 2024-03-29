package servletdemo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Fecthdata")
public class FecthDataonFE extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		/* servletrequeste is a interface they are method is a getparameter */
		/* non static method we use obj ref here */
		String name= req.getParameter("name");
		String id=req.getParameter("id");
		String DOB=req.getParameter("DOB");
		String email= req.getParameter("email");
		String passward=req.getParameter("passcode");
		String age =req.getParameter("Age");
		String pincode=req.getParameter("pincode");
		
		System.out.println("Name :-"+name);
		System.out.println("email id :- "+email);
		System.out.println("DOB is a:-"+DOB);
		System.out.println("id :- "+id);
		System.out.println("passcode is a :- "+passward);
		System.out.println("age is a:-"+age);
		System.out.println("pincode is a:- "+pincode);
	
		
	}

}
