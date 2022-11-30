package review.servicecenter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import review.control.Controller;
import review.handler.HandlerAdapter;

public class Service_Center_Controller implements Controller{

	@Override
	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		HandlerAdapter handlerAdapter = new HandlerAdapter();
		handlerAdapter.setPath("/WEB-INF/view/service-center/service_center.jsp");
		return handlerAdapter;
	}
	
	

}
