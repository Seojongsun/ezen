package min.servlet.redirect;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import min.servlet.dto.ParameterDTO;


@WebServlet("/GetRedirect")
public class GetRedirect extends HttpServlet {
	private static Log log = LogFactory.getLog(PostRedirect.class);
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 파라미터의 한글 처리를 위해 인코딩한다.
		request.setCharacterEncoding("UTF-8");
		
		//전송된 파라미터를 호출하고 변ㅅ후에 할당
		String name = request.getParameter("name");
		log.info(name);
		
		// 전송된 파라미터를 호출하고 읽어온 데이터를 부호 없는 정수로 구문 분석하여 변수에 할당
		int age = Integer.parseInt(request.getParameter("age"));
		log.info(age);
				
		ParameterDTO parameterDTO = new ParameterDTO();
		parameterDTO.setName(name);
		parameterDTO.setAge(age);
		log.info(parameterDTO);
		
		//리다이렉트로 해당 URL로 파라미터를 GET 메소드 방식으로 전송한다
		 
		response.sendRedirect("./object/get_redirect_view.jsp?name=" + URLEncoder.encode(parameterDTO.getName(), "UTF-8") +"&age=" + parameterDTO.getAge());
	
		
		
		
		
	}

}
