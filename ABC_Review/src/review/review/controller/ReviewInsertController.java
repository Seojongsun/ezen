package review.review.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import review.control.Controller;
import review.handler.HandlerAdapter;
import review.review.dao.ReviewDAO;
import review.review.dto.ReviewDTO;

public class ReviewInsertController implements Controller {


private static Log log = LogFactory.getLog(ReviewInsertController.class);
	
	@Override
	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		
		
		ReviewDTO reviewDTO = new ReviewDTO();
		ReviewDAO reviewDAO = new ReviewDAO();
		HandlerAdapter handlerAdapter = new HandlerAdapter();
		String realFolder = "";
		String saveFolder = "./reviewUpload";
		
		realFolder = request.getSession().getServletContext().getRealPath(saveFolder);
		int fileSize = 10 * 1024 * 1024;
		boolean result = false;
		
		try {
			MultipartRequest multipartRequest = 
					new MultipartRequest(request, realFolder, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		
//			reviewDTO.setRating(multipartRequest.getParameter("rating"));
//			reviewDTO.setSizeReview(multipartRequest.getParameter("sizeReview"));
//			reviewDTO.setColorReview(multipartRequest.getParameter("colorReview"));
//			reviewDTO.setColorReview(multipartRequest.getParameter("footballReview"));
//			reviewDTO.setInstepReview(multipartRequest.getParameter("instepReview"));
			
			
//			reviewDTO.setReviewNumber(multipartRequest.getParameter("reviewNumber"));
			reviewDTO.setReviewContent(multipartRequest.getParameter("reviewContent"));
			
//			reviewDTO.setReviewFile(multipartRequest.getFilesystemName((String) multipartRequest.getFileNames( ).nextElement( )));
			
			log.info("여기 찍어보자 ㅡㅡㅡㅡㅡㅡㅡ " + multipartRequest);
			
			result = reviewDAO.reviewInsert(reviewDTO);
			
			System.out.println("여기까지 못 옴?");
			
			log.info("DTO 확인 ㅡㅡㅡㅡㅡㅡㅡ " + reviewDTO);
			log.info("게시글 등록 ㅡㅡㅡㅡㅡㅡㅡ " + result);
			
			handlerAdapter.setRedirect(true);
			handlerAdapter.setPath("./ReviewInsert.do");
			
//			handlerAdapter.setPath("./ReviewInsertView.do");
//			로 했을 때  Posted content type isn't multipart/form-data 오류 발생
		return handlerAdapter;
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return null;

}
}
