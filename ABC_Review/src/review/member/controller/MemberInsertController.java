package review.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import review.member.dao.MemberDAO;
import review.member.dto.MemberDTO;
import review.control.Controller;
import review.handler.HandlerAdapter;

public class MemberInsertController implements Controller{
	

private static Log log = LogFactory.getLog(MemberInsertController.class);

@Override
public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
	String id = request.getParameter("id");
	log.info("id임"+id);
	String name = request.getParameter("name");
	log.info("nname임"+name);
	String password = request.getParameter("password");
	log.info("pass임"+password);
	String gender = request.getParameter("gender");
	log.info("gen임"+gender);
	int age = Integer.parseInt(request.getParameter("age"));
	log.info("age임"+age);
	String birthday = request.getParameter("birthday");
	log.info("b임"+birthday);
	String email = request.getParameter("email");
	log.info("E임"+email);
	MemberDTO memberDTO = new MemberDTO( );
	MemberDAO memberDAO = new MemberDAO( );
	int num = memberDAO.memberNumber( );
	memberDTO.setNum(num + 1);
	memberDTO.setId(id);
	memberDTO.setName(name);
	memberDTO.setPassword(password);
	memberDTO.setGender(gender);
	memberDTO.setAge(age);
	memberDTO.setBirthday(birthday);
	memberDTO.setEmail(email);
	log.info(memberDTO);
	memberDTO = memberDAO.memberInsert(memberDTO);
	request.setAttribute("id", memberDTO.getId( ));
	HandlerAdapter handlerAdapter = new HandlerAdapter( );
	handlerAdapter.setPath("./view/member/member_insert_view.jsp");
	return handlerAdapter;
}

}