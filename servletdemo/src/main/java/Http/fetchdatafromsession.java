package Http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/httpdataforward")
public class fetchdatafromsession extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession hs1 = req.getSession();
		System.out.println(hs1);

		int id = (Integer) hs1.getAttribute("id");
		String name = (String) hs1.getAttribute("name");
		Integer age = (Integer) hs1.getAttribute("age");

		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}
