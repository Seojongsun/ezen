package review.review.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import review.control.Controller;
import review.handler.HandlerAdapter;
import review.review.dao.ReviewDAO;

public class ReviewDeleteController implements Controller {
	
	

private static Log log = LogFactory.getLog(ReviewDeleteController.class);

	@Override
	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		
		HandlerAdapter handlerAdapter = new HandlerAdapter( );

		boolean result = false;
		boolean usercheck = false;
		String id = request.getParameter("id");
		int reviewNumber = Integer.parseInt(request.getParameter("reviewNumber"));
		ReviewDAO reviewDAO = new ReviewDAO( );

		usercheck = reviewDAO.reviewId(reviewNumber, id);

		if(usercheck == false) {
			handlerAdapter.setPath("/WEB-INF/view/review/review_delete.jsp");
			return handlerAdapter;
		}
		// 게시글 삭제를 처리한다.
		result = reviewDAO.reviewDelete(reviewNumber);
		log.info("게시글 삭제 확인 - " + result);

		// 리다이렉트로 파라미트를 전송한다.
		handlerAdapter.setRedirect(true);
		handlerAdapter.setPath("./ReviewSelect.do");
		return handlerAdapter;

	}

}
