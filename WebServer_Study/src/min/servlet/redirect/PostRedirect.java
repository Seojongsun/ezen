package min.servlet.redirect;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import min.servlet.dto.ParameterDTO;


@WebServlet("/PostRedirect")
public class PostRedirect extends HttpServlet {
	private static Log log = LogFactory.getLog(PostRedirect.class);
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
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
		
		// 요청한 파라미터를 속성에 저장한다.
		request.setAttribute("name", parameterDTO.getName());
		
		//리다이렉트로 전송하기 위해 요청 파라미터에 세션 하나를 만들고 설정된 이름을 사용하여 세션에 객체를 바인딩한다.
		request.getSession().setAttribute("age", parameterDTO.getAge());
		
		//리다이렉트로 해당 url로 파라미터를 전송한다
		response.sendRedirect("./object/post_redirect_view.jsp");
		
		
		
		
		
	}

}
