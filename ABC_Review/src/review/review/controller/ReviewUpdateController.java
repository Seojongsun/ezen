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

public class ReviewUpdateController implements Controller{
	private static Log log = LogFactory.getLog(ReviewUpdateController.class);
	
	
		@Override
		public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
			HandlerAdapter handlerAdapter = new HandlerAdapter( );

			ReviewDAO reviewDAO = new ReviewDAO( );
			ReviewDTO reviewDTO = new ReviewDTO( );
			boolean result = true;

			String realFolder = "";
			String saveFolder = "./reviewUpload";

			int fileSize = 10 * 1024 * 1024;

			realFolder = request.getSession( ).getServletContext( ).getRealPath(saveFolder);

			try {
				MultipartRequest multipartRequest = new MultipartRequest(request, realFolder, fileSize, "UTF-8",
				  new DefaultFileRenamePolicy( ));
				// 글의 비밀번호와 수정 페이지에서 입력한 비밀번호가 일치하는지 확인한다.
				int reviewNumber = Integer.parseInt(multipartRequest.getParameter("reviewNumber"));
				// 글의 비밀번호와 수정 페이지에서 입력한 비밀번호가 일치하는지 확인한다.
//				boolean usercheck = reviewDAO.reviewId(reviewNumber, multipartRequest.getParameter("password"));
				
//				if(usercheck == false) {
//					handlerAdapter.setPath("./WEB-INF/view/review/review_update_view.jsp");
//					return handlerAdapter;
//				}

				reviewDTO.setReviewNumber(reviewNumber);
				reviewDTO.setReviewContent(multipartRequest.getParameter("reviewContent"));

				
				//				reviewDTO.setReviewFile(multipartRequest.getFilesystemName((String) multipartRequest.getFileNames( ).nextElement( )));
				// 업로드한 파일의 이전 이름을 설정한다.

				result = reviewDAO.reviewUpdate(reviewDTO);
				log.info("게시글 수정 확인 - " + result);
				
				// 리다이렉트로 파라미트를 전송한다.
				handlerAdapter.setRedirect(true);
				handlerAdapter.setPath("./ReviewSelectDetail.do?reviewNumber=" + reviewDTO.getReviewNumber( ));
				return handlerAdapter;
			} catch(Exception e) {
				e.printStackTrace( );
			}

			return null;
		}

	}
