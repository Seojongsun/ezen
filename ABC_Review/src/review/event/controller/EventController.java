package review.event.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import review.control.Controller;
import review.handler.HandlerAdapter;

public class EventController implements Controller {

	@Override
	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		
		HandlerAdapter handlerAdapter = new HandlerAdapter();
		handlerAdapter.setPath("/WEB-INF/view/event/event.jsp");
		return handlerAdapter;
	}
	
	

}
