package min.servlet.ajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import min.servlet.dto.MemberDTO;

@WebServlet("/IdCheck")
public class IdCheck extends HttpServlet{
	
	

private static Log log = LogFactory.getLog(IdCheck.class);
private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String id = request.getParameter("id");
	
	log.info("아이디 - " + id);
	
	MemberDTO memberDTO = new MemberDTO();
	memberDTO.setId(id);
	log.info("DTO 아이디 - " + memberDTO.getId());
	if (id == null) {
		response.sendRedirect("./ajax/id_check.jsp");
		return;
		
	}
	
	
	
}




}
