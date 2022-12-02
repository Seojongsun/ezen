package review.review.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import review.control.Controller;
import review.handler.HandlerAdapter;
import review.review.dao.ReviewDAO;
import review.review.dto.ReviewDTO;

public class ReviewSelectDetailController implements Controller{


private static Log log = LogFactory.getLog(ReviewSelectDetailController.class);

	@Override
	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		
		ReviewDAO reviewDAO = new ReviewDAO( );
		ReviewDTO reviewDTO = new ReviewDTO( );
		
		int reviewNumber = Integer.parseInt(request.getParameter("reviewNumber"));
		
		reviewDAO.reviewHitNumber(reviewNumber);
		
		reviewDTO = reviewDAO.reviewSelectDetail(reviewNumber);
		
		log.info("reviewSelectDetail 확인 ㅡㅡㅡㅡ " + reviewDTO);
		
		request.setAttribute("reviewDTO", reviewDTO);
		
		HandlerAdapter handlerAdapter = new HandlerAdapter();
		handlerAdapter.setPath("/WEB-INF/view/review/review_select_detail.jsp");
		
		
		
		
		
		
		
		
				return handlerAdapter;
	}

}
