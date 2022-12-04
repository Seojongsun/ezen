package review.review.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import review.control.Controller;
import review.handler.HandlerAdapter;
import review.review.dao.ReviewDAO;
import review.review.dto.ReviewDTO;

public class ReviewUpdateDetailController implements Controller{
	private static Log log = LogFactory.getLog(ReviewUpdateDetailController.class);

	@Override
	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
	
		HandlerAdapter handlerAdapter = new HandlerAdapter( );
		ReviewDAO reviewdDAO = new ReviewDAO( );
		ReviewDTO reviewDTO = new ReviewDTO( );

		int reviewNumber = Integer.parseInt(request.getParameter("reviewNumber"));
		// 수정할 글 번호를 반환하여 deptDTO 인스턴스로 할당하고 할당하지 않으면 null 값이 반환된다.
		reviewDTO = reviewdDAO.reviewSelectDetail(reviewNumber);
		log.info("DTO 확인 - " + reviewDTO);
		
		// 속성에 DTO 객체를 속성값으로 저장한다.
		request.setAttribute("reviewDTO", reviewDTO);
		// 포워드로 파라미터를 전송한다.
		handlerAdapter.setPath("/WEB-INF/view/review/review_update.jsp");
		return handlerAdapter;
	}

}
