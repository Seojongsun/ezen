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
import review.review.controller.ReviewInsertController;
import review.review.controller.ReviewSelectController;

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
				handlerAdapter.setPath("/WEB-INF/view/mypage/mypage.jsp");
				log.info("마이페이지 화면 - " + handlerAdapter);
			
				
			} else if (pathURI.equals("/Myreview.do")) {
//				controller = new MyReviewController( );
//				handlerAdapter = controller.execute(request, response);
				
				handlerAdapter = new HandlerAdapter();
				handlerAdapter.setPath("/WEB-INF/view/mypage/mypage_myreview.jsp");
				log.info("나의 상품 후기 화면 - " + handlerAdapter);
				

			}				 else if (pathURI.equals("/OrderShipping.do")) {
//				controller = new OrderShippingController( );
//				handlerAdapter = controller.execute(request, response);
				
				handlerAdapter = new HandlerAdapter();
				handlerAdapter.setPath("/WEB-INF/view/mypage/mypage_order_shipping.jsp");
				log.info("주문 / 배송현황 조회 화면 - " + handlerAdapter);
				
				
			// =========== 리뷰 관련 ================	
				
			}				 else if (pathURI.equals("/ReviewSelect.do")) {
				controller = new ReviewSelectController( );
				handlerAdapter = controller.execute(request, response);
//				handlerAdapter = new HandlerAdapter();
//				handlerAdapter.setPath("./WEB-INF/view/review/review_select.jsp");
				log.info(" 리뷰 전체 조회 페이지 - " + handlerAdapter);
				
			}				 else if (pathURI.equals("/ReviewSelectDetail.do")) {
//				controller = new OrderShippingController( );
//				handlerAdapter = controller.execute(request, response);
				handlerAdapter = new HandlerAdapter();
				handlerAdapter.setPath("./WEB-INF/view/review/review_select_detail.jsp");
				log.info(" 리뷰 상세 조회 페이지 - " + handlerAdapter);
				
		
			
			
			
			}				 else if (pathURI.equals("/ReviewInsert.do")) {
//				controller = new OrderShippingController( );
//				handlerAdapter = controller.execute(request, response);
				handlerAdapter = new HandlerAdapter();
				handlerAdapter.setPath("/WEB-INF/view/review/review_insert.jsp");
				log.info(" 리뷰 작성 페이지 - " + handlerAdapter);
				
			}				 else if (pathURI.equals("/ReviewInsertView.do")) {
				controller = new ReviewInsertController( );
				handlerAdapter = controller.execute(request, response);
//				handlerAdapter = new HandlerAdapter();
//				handlerAdapter.setPath("./WEB-INF/view/review/review_insert_view.jsp");
				log.info(" 리뷰 작성 결과 페이지 - " + handlerAdapter);
				
		
			
			
			}				 else if (pathURI.equals("/ReviewUpdate.do")) {
//				controller = new OrderShippingController( );
//				handlerAdapter = controller.execute(request, response);
				handlerAdapter = new HandlerAdapter();
				handlerAdapter.setPath("/WEB-INF/view/review/review_update.jsp");
				log.info(" 리뷰 수정 페이지 - " + handlerAdapter);
				
			}				 else if (pathURI.equals("/ReviewUpdateView.do")) {
//				controller = new OrderShippingController( );
//				handlerAdapter = controller.execute(request, response);
				handlerAdapter = new HandlerAdapter();
				handlerAdapter.setPath("/WEB-INF/view/review/review_update_view.jsp");
				log.info(" 리뷰 수정 결과 페이지 - " + handlerAdapter);
				
			}				 else if (pathURI.equals("/ReviewDelete.do")) {
//				controller = new OrderShippingController( );
//				handlerAdapter = controller.execute(request, response);
				handlerAdapter = new HandlerAdapter();
				handlerAdapter.setPath("/WEB-INF/view/review/review_delete.jsp");
				log.info(" 리뷰 삭제 페이지 - " + handlerAdapter);
				
			}				 else if (pathURI.equals("/ReviewDeleteView.do")) {
//				controller = new OrderShippingController( );
//				handlerAdapter = controller.execute(request, response);
				handlerAdapter = new HandlerAdapter();
				handlerAdapter.setPath("/WEB-INF/view/review/review_delete_view.jsp");
				log.info(" 리뷰 삭제 결과 페이지 - " + handlerAdapter);
				
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

			
		

