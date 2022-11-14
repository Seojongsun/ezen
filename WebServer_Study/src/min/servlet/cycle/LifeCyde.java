package min.servlet.cycle;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/LifeCyde")
public class LifeCyde extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	@PostConstruct
			public void initMethod() {
				System.out.println("asdasd ");
				
			}
	
	@PreDestroy
	public void destroyMethod() {
		
		System.out.println("ㅇ머ㅗㅇㅁ녀ㅗㅇ");
	}




	}

