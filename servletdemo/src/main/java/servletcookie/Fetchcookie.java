package servletcookie;

import java.io.IOException;
import java.net.CookieStore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getcookie")
public class Fetchcookie extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies=req.getCookies();
		/* getcookies() is used to fetch the cookie from the 
		 * browser the return type of getcookies is cookie[]
		 * the size of cookies[] which is returned by getcookies()
		 * depends on the number of cookies present in the broswer..... 
		 * */
		
		if (cookies!=null)
		{
			for (int i=0;i<cookies.length;i++) {
				Cookie c = cookies[i];
				System.out.println(c.getValue());
			}
		}
		else
		{
			System.out.println("cookies ");
		}
		
	}
}
