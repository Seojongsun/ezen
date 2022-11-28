package review.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import review.member.controller.MemberInsertController;
import review.member.controller.MemberSelectController;
import review.control.Controller;
import review.handler.HandlerAdapter;

public class MemberDispatcherServlet extends HttpServlet {
private static Log log = LogFactory.getLog(MemberDispatcherServlet.class);
	private static final long serialVersionUID = 1L;

	
@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String requestURI = request.getRequestURI();
	log.info(requestURI);
	String contextPath = request.getContextPath();
	String pathURI = requestURI.substring(contextPath.length());
	HandlerAdapter handlerAdapter = null;
	Controller controller = null;
	
	if (pathURI.equals("/MemberSelect.me")) {
		controller = new MemberSelectController();
		handlerAdapter = controller.execute(request, response);
		log.info("회원 전체 조회 확인 - " + handlerAdapter);
		
	} else if (pathURI.equals("/LoginView.me")) {
		handlerAdapter = new HandlerAdapter();
		handlerAdapter.setPath("./view/login/Login.jsp");
		log.info("로그인 화면 뷰 확인 - " + handlerAdapter);
		
	}else if(pathURI.equals("/MemberInsert.me")) {
			handlerAdapter = new HandlerAdapter();
			handlerAdapter.setPath("./view/member/member_insert.jsp");
			log.info("회원 가입 확인 - " + handlerAdapter);
		
	} else if(pathURI.equals("/MemberInsert_view.me")) {
		controller = new MemberInsertController( );
		handlerAdapter = controller.execute(request, response);
		log.info("회원 가입 확인 - " + handlerAdapter);
	}
	
	if (handlerAdapter != null) {
		if (handlerAdapter.isRedirect()) {
			response.sendRedirect(handlerAdapter.getPath());
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher(handlerAdapter.getPath());
			dispatcher.forward(request, response);
			
		}
	}
	

	
	
	
	}

}
