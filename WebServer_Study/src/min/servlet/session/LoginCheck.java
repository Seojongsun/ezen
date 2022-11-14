package min.servlet.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import min.servlet.dto.MemberDTO;


@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static Log log = LogFactory.getLog(LoginCheck.class);
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String save = request.getParameter("save");
		log.info(save);
		
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		memberDTO.setPassword(password);
		log.info(memberDTO);
		
		id = memberDTO.getId();
		password = memberDTO.getPassword();
		if (id.equals("1234")& password.equals("1234")) {
			
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("id", id);
			if (save != null) {
				
				Cookie cookie = new Cookie("id", id);
				cookie.setMaxAge(60*60*24);
				cookie.setPath("/");
				
				response.addCookie(cookie);
				
			}
			response.sendRedirect("./program/preference_select.jsp?id=" + id);
			
			
		} else {
			response.sendRedirect("./program/logcheck.jsp?id=" + id);
		}
	
		
	}

}
