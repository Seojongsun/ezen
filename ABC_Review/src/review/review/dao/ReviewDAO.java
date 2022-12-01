package review.review.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
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
//				reviewDTO.setReviewNumber(resultSet.getInt("reviewNumber"));
//				reviewDTO.setOrderNumber(resultSet.getInt("orderNumber"));
//				reviewDTO.setUserId(resultSet.getString("id"));
//				reviewDTO.setReviewDate(resultSet.getString("reviewDate"));
//				reviewDTO.setRatings(resultSet.getInt("ratings"));
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
			
			
			preparedStatement = connection.prepareStatement(sql);
			
			sql = " INSERT INTO review( reviewnumber, reviewcontent )  ";
			sql += "  VALUES ( 2, ? ) " ;
			
			

//			sql = "select max(reviewNum) from review";
//			log.info("SQL 확인 - " + sql);
			
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery( );
//			if(resultSet.next( )) {
//				reviewNumber = resultSet.getInt(1) + 1;
//
//			} else {
//				reviewNumber = 1;
//			}
			// 사전 컴파일된 SQL 문을 실행하고 생성된 결과를 반환하는 데 사용된 객체에 대한 자원 해제를 한다.
//			preparedStatement.close( );
//			sql = "insert into board (num, name, password, subject, content, attachedfile,";
//			sql += "answernum, answerlev, answerseq, readcount, writeday, id)";
//			sql += " values(?,?,?,?,?,?,?,?,?,?,sysdate,?)";
//			preparedStatement.setInt(2, orderNumber);
//			preparedStatement.setString(3, id);
			
//			sql = " insert into review reviewNumber ";
//			sql += " values ( ? )";
			
//			sql = " insert into review (reviewNumber, reviewDate, "
//					+ "rating, sizeReview, colorReview, "
//					+ "footballReview, instepReview, reviewFile ) ";
//			
//			sql += " values (?, sysdate, ?, ?, ?, ?, ?, ?)";
			
			log.info("SQL 확인 - " + sql);
			preparedStatement.setInt(1, reviewDTO.getReviewNumber());
			preparedStatement.setString(2, reviewDTO.getReviewContent());
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
			
			result = preparedStatement.executeUpdate( );
//			if(result == 0) {
//				return false;
//			}
//			return true;
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
	public boolean reviewDelete(int reviewNum) {
		return false;
	}

	@Override
	public ReviewDTO reviewSelectDetail(int reviewNum) {
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
	public int boardReply(ReviewDTO reviewDTO) {
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
