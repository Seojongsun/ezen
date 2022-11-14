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
@WebServlet("/PostTransmission")
public class PostTransmission extends HttpServlet {
private static Log log = LogFactory.getLog(PostTransmission.class);
private static final long serialVersionUID = 1L;
// GET 메소드로 요청이 전송되어 올 경우는 doGet 메소드에서 호출한다.
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// 파라미터의 한글 처리를 위해 인코딩한다.
//request.setCharacterEncoding("UTF-8");
// 전송된 파라미터를 호출하고 변수에 할당한다.
String name = request.getParameter("name");
log.info(name);
// 전송된 파라미터를 호출하고 읽어온 데이터를 부호 없는 정수로 구문 분석하여 변수에 할당한다.
int age = Integer.parseInt(request.getParameter("age"));
log.info(age);
ParameterDTO parameterDTO = new ParameterDTO( );
parameterDTO.setName(name);
parameterDTO.setAge(age);
name = parameterDTO.getName( );	
age = parameterDTO.getAge( );
log.info(parameterDTO.toString( ));

// 웹 브라우저에서 처리할 데이터의 MIME 타입과 인코딩을 지정한다.
response.setContentType("text/html; charset=UTF-8");
// 클라이언트에 문자 텍스트를 보낼 수 있는 PrintWriter 클래스 객체를 반환하고 할당한다.
PrintWriter out = response.getWriter( );
// 웹 브라우저에 변수값을 출력한다.
out.println("<title> 파라미터 출력 </title>");
out.println("이름 : " + name + "<br>");
out.println("나이 : " + age);
}
}