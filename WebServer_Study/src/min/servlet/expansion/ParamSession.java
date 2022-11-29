package min.servlet.expansion;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebServlet("/ParamSession")
public class ParamSession extends HttpServlet {
	private static Log log = LogFactory.getLog(ParamSession.class);
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
// 세션 객체를 생성하여 할당한다.
		HttpSession session = request.getSession();
// 설정된 이름을 사용하여 세션에 객체를 바인딩한다.
		session.setAttribute("min", "hong");
		log.info(session);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./expansion/param_view.jsp");
		dispatcher.forward(request, response);
	}
}