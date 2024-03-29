package servletcookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/savecookie")
public class Getcookies extends HttpServlet 
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	   String email =req.getParameter("email");
	   String password =req.getParameter("password");
	   
	   Cookie c =new Cookie("Jayesh" ,"Prathmesh");
	   c.setMaxAge(15);
	   
	   Cookie c1 =new Cookie("email",email);
	   c1.setMaxAge(15);
	   
	   Cookie c2 =new Cookie("password",password);
	   c2.setMaxAge(15);
	   
	   resp.addCookie(c);
	   resp.addCookie(c1);
	   resp.addCookie(c2);
	   
	   System.out.println("cookies are save ");

}
}
