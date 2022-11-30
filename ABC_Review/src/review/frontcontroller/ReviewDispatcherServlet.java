package review.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import review.control.Controller;
import review.handler.HandlerAdapter;
import review.mypage.controller.MyReviewController;
import review.mypage.controller.OrderShippingController;

public class ReviewDispatcherServlet extends HttpServlet implements Servlet{

		private static final long serialVersionUID = 1L;
		private static Log log = LogFactory.getLog(ReviewDispatcherServlet.class);

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
			
			log.info("pathURI 확인 ---- " + pathURI);
			
			
			
			if(pathURI.equals("/Mypage.do")) {
//				controller = new MyReviewController( );
//				handlerAdapter = controller.execute(request, response);
		
				handlerAdapter = new HandlerAdapter();
				handlerAdapter.setPath("./WEB-INF/view/mypage/mypage.jsp");
				log.info("마이페이지 화면 - " + handlerAdapter);
			
				
			} else if (pathURI.equals("/Myreview.do")) {
//				controller = new MyReviewController( );
//				handlerAdapter = controller.execute(request, response);
				
				handlerAdapter = new HandlerAdapter();
				handlerAdapter.setPath("./WEB-INF/view/mypage/mypage_myreview.jsp");
				log.info("나의 상품 후기 화면 - " + handlerAdapter);
				

			}				 else if (pathURI.equals("/OrderShipping.do")) {
//				controller = new OrderShippingController( );
//				handlerAdapter = controller.execute(request, response);
				
				handlerAdapter = new HandlerAdapter();
				handlerAdapter.setPath("./WEB-INF/view/mypage/mypage_order_shipping.jsp");
				log.info("주문 / 배송현황 조회 화면 - " + handlerAdapter);
				
			}
				
				

				if(handlerAdapter != null) {
					if(handlerAdapter.isRedirect( )) {
						response.sendRedirect(handlerAdapter.getPath( ));
					} else {
						RequestDispatcher dispatcher = request.getRequestDispatcher(handlerAdapter.getPath( ));
						dispatcher.forward(request, response);
					}
				}
			}
		}

			
		

