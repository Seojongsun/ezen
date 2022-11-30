package review.index.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import review.control.Controller;
import review.handler.HandlerAdapter;

public class IndexController implements Controller{

	@Override
	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		return null;
	//	HandlerAdapter handlerAdapter = new HandlerAdapter();
	//	handlerAdapter.setPath("/index.jsp");
//		return handlerAdapter;
		
	//	request.setAttribute("id", memberDTO.getId( ));
		//HandlerAdapter handlerAdapter = new HandlerAdapter( );
		//handlerAdapter.setPath("./view/member/member_insert_view.jsp");
		//return handlerAdapter;
	}
	

}
