package min.servlet.cookie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@WebServlet("/CookieInfomation")
public class CookieInfomation extends HttpServlet {
	private static Log log = LogFactory.getLog(CookieInfomation.class);
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 클라이언트가 요청 파라미터와 함께 보낸 모든 쿠키 객체를 포함하느 ㄴ배열을 반환하고 쿠키 배열 객체에 할당한다.
		Cookie[] cookies = request.getCookies();
		
		if (cookies == null) {
			log.info("쿠키가 존재하지 않습니다.");
			
		} else {
			for (int i = 0; i < cookies.length; i++) {
				
				//쿠키의 이름을 반환하고 할당한다.
				String name = cookies[i].getName();
				
				//요청할 파라미터를 속성에 저장한다.
				request.setAttribute("name", name);
				log.info(name);
				
				//쿠키값을 반환하고 할당한다.
				String value = cookies[i].getValue();
				
				//요청할 파라미터를 속성에 저장한다.
				request.setAttribute("value", value);
				log.info(value);
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./object/cookie_information.jsp");
		dispatcher.forward(request, response);
		
	

		}

}
