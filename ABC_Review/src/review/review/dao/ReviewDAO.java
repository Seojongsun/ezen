package review.review.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import review.review.dto.ReviewDTO;
import review.review.service.ReviewService;

public class ReviewDAO implements ReviewService{
	

private static Log log = LogFactory.getLog(ReviewDAO.class);

	@Override
	public List<ReviewDTO> reviewSelect(int page, int limit) {
		
		List<ReviewDTO> list = new ArrayList<ReviewDTO>();
		
		int startrow = (page - 1 ) + 10 + 1;
		
		int endrow = startrow + limit - 1;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			Context context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/review");
			connection = dataSource.getConnection();
			
			String sql = " select * from review ";
			
			log.info("SQL 확인 - " + sql);
			
			preparedStatement = connection.prepareStatement(sql);
//			preparedStatement.setInt(1, startrow);
//			preparedStatement.setInt(2, endrow);
			resultSet = preparedStatement.executeQuery( );
			
			while(resultSet.next( )) {
				ReviewDTO reviewDTO = new ReviewDTO( );
				reviewDTO.setReviewNumber(resultSet.getInt("reviewNumber"));
				reviewDTO.setReviewContent(resultSet.getString("reviewContent"));
//				reviewDTO.setOrderNumber(resultSet.getInt("orderNumber"));
//				reviewDTO.setUserId(resultSet.getString("id"));
//				reviewDTO.setReviewDate(resultSet.getString("reviewDate"));
//				reviewDTO.setRating(resultSet.getString("rating"));
//				reviewDTO.setColorReview(resultSet.getString("sizeReview"));
//				reviewDTO.setColorReview(resultSet.getString("colorReview"));
//				reviewDTO.setColorReview(resultSet.getString("footballReview"));
//				reviewDTO.setInstepReview(resultSet.getString("instepReview"));
//				reviewDTO.setReviewFile(resultSet.getByte("reviewFile"));
				list.add(reviewDTO);
				
				log.info("reviewDTO ---------- " + reviewDTO);
			
			
			
			
			}
			return list;
			
		} catch (Exception e) {
			log.info("리뷰 목록보기 실패 - " + e);
		} finally {
			try {
				resultSet.close( );
				preparedStatement.close( );
				connection.close( );
				
			
		} catch (SQLException e) {
			log.info("리뷰 목록보기 실패 2 - " + e);
		}
		}
	
		return null;
	}

	@Override
	public boolean reviewInsert(ReviewDTO reviewDTO) {
		
		int reviewNumber = 0;
		String sql = "";
		int result = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Context context = new InitialContext( );
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/review");
			connection = dataSource.getConnection( );
			
			
			sql = "select max(reviewNumber) from review ";
			log.info("SQL 확인 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ " + sql);
			
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				reviewNumber = resultSet.getInt(1) + 1;
				
			} else {
				reviewNumber = 1;
			} 
			
			preparedStatement.close( );
			
			sql = " INSERT INTO review( reviewnumber, reviewcontent )  ";
			sql += "  VALUES ( ?, ? ) " ;
			log.info("SQL 확인 - " + sql);
			

			
			
			
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, reviewNumber);
			preparedStatement.setString(2, reviewDTO.getReviewContent());
//			preparedStatement.setByte(3, reviewDTO.getReviewFile());
			result = preparedStatement.executeUpdate();
			
//			preparedStatement = connection.prepareStatement(sql);
//			
//			preparedStatement.setInt(1, reviewNumber);
//			preparedStatement.setInt(2, 0);
//			preparedStatement.setString(3, reviewDTO.getRating());
//			preparedStatement.setString(4, reviewDTO.getSizeReview());
//			preparedStatement.setString(5, reviewDTO.getColorReview());
//			preparedStatement.setString(6, reviewDTO.getFootballReview());
//			preparedStatement.setString(7, reviewDTO.getInstepReview());
//			preparedStatement.setString(8, reviewDTO.getReviewContent());
//			preparedStatement.setByte(9, reviewDTO.getReviewFile());
			
			
			
			
			if(result == 0) {
				return false;
			}
			return true;
		} catch(Exception e) {
			log.info("글 등록 실패 - " + e);
		} finally {
			try {
				resultSet.close( );
				preparedStatement.close( );
				connection.close( );
			} catch(SQLException e) {
				e.printStackTrace( );
			}
		}
		return false;
	}

	@Override
	public boolean reviewUpdate(ReviewDTO reviewDTO) {
		return false;
	}

	@Override
	public boolean reviewDelete(int reviewNumber) {
		
		int result = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Context context = new InitialContext( );
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/review");
			connection = dataSource.getConnection( );
			String sql = " delete from review where reviewNumber = ? ";
			log.info("SQL 확인 - " + sql);
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, reviewNumber);
			result = preparedStatement.executeUpdate( );

			if(result == 0) {
				return false;

			}
		} catch(Exception e) {
			log.info("글 삭제 실패 - " + e);
		} finally {
			try {
				preparedStatement.close( );
				connection.close( );
			} catch(SQLException e2) {
				e2.printStackTrace( );
			}
		}

		return false;
	}

	@Override
	public ReviewDTO reviewSelectDetail(int reviewNumber) {
		
		ReviewDTO reviewDTO = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		Context context;
		try {
			context = new InitialContext( );
	
		DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/review");
		connection = dataSource.getConnection( );
		
		String sql = " select reviewNumber, reviewContent from review";
		sql += " where reviewNumber = ? ";
		
		log.info("SQL 확인 ㅡㅡㅡ " + sql);
		
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, reviewNumber);
		resultSet = preparedStatement.executeQuery( );
		
		if(resultSet.next( )) {
			reviewDTO = new ReviewDTO( );
			reviewDTO.setReviewNumber(resultSet.getInt("reviewNumber"));
			reviewDTO.setReviewContent(resultSet.getString("reviewContent"));
//			boardDTO.setName(resultSet.getString("name"));
//			boardDTO.setSubject(resultSet.getString("subject"));
//			boardDTO.setContent(resultSet.getString("content"));
//			boardDTO.setAttachedfile(resultSet.getString("attachedfile"));
//			boardDTO.setAnswernum(resultSet.getInt("answernum"));
//			boardDTO.setAnswerlev(resultSet.getInt("answerlev"));
//			boardDTO.setAnswerseq(resultSet.getInt("answerseq"));
//			boardDTO.setReadcount(resultSet.getInt("readcount"));
//			boardDTO.setWriteday(resultSet.getString("writeday"));
//			boardDTO.setId(resultSet.getString("id"));
		}
		return reviewDTO;
		
		
		} catch (NamingException e) {
			log.info("글 내용 보기 실패 - " + e);
		} catch (SQLException e) {
			log.info("글 내용 보기 실패2 - " + e);
		} finally {
			
		
		try {
			resultSet.close( );
		preparedStatement.close( );
		connection.close( );
		
		} catch (SQLException e) {
			log.info("글 내용 보기 실패 3 - " + e);
		}
		}
		return null;
	}

	@Override
	public int reviewCount() {
		int i = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			Context context = new InitialContext( );
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/review");
			connection = dataSource.getConnection( );
			// 모든 행의 개수를 조회한다.
			String sql = "select count(*) from review";
			log.info("SQL 확인 - " + sql);
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery( );
			if(resultSet.next( )) {
				// 첫 번째 결과값인 카운트 개수를 int 자료형으로 할당한다.
				i = resultSet.getInt(1);
			}
		} catch(Exception e) {
			log.info("글 개수 구하기 실패 - " + e);
		} finally {
			try {
				resultSet.close( );
				preparedStatement.close( );
				connection.close( );
			} catch(SQLException e) {
				e.printStackTrace( );
			}
		}
		return i;
	}
	
	@Override
	public void reviewHitNumber(int reviewNumber) {
		return;
	}

	@Override
	public int reviewReply(ReviewDTO reviewDTO) {
		return 0;
	}

	@Override
	public boolean reviewId(int reviewNum, String id) {
		return false;
	}

	@Override
	public List<?> reviewSearch(String keyword, String keyfield, int page, int limit) {
		return null;
	}

	@Override
	public int reviewSearchCount(String keyword, String keyfield) {
		return 0;
	}

	


	
	
	
	
	

}
