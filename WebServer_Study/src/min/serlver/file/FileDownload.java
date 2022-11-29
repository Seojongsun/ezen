package min.serlver.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebServlet("/FileDownload")
public class FileDownload extends HttpServlet {
	

private static Log log = LogFactory.getLog(FileDownload.class);
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String fileName = request.getParameter("file_name");
	String savePath = "./upload";
	
	// 실행 중인 servletContext 인터페이스에 대한 참조를 반환하고 서블릿이 서블릿 컨테이너와 통신하는데 사용하는 메소드를 정의한다.
	ServletContext servletContext = request.getServletContext();
	
	//주어진 가상 경로에 대한 웹 서버 실제 파일 시스템의 경로인 실제 경로를 포함하는 문자열을 반환하고 할당한다.
	String downloadPath = servletContext.getRealPath(savePath);
	
	//다운로드 시에 사용할 실제 경로를 설정한다.
	String filePath = downloadPath + "\\" + fileName;
	
	//임시 기억 장소로 한번에 보낼 수 있는 4kb의 크기를 설정한다.
	byte b[] = new byte[4096];
	File file = new File(filePath);
	
	if (file.exists()) {
		
		//파일 시스템의 경로명으로 명명된 파일의 실제 파일에 대한 연결을 열어 객체를 생성하고 할당한다.
		FileInputStream fileInputStream = new FileInputStream(filePath);
		
		//서버에 존재하는 파일의 mime 타입을 문자열로 반환하고 할당한다.
		String downType = getServletContext().getMimeType(filePath);
		log.info("다운로드 자료형 호ㅘㄱ인 : " + downType);
		
		if (downType == null) {
			
			//8bit로 된 일련의 데이터로 이진 파일을 위한 기본값으로 실제로 잘 알려지지 않은 이진 파일을 의미한다.
			downType = "application/octet-stream";
			response.setContentType(downType);
		}
		
		boolean MSIE = false;
		
		//익스 플로러의 버전을 확인한다.
		
		MSIE = (request.getHeader("user-agent").indexOf("MSIE")!=-1) || (request.getHeader("user-agent").indexOf("Trident")!=-1);
		
		String encoding = null;
		
		if (MSIE) {
			
			//익스플로러의 다운로드할 파일 이름에 대한 공백을 처리한다.
			encoding = new String(fileName.getBytes("EUC-KR"), "ISO-8859-1").replaceAll("\\+", "%20");
			
		} else {
			
			//한글 인코딩 처리를 한다.
			encoding = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
			
		}
		
		// 익스플로러의 다운로드 창이 뜨도록 설정한다.
		response.setHeader("Content-Disposition", "attachment;filename=\"" + encoding + "\"");
		
		//출력 스트림으로부터 데이터를 byte 단위로 클라이언트로 출력한다.
		ServletOutputStream servletOutputStream = response.getOutputStream();
		
		int numRead;
		
		//0번부터 베열 객체를 크기로 웹 브라우저로 출력한다.
		while ((numRead = fileInputStream.read(b, 0, b.length)) != -1) {
			
			//버퍼의 길이만큼 데이터를 채운다.
			servletOutputStream.write(b, 0, numRead);
			
			
		}
		
		servletOutputStream.flush();
		servletOutputStream.close();
		fileInputStream.close();
	
	}
	
	
	}

}
