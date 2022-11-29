package review.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import review.member.dto.MemberDTO;
import review.member.service.MemberService;

public class MemberDAO implements MemberService{

	

private static Log log = LogFactory.getLog(MemberDAO.class);
	
	@Override
	public ArrayList<MemberDTO> memberSelectAll(int page, int limit) {
		ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>();
		int startrow = (page - 1) * 10 + 1;
		int endrow = startrow + limit -1;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		Context context;
		try {
			context = new InitialContext();
		DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/review");
		connection = dataSource.getConnection();
		
		
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}





	@Override
	public MemberDTO memberInsert(MemberDTO memberDTO) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Context context = new InitialContext( );
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/review");
			connection = dataSource.getConnection( );
			String sql = "insert into member(id, name, password, gender, age, birthday, email, num) ";
			sql += " values (?, ?, ?, ?, ?, to_date(?, 'yyyy-mm-dd'), ?, ?)";
			log.info("SQL - " + sql);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getId( ));
			preparedStatement.setString(2, memberDTO.getName( ));
			preparedStatement.setString(3, memberDTO.getPassword( ));
			preparedStatement.setString(4, memberDTO.getGender( ));
			preparedStatement.setInt(5, memberDTO.getAge( ));
			preparedStatement.setString(6, memberDTO.getBirthday( ));
			preparedStatement.setString(7, memberDTO.getEmail( ));
			preparedStatement.setInt(8, memberDTO.getNum( ));
			int count = preparedStatement.executeUpdate( );
			log.info("입력 데이터 확인 - " + memberDTO);
			if(count > 0) {
				connection.commit( );
				log.info("커밋되었습니다.");
			} else {
				connection.rollback( );
				log.info("롤백되었습니다.");
			}
		} catch(Exception e) {
			log.info("회원 가입 실패 - " + e);
		} finally {
			try {
				connection.close( );
				preparedStatement.close( );
			} catch(Exception e) {
				e.printStackTrace( );
			}
		}
		return memberDTO;
	}

	@Override
	public MemberDTO memberUpdate(MemberDTO memberDTO) {
		return null;
	}

	@Override
	public MemberDTO memberDelete(MemberDTO memberDTO) {
		return null;
	}

	@Override
	public MemberDTO memberSelect(MemberDTO memberDTO) {
		return null;
	}

	@Override
	public ArrayList<MemberDTO> memberSearch(String keyword, int page, int limit) {
		return null;
	}

	@Override
	public int memberSearchCount(String keyword) {
		return 0;
	}

	@Override
	public MemberDTO memberLogin(MemberDTO memberDTO) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		Context context;
		try {
			context = new InitialContext();
		
		DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/review");
		connection = dataSource.getConnection();
		String sql = "select * from member ";
		sql += " where id = ? ";
		
		log.info("sql 확이니닌이니인이니 " + sql);
		
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, memberDTO.getId());
		
		resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			
			memberDTO.setName(resultSet.getString("name"));
			memberDTO.setId(resultSet.getString("id"));
			log.info("아이디  asdsad = " + resultSet.getString("id"));
			if (resultSet.getString("password").equals(memberDTO.getPassword())) {
				memberDTO.setPassword(resultSet.getString("password"));
				log.info("비밀번호 확인 - ㅡㅡㅡㅡㅡㅡㅡㅡ " + resultSet.getString("password"));
				
				
			} else {
				memberDTO.setPassword("");
			}
			
		}	else {
			memberDTO.setId("");
			
		}
		
		
		} catch (NamingException e) {
			log.info("로그인 실패 ㅡㅡㅡㅡㅡㅡ" + e);
		} catch (SQLException e) {
		} finally {
			
			try {
				resultSet.close();
			preparedStatement.close();
			connection.close();
			
			} catch (SQLException e) {
log.info("자원 해제 실패 " + e);
			}
		}
		
		return memberDTO;
	}

	@Override
	public int memberId(String id) {
		return 0;
	}
	
	@Override
	public int memberNumber( ) {
		int i = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			Context context = new InitialContext( );
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/review");
			connection = dataSource.getConnection( );
			String sql = "select max(num) from member";
			log.info("SQL 확인 - " + sql);
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery(sql);
			if(resultSet.next( )) {
				i = resultSet.getInt("max(num)");
			}
		} catch(Exception e) {
			log.info("최대 회원 번호 검색 실패 - " + e);
		} finally {
			try {
				resultSet.close( );
				preparedStatement.close( );
				connection.close( );
			} catch(Exception e) {
				e.printStackTrace( );
			}
		}
		return i;
	}
	
	@Override
	public int memberCount( ) {
		int i = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			Context context = new InitialContext( );
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/review");
			connection = dataSource.getConnection( );
			String sql = "select count(*) from member where id != 'admin'";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery( );
			if(resultSet.next( )) {
				i = resultSet.getInt(1);
			}
		} catch(Exception e) {
			log.info("현재 회원 수 검색 실패 - " + e);
		} finally {
			try {
				resultSet.close( );
				preparedStatement.close( );
				connection.close( );
			} catch(Exception e) {
				e.printStackTrace( );
			}
		}
		return i;
	}

	@Override
	public MemberDTO memberSearchId(String name, String email) {
		return null;
	}

	@Override
	public MemberDTO memberSearchPassword(String id, String email) {
		return null;
	}

	
}
