package min.servlet.encoding;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import min.servlet.dto.ParameterDTO;
@WebServlet("/EncodingFilter")
public class EncodingFilter extends HttpServlet {
private static Log log = LogFactory.getLog(EncodingFilter.class);
private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
log.info(name);
int age = Integer.parseInt(request.getParameter("age"));
log.info(age);
ParameterDTO parameterDTO = new ParameterDTO( );
parameterDTO.setName(name);
parameterDTO.setAge(age);
log.info(parameterDTO); 
name = parameterDTO.getName( ); 
age = parameterDTO.getAge( );
// 지정된 경로에 있는 자원에 대한 래퍼 역할을 하는 RequestDispatcher 인터페이스의 객체를 반환하고 할당한다.
RequestDispatcher dispatcher = request.getRequestDispatcher("./Object/encoding_filter_view.jsp");
// 서블릿에서 서버의 다른 자원으로 요청 파라미터를 포워드 방식으로 JSP에 전달한다.
dispatcher.forward(request, response);
}
}