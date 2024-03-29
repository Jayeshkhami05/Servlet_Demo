package Http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Deletedatasession")
public class DeleteHttpsession extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession hs= req.getSession();
		
		hs.setAttribute("Name", "Jayesh");
		hs.setAttribute("age", 25);
		
		System.out.println(hs.getAttribute("Name"));//Jayesh
		
		/*destroy the httpsession object
		 * delete dirrct object permatily */
		
		hs.invalidate();
		
		//hs.removeAttribute("Name");
		/* it is used to remove the from httpseesion 
		 * we can use this method */
		
		System.out.println(hs.getAttribute("Name"));//Null 333333333
		
		
		
	}
}
