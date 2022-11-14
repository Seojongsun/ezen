package min.servlet.request;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import min.servlet.dto.ParameterDTO;

@WebServlet("/Transmission")

public class Transmission extends HttpServlet {

	private static Log log = LogFactory.getLog(Transmission.class);

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 파라미터의 한글 처리를 위해 인코딩한다.
	    request.setCharacterEncoding("UTF-8");
	 // 전송된 파라미터를 호출하고 변수에 할당한다.
	    String name = request.getParameter("name");
	    log.info(name);
	    int age = Integer.parseInt(request.getParameter("age"));
	    log.info(age);
	    ParameterDTO transmissionDTO = new ParameterDTO();
	    transmissionDTO.setName(name);
	    transmissionDTO.setAge(age);
	    name = transmissionDTO.getName( );	    
	    age = transmissionDTO.getAge( );
	    log.info(transmissionDTO);
	 // 웹 브라우저에서 처리할 데이터의 MIME 타입과 인코딩을 지정한다.
	    response.setContentType("text/html; charset=UTF-8");
	 // 내용을 출력할 수 있는 출력 스트림을 생성한다.
	    PrintWriter out = response.getWriter( );
	 // 웹 브라우저에 변수값을 출력한다.
	    out.println("<title> 파라미터 출력 </title> " );
	    out.println("이름 : " + name + "<br>");
	    out.println("나이 : " + age);
	}

	

}
