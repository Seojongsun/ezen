package review.review.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import review.review.dao.ReviewDAO;
import review.handler.HandlerAdapter;
import review.control.Controller;

public class ReviewSearchController implements Controller {

	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession( );
		String keyword = (String) session.getAttribute("keyword");
		String keyfield = (String) session.getAttribute("keyfield");
		HandlerAdapter handlerAdapter = new HandlerAdapter( );
		ReviewDAO reviewDAO = new ReviewDAO( );
		List<?> searchReviewlist = new ArrayList<Object>( );

		int page = 1;
		int limit = 10;

		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		
		int searchlistcount = reviewDAO.reviewSearchCount(keyword, keyfield);
		searchReviewlist = reviewDAO.reviewSearch(keyword, keyfield, page, limit);
		int maxpage = (int) ((double) searchlistcount / limit + 0.95);
		int startpage = (((int) ((double) page / 10 + 0.9)) - 1) * 10 + 1;
		int endpage = startpage + 10 - 1;
		if(endpage > maxpage) {
			endpage = maxpage;
		}
		request.setAttribute("page", page);
		request.setAttribute("maxpage", maxpage);
		request.setAttribute("startpage", startpage);
		request.setAttribute("endpage", endpage);
		request.setAttribute("searchlistcount", searchlistcount);
		request.setAttribute("searchReviewlist", searchReviewlist);
		request.setAttribute("keyword", keyword);
		request.setAttribute("keyfield", keyfield);

//		 handlerAdapter.setRedirect(false);
		handlerAdapter.setPath("/WEB-INF/view/review/review_search_view.jsp");
		return handlerAdapter;
	}
}
