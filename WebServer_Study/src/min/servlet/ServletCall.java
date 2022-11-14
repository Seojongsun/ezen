package min.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")


public class ServletCall extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = "홍길동";
		int age = 33;
		ServletDTO servletDTO = new ServletDTO();
		servletDTO.setName(name);
		
		System.out.println("테스트");
		resp.setContentType("text/html; charset=UTF-8");
		//외부 자원으로 데이터를 보낸다
		//텍스트를 외부로 보내주는 클래스
		PrintWriter out = resp.getWriter();
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		
		System.out.println(hour);
		
		out.println("<font color='red'>" + hour+"시간"+"</font>");
		
	}
	
	
	

}
