package Http;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Httpdataa")
public class Savedatainseetion extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession hs = req.getSession();
		System.out.println(hs);
		/* set data we can use a method is a setattribute */

		hs.setAttribute("id", 1);
		hs.setAttribute("name", "Jayesh");
		hs.setAttribute("age", 24);

		/* we can use a fetch data getattribute methods */
		/* we can strore the data in ref and data type */
		// int id = (Integer) hs.getAttribute("id");
		// String name = (String) hs.getAttribute("name");
		// Integer age = (Integer) hs.getAttribute("age");

		// System.out.println(id);
		// System.out.println(name);
		// System.out.println(age);

		RequestDispatcher rd = req.getRequestDispatcher("httpdataforward");
		rd.forward(req, resp);
	}
}
