package review.mypage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import review.control.Controller;
import review.handler.HandlerAdapter;

public class OrderShippingController implements Controller {

	@Override
	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		HandlerAdapter handlerAdapter = new HandlerAdapter();
		handlerAdapter.setPath("./WEB-INF/view/mypage/mypage_order_shipping.jsp");
		return handlerAdapter;
	}

}
