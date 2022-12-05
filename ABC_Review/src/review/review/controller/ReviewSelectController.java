package review.review.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import review.control.Controller;
import review.handler.HandlerAdapter;
import review.review.dao.ReviewDAO;

public class ReviewSelectController implements Controller{
private static Log log = LogFactory.getLog(ReviewSelectController.class);

@Override
public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
	
	ReviewDAO reviewDAO = new ReviewDAO();
	
	List<?> reviewList = new ArrayList<Object>();
	
	int page = 1;
	

	
	int limit = 10;
	
	
	
	if (request.getParameter("page" ) != null) {
		page = Integer.parseInt(request.getParameter("page"));
	}
	
	int listcount = reviewDAO.reviewCount();
	
	reviewList = reviewDAO.reviewSelect(page, limit);
	log.info("글 조회 확인 - " + reviewList);
	int maxpage = (int) ((double) listcount / limit + 0.95);
	
	System.out.println("5555555555555555555555555 " + maxpage);
		
	
	int startpage = (((int) ((double) page / 10 + 0.9)) - 1) * 10 + 1;
	
	System.out.println("66666666666666666666666666 " + startpage);
	
	int endpage = startpage + 10 - 1;
	
	System.out.println("1111111111111111111177777777777777177333 " + endpage);
	
	if(endpage > maxpage) {
		endpage = maxpage;
	}
	request.setAttribute("page", page);
	request.setAttribute("maxpage", maxpage);
	request.setAttribute("startpage", startpage);
	request.setAttribute("endpage", endpage);
	request.setAttribute("listcount", listcount);
	request.setAttribute("reviewList", reviewList);
	
	HandlerAdapter handlerAdapter = new HandlerAdapter();
	
	handlerAdapter.setPath("WEB-INF/view/review/review_select.jsp");
	
	
	
	return handlerAdapter;
}



}
