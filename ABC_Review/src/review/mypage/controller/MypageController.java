package review.mypage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import review.control.Controller;
import review.handler.HandlerAdapter;

public class MypageController implements Controller {

	@Override
	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		HandlerAdapter handlerAdapter = new HandlerAdapter();
		handlerAdapter.setPath("/WEB-INF/view/mypage/mypage.jsp");
		return handlerAdapter;
	}

}
