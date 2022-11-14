package fiter.min.characterset;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
//어노테이션으로 필터의 적용 범위를 설정하고 URL . 상에서 요청되는 필터 매핑명을 설정하여 모든 범위에서 매핑한다
@WebFilter("/*")
public class Fiter implements Filter {
// 웹 컨테이너에서 호출되어 서비스에서 제외되고 있음을 필터에 표시하고 필터 객체를 제거한다.
public void destroy( ) {
}
// 자원에 대한 클라이언트 요청으로 인해 요청과 응답이 체인을 통해 전달될 때마다 컨테이너에 의해 호출된다.
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
ServletException {
//파라미터의 한글 처리를 위해 인코딩의 문자셋을 설정한다.
request.setCharacterEncoding("UTF-8");
//체인의 다음 필터가 호출되도록 하거나 호출 필터가 체인의 마지막 필터인 경우 체인의 끝에 있는 자원이 호출된다.
chain.doFilter(request, response);
}
// 웹 컨테이너에 의해 호출되어 서비스에 배치되고 있음을 필터에 표시하고 필터를 초기화한다.
public void init(FilterConfig fConfig) throws ServletException {
}
}