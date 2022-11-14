package min.servlet.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@WebServlet("/CookieCreation")
public class CookieCreation extends HttpServlet {
	private static Log log = LogFactory.getLog(CookieCreation.class);
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	Cookie cookie = new Cookie("name", "홍길동");
	
	response.addCookie(cookie);
	
	Cookie[] cookies = request.getCookies();
	for (int i = 0; i < cookies.length; i++) {
		if (cookies[i].getName().equals("name")) {
			String name = cookies[i].getName();
			
			request.getSession().setAttribute("name", name);
			log.info(name);

		String value = cookies[i].getValue();
		request.getSession().setAttribute("value", value);
		log.info(value);
	}
	}
	response.sendRedirect("./object/cookie_creation.jsp");
 
}
	
}

