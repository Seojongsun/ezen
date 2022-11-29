package a.b.c;

import java.io.IOException;

import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport{
	

	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() {
		
		try {
			pageContext.getOut().println("커스텀 태그 생성");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return SKIP_BODY;
		
		
		
	}
	
	
	
	
	
	
	

}
