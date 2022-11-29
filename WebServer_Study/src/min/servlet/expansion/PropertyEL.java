package min.servlet.expansion;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import min.servlet.dto.DeptDTO;


@WebServlet("/PropertyEL")
public class PropertyEL extends HttpServlet {
	private static Log log = LogFactory.getLog(PropertyEL.class);
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int deptno = 50;
		String dname = "기획실";
		String loc = "부산";
		
		DeptDTO deptDTO = new DeptDTO();
		deptDTO.setDeptno(deptno);;
		deptDTO.setDname(dname);
		deptDTO.setLoc(loc);
		
		request.setAttribute("deptno", deptDTO.getDeptno());
		request.setAttribute("dname", deptDTO.getDname());
		request.setAttribute("loc", deptDTO.getLoc());
		RequestDispatcher dispatcher = request.getRequestDispatcher("./expansion/property_el.jsp");
		dispatcher.forward(request, response);
		
		
	
	
	
	}


}
