package min.servlet.begin;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@WebServlet("/ServletCall")
public class ServletCall extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	
	private static Log log = LogFactory.getLog(ServletCall.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		
		log.info(hour + "시" );
		int minute = calendar.get(Calendar.MINUTE);
		
		PrintWriter out = resp.getWriter();
		out.println("<html> <head> <title> 현재 시각 </title> </head> <body>");
		out.println("현재 시각:");
		out.println(hour + " 시 ");
		out.println(minute + "분");
		out.println("</body> </html>");
		out.close();
	
		
	}

	
	
	

	
	
}
