package review.cart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import review.control.Controller;
import review.handler.HandlerAdapter;

public class CartController implements Controller{

	@Override
	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		
		HandlerAdapter handlerAdapter = new HandlerAdapter();
		handlerAdapter.setPath("/WEB-INF/view/cart/cart.jsp");
		return handlerAdapter;
		
		
		

	}

}
