package min.servlet.test;

import java.io.IOException;
import java.sql.Connection;	
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@WebServlet("/DBCP")
public class DBCP extends HttpServlet {
	private static Log log = LogFactory.getLog(DBCP.class);
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	// 가비지 컬렉션이 삭제할 수 있도록 선언한다. ( jvm이 힙이기 때문)
		Connection connection = null;
		Boolean bool =true;
	// Context는 다른 언어를 자바로 바인딩 하겠다.	
		try {
			Context context = new InitialContext();
			
			// 강제 자료형 변환은 제네릭이다.
		
	DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc");
	connection = dataSource.getConnection();
	System.out.println("안ㄴ영ㅎ아앙아");
	log.info(connection);
	
	request.setAttribute("bool", bool);
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("./test/db.jsp");
	dispatcher.forward(request,  response);

			
		} catch (NamingException e) {
			log.info("데이터베이스 연결 실패 -" + e);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 

	}

}
