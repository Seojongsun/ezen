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

@WebServlet("/LoginOut")
public class LoginOut extends HttpServlet {
	private static Log log = LogFactory.getLog(LoginOut.class);
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 세션 객체를 생성하여 할당한다.
		HttpSession httpSession = request.getSession( );
		// 세션의 속성값으로 저장된 모든 객체를 반납하여 해당 세션을 종료시킨다.
		httpSession.invalidate( );
		// 클라이언트가 요청 파라미터와 함께 보낸 모든 쿠키 객체를 포함하는 배열을 반환하고 쿠키 배열 객체에 할당한다.
		Cookie[ ] cookies = request.getCookies( );
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				// 쿠키의 이름을 반환한다.
				if(cookie.getName( ).equals("id")) {
					log.info(cookie.getName( ).equals("id"));
					// 쿠키의 최대 사용 기간을 초 단위로 설정하며 0을 설정하여 쿠키를 실행하면 쿠키가 삭제된다.
					cookie.setMaxAge(0);
					// 클라이언트가 쿠키를 반환해야 하는 쿠키의 경로를 절대 경로로 설정한다.
					cookie.setPath("/");
					// 응답에 설정된 쿠키를 추가하며 Cookie 클래스 형식의 쿠키가 응답 헤더에 추가된다.
					response.addCookie(cookie);
				}
			}
			response.sendRedirect("./program/login.jsp");
		}
	}
}